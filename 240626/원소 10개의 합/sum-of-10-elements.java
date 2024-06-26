import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int sum = 0;

        for(String num : arr) {
            sum += Integer.parseInt(num);
        }

        System.out.println(sum);
        br.close();
    }
}