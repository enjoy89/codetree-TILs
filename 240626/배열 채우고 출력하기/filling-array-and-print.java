import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String result = "";

        for(int i = str.length - 1; i >=0; i--) {
            result += str[i];
        }

        System.out.println(result);
        br.close();
    }
}