public class Schaltjahre {
    public static void main(String[] args) {
        int jahr=0;
        while (jahr<=2030) //alle Jahre bis 3000 durchsehen
        {
            if(jahr%4==0) //Jahr durch 4 = Schaltjahr
            {
                if (jahr%100!=0) //wenn Jahr durch 100 teilbar, dann kein Schaltjahr -> alle 100 Jahre verzichtet man auf ein Schaltjahr
                {
                    System.out.println(jahr+" ist ein Schaltjahr");
                }
                if (jahr%400==0) //wenn Jahr durch 400 teilbar dann schaltjahr
                {
                    System.out.println(jahr + " ist ein Schaltjahr");
                }
            }
            jahr=jahr+1;
        }
    }
}
