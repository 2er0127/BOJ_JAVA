import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int[] num=new int[26];

        for(int i=0; i<num.length; i++) {
            num[i]=-1;
        }

        String S=br.readLine();

        for(int i=0; i<S.length(); i++) {
            char ch=S.charAt(i);

            if(num[ch-'a']==-1) {
                num[ch-'a']=i;
            }
        }

        for(int n:num) {
            System.out.print(n+" ");
        }
    }
}
