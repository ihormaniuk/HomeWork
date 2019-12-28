package LessonsJavaCore_8.Local.Eng;


import java.util.Scanner;

public class MonthUtilEng {
    Scanner scanner = new Scanner(System.in);


    public MonthEng readMonth() {
        while (true) {
            if (!(scanner.hasNextInt())) {
                String s = scanner.nextLine().trim();
                for (MonthEng month : MonthEng.values()) {
                    if (s.equalsIgnoreCase(month.name())) {
                        return month;
                    }
                }
                System.out.println("The word you entered is not \n" +
                        "the name of the month, try again");
                scanner = new Scanner(System.in);
            } else {
                int m = scanner.nextInt();
                if (m > 12 || m < 1) {
                    System.out.println("You entered the wrong month, try again.");
                    scanner = new Scanner(System.in);
                } else {
                    for (MonthEng month : MonthEng.values()) {
                        if (m == month.ordinal() + 1) {
                            return month;
                        }
                    }
                }
            }
        }
    }


    //method 1
    public static void check(MonthEng month) {
        boolean monthExists = false;
        for (MonthEng m : MonthEng.values()) {
            if (m.equals(month)) {
                monthExists = true;
            }
        }

        if (monthExists) {
            System.out.println(month + " do exists");
        }
        else {
            System.out.println("There isn't such month as " + month);
        }
    }


    // method 2
    public void sameSeasonMonths(MonthEng month) {
        SeasonsEng season;
        if (month.ordinal() >= 8 && month.ordinal() <= 10) {
            season = SeasonsEng.Autumn;
        } else if (month.ordinal() >= 2 && month.ordinal() <= 4) {
            season = SeasonsEng.Spring;
        } else if (month.ordinal() >= 5 && month.ordinal() <= 7) {
            season = SeasonsEng.Summer;
        } else {
            season = SeasonsEng.Winter;
        }
        switch (season) {
            case Autumn:
                for (MonthEng months : MonthEng.values()) {
                    if (months.ordinal() == month.ordinal() || months.ordinal() < 8 || months.ordinal() > 10) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
            case Spring:
                for (MonthEng months : MonthEng.values()) {
                    if (months.ordinal() == month.ordinal() || months.ordinal() < 2 || months.ordinal() > 4) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
            case Summer:
                for (MonthEng months : MonthEng.values()) {
                    if (months.ordinal() == month.ordinal() || months.ordinal() < 5 || months.ordinal() > 7) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
            case Winter:
                for (MonthEng months : MonthEng.values()) {
                    if (months.ordinal() == month.ordinal() || months.ordinal() < 11 && months.ordinal() > 1) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
        }
    }

    //method 10
    public void evenNumberOfDays (MonthEng month) {
        if (month.inDays % 2 == 0) {
            System.out.println(month.name() + " has an even number of days.");
        } else {
            System.out.println(month.name() + " has an odd number of days.");
        }
    }

}