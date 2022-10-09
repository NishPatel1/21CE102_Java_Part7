import java.util.*;

public class Practical3_7 {
    public static void main(String[] args) {
        ArrayList<PersonalLoanElig> holder = new ArrayList<PersonalLoanElig>();
        for(int i=0;i<5;i++){
            PersonalLoanElig p = new PersonalLoanElig();
            holder.add(p);
        }
        Iterator i = holder.iterator();
        while(i.hasNext()){
            PersonalLoanElig a = (PersonalLoanElig) i.next();
            if(a.checkElig()){
                System.out.println(a.getName() + " is Eligible for the Personal Loan");
            }
        }
    }
}
