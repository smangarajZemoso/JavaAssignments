package assignments_11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadingFromFile {

    public static String convertWithIteration(Map<?, ?> map) {
        StringBuilder mapAsString = new StringBuilder("{ ");
        for (Object key : map.keySet()) {
            mapAsString.append(key + "=" + map.get(key) + ", ");
        }
        mapAsString.delete(mapAsString.length() - 2, mapAsString.length()).append(" }");
        return mapAsString.toString();
    }

    public static void main(String[] args) throws Exception {
        // pass the path to the file as a parameter
        FileReader fr = new FileReader("/home/soumyam/Documents/test.txt");
        int i;
        Map<Character, Integer> characterIntegerMap = new HashMap<Character, Integer>();
        while ((i = fr.read()) != -1) {
            if (characterIntegerMap.containsKey((char) i))
                characterIntegerMap.put((char) i, characterIntegerMap.get((char) i) + 1);
            else
                characterIntegerMap.put((char) i, 1);
        }
        String output = convertWithIteration(characterIntegerMap);
        try {
            File myObj = new File("/home/soumyam/Documents/test_output.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter myWriter = new FileWriter("/home/soumyam/Documents/test_output.txt");
            myWriter.write(output);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
} 