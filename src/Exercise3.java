import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phone number:");
        String originalPhoneNumber = scanner.next();
        System.out.println(" / "+checkingARegularPhoneNumber(originalPhoneNumber));
    }

    public static String checkingARegularPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 11) {
            if ((phoneNumber.charAt(0) != '0')
                    || (phoneNumber.charAt(1) != '5')
                    || (phoneNumber.charAt(3) != '-')) {
                return "";
            }
            for (int i = 2; i < phoneNumber.length(); i++) {
                if (i != 3) {
                    if (phoneNumber.charAt(i) > '9' || phoneNumber.charAt(i) < '0') {
                        return "";
                    }
                }
            }
            return phoneNumber;
        }
        if (phoneNumber.length() == 10) {
            String newPhoneNumber = "05";
            if ((phoneNumber.charAt(0) != '0')
                    || (phoneNumber.charAt(1) != '5')) {
                return "";
            }

            for (int i = 2; i < phoneNumber.length(); i++) {
                if (phoneNumber.charAt(i) > '9' || phoneNumber.charAt(i) < '0') {
                    return "";
                }
                if (i == 2) {
                    newPhoneNumber += phoneNumber.charAt(i) + "-";
                } else {
                    newPhoneNumber = newPhoneNumber + phoneNumber.charAt(i);
                }
            }
            return newPhoneNumber;
        }
        if (phoneNumber.length() == 12) {
            String newPhoneNumber = "05";
            if ((phoneNumber.charAt(0) != '9')
                    || (phoneNumber.charAt(1) != '7')
                    || (phoneNumber.charAt(2) != '2')
                    || (phoneNumber.charAt(3) != '5')) {
                return "";
            }

            for (int i = 4; i < phoneNumber.length(); i++) {
                if (phoneNumber.charAt(i) > '9' || phoneNumber.charAt(i) < '0') {
                    return "";
                }
                if (i == 4) {
                    newPhoneNumber += phoneNumber.charAt(i) + "-";
                } else {
                    newPhoneNumber += phoneNumber.charAt(i);
                }
            }
            return newPhoneNumber;
        }
        return "";
    }
}
