package Bridgelabz;

import com.bridgelabz.utility.Utility;

public class PerfectNumber {
    public static void main(String[] args) {
        int perfectCheck;
        Utility utility = new Utility();
        System.out.println("\n Please Enter the number to be checked :: ");
        perfectCheck = utility.getIntValue();
        utility.perfectNumberCheck(perfectCheck);
    }
}
