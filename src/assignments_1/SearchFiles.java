package assignments_1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SearchFiles {

    public static void main(String[] args) {
        System.out.println("Enter the Regular Expression to be matched in all folder and files of home directory");
        Scanner s1 = new Scanner(System.in);
        String matchPattern = s1.next();
        String homePath = "/home/soumyam/IdeaProjects";
        File homeDir = new File(homePath);
        if(homeDir.exists() && homeDir.isDirectory())
        {
            // array for files and sub-directories of directory pointed by homeDir
            File arr[] = homeDir.listFiles();
            System.out.println("Matched Patterned Files from main directory : " + homeDir);
            RecursiveDirectorySearch(arr,matchPattern,0,0);
        }
    }

    static void RecursiveDirectorySearch(File[] arr, String matchPattern, int index, int level)
    {
        // terminate condition
        if(index == arr.length)
            return;
        if(arr[index].isFile()) {
//            System.out.println(arr[index].getName());
//            System.out.println(arr[index].getAbsolutePath());
            checkFileMatch(arr[index],matchPattern);
        }
        // for sub-directories
        else if(arr[index].isDirectory())
        {
            // recursion for sub-directories
            RecursiveDirectorySearch(arr[index].listFiles(), matchPattern,0, level + 1);
        }
        // recursion for main directory
        RecursiveDirectorySearch(arr,matchPattern,++index, level);
    }

    static void checkFileMatch(File fileName, String matchPattern ) {
        boolean b2= Pattern.compile(matchPattern).matcher(fileName.getName()).matches();
        if (b2 == true) {
            System.out.println(fileName.getAbsolutePath());
        }
    }
}
