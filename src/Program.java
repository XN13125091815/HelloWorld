import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args)
    {
        //Java使用BufferedReader类从字符输入流中读取文本并缓冲字符，以便有效地读取字符，数组和行
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.println("HelloWorld!");
        try {
            //BufferedReader.readLine()方法从输入流流读取一行字符
            a = Integer.parseInt(br.readLine());
        }
        catch(IOException x){
            a = 0;
        }
        System.out.println(a);
    }
}
