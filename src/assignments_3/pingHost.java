package assignments_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class pingHost {

    static void sendPingRequest(ArrayList<String> commandList) throws Exception {
        // creating the sub process, execute system command
        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();
        // to read the output
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String s = null;
        ArrayList<Double> timeList = new ArrayList<>();
        System.out.println("Standard output: ");
        while ((s = input.readLine()) != null) {
            int a = s.indexOf("time=");
            int b = s.indexOf("ms");
            if (a != -1 && b != -1) {
                timeList.add(Double.valueOf(s.substring(a + 5, b - 1)));
            }
        }
        System.out.print("Median of time :");
        System.out.println(getMedian(timeList));
        System.out.println("error (if any): ");
        while ((s = Error.readLine()) != null) {
            System.out.println(s);
        }
    }

    static double getMedian(ArrayList list) {
        Collections.sort(list);
        int middle = list.size() / 2;
        middle = middle > 0 && middle % 2 == 0 ? middle - 1 : middle;
        return (double) list.get(middle);
    }

    public static void main(String[] args) throws Exception {
        String ipAddress = "www.google.com";
        ArrayList<String> commandList = new ArrayList<String>();
        commandList.add("ping");
        commandList.add("-c 5");
        commandList.add(ipAddress);
        sendPingRequest(commandList);
    }
}
