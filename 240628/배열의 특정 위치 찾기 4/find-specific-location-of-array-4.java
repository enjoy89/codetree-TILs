import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int count = 0;
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            int num = Integer.parseInt(arr[i]);

            if(num != 0) {
                if(num % 2 == 0) {
                    sum += num;
                    count++;
                }
            } else {
                break;
            }
        }

        System.out.println(count + " " + sum);

        br.close();
    }
}