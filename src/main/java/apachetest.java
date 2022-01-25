import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class apachetest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter Something:");
        String userString = sc.nextLine();

        if (!StringUtils.isNumeric(userString)){
            System.out.printf("%s is not a number\n", userString);
            System.out.printf("Flipped Case: %s\n", StringUtils.swapCase(userString));
            System.out.printf("Reversed: %s\n", StringUtils.reverse(userString));
        }

    }

}
//test