import java.util.*;

public class PersonalLoanElig {

    Scanner sc = new Scanner(System.in);

    private String name;
    private String citizen;
    private int age;
    private int income;
    private int experience;

    PersonalLoanElig(){
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your Citizenship: ");
        citizen = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your Monthly Income: ");
        income = sc.nextInt();
        System.out.print("Enter your work experience: ");
        experience = sc.nextInt();
        
    }

    PersonalLoanElig(String name, int age, int income, int experience, String citizen){
        this.name = name;
        this.age = age;
        this.income = income;
        this.experience = experience;
        this.citizen = citizen;
    }

    public String getName() {
        return name;
    }

    public boolean checkElig(){
        if((age>=21 && age<=60) && income>=15000 && experience>=1 && citizen.equalsIgnoreCase("Indian"))
            return true;
        return false;
    }
}
