import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        double sum = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            int num = Integer.parseInt(arr[i]);

            if(num < 250) {
                sum += num;
                count++;
            } else {
                break;
            }        
        }

        System.out.println((int) sum + " " + String.format("%.1f", (sum / count)));

        br.close();
    }
}