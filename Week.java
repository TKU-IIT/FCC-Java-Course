
public class Week {
    public static void main(String[] args) {
        int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};
        for(String s : days){
            switch(s){
                case "sat":
                    //break;
                case"sun":
                    wd--;
                    break;
                case "mon":
                    wd++;
                    //break;
                case "wed":
                    wd+=2;
                    //break;
            }
            
        }
        System.out.println(wd);
    }
}