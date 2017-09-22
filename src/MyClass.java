import java.util.Random;
import java.util.Scanner;

/**
 * Created by user on 19.09.2017.
 */

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
//        int i = scanner.nextInt();
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        System.out.println(isCorrectDate(day, month, year));
//        System.out.println(i + " " + getPartOfString(i));
//        System.out.println(isLeap(i) ? "Leap" : "NotLeap");
        //indexed
        //notindexed
    }

    public static boolean isCorrectDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        int dayInMonth = getDayInMonth(month, year);
        if (day >= 1 && day <= dayInMonth) {
            return true;

        }
        return false;

    }

    public static int getDayInMonth(int month,int year) {
        int dayInMonth = 100;
        switch (month) {
            case  6:
            case  9:
            case 11:
            case  4:
                dayInMonth = 30;
                break;
            case  1:
            case  3:
            case  5:
            case  7:
            case  10:
            case  12:
                dayInMonth = 31;
                break;
            case   2:
                dayInMonth  = 28;
                break;
        }
        if (isLeap(year) && month == 2) {
            dayInMonth = 29;
        }
        return dayInMonth;

    }

    public static boolean isLeap(int year) {
        return ((year % 4 == 0  && year % 100 != 0) || year % 400 == 0);
    }

    public static String getPartOfString(int i) {
        String str;
        int lastDigit = i % 10;
        int lastTwoDigit = (i % 100);
        if (lastDigit == 0 || lastTwoDigit / 10 == 1 || (lastDigit >=5 && lastDigit <= 9)) {
            str = "рублей";
        } else if (lastDigit == 1) {
            str = "рубль";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            str = "рубля";
        } else {
            str = "hz";
        }
        return str;
    }

    public static boolean isInRange(int number, int from, int to) {
        return number >= from && number <= to;
    }
    public static boolean isSummer(int monthNumber) {
        return isInRange(monthNumber,6,8);
    }
    public static boolean isSpring(int monthNumber) {
        return isInRange(monthNumber,3,5);
    }
    public static boolean isAutumn(int monthNumber) {
        return isInRange(monthNumber,9,11);
    }
    public static String determineSeason(int monthNumber) {
        if (isAutumn(monthNumber)) {
            return "Aut";
        }
        else if (isSpring(monthNumber)) {
            return "Spr";
        }
        else if (isSummer(monthNumber)) {
            return "Sum";
        }
        else {
            return "Win";
        }
    }

    public static char generateRandomletter() {
        char firstLetter = 'a';
        return (char) (firstLetter + new Random().nextInt(26));
    }

}
