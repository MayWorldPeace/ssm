package dd.interview;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author ZhongChaoYuan
 * @create 2018-10-20 17:52
 **/
@SuppressWarnings("all")
public class IODemo {

    public static void main(String[] args) throws IOException {
        File inFile = new File("C:\\demo.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        boolean len;
        int num = 0;
        while ((len = br.readLine() != null)){
            num++;
            if (num == 2){
                System.out.println(len);
                return;
            }
        }
    }
}
