import java.sql.SQLOutput;

public class DurchDreiTeilbar {
    public static void main(String[] args) {
        int i=0;

        while (i<=100)
        {
            i=i+1;
            if(i%3==0)
            {
                System.out.println(i);
            }
        }
    }
}
