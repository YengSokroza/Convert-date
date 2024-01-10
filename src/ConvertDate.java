import java.util.Scanner;

public class ConvertDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        if (isValidShortDate(shortDate)) {
            int year = getYear(shortDate);
            int month = getMonth(shortDate);
            int day = getDay(shortDate);
            String monthName = getMonthName(month);
            System.out.println("Full Date: " + monthName + " " + day + ", " + year);
        } else {
            System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
        }
    }

    private static boolean isValidShortDate(String shortDate) {
        return shortDate.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    private static int getYear(String shortDate) {
        return Integer.parseInt(shortDate.substring(0, 4));
    }

    private static int getMonth(String shortDate) {
        return Integer.parseInt(shortDate.substring(5, 7));
    }

    private static int getDay(String shortDate) {
        return Integer.parseInt(shortDate.substring(8));
    }

    private static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid Month";
        }
    }
}
