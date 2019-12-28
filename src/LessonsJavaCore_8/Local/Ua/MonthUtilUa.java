package LessonsJavaCore_8.Local.Ua;


import java.util.Scanner;

public class MonthUtilUa {
    Scanner scanner = new Scanner(System.in);


    public MonthUa readMonth() {
        while (true) {
            if (!(scanner.hasNextInt())) {
                String s = scanner.nextLine().trim();
                for ( MonthUa monthUa : MonthUa.values()) {
                    if (s.equalsIgnoreCase(monthUa.name())) {
                        return monthUa;
                    }
                }
                System.out.println("Введене Слово не Вірне спробуйте ще раз");
                scanner = new Scanner(System.in);
            } else {
                int m = scanner.nextInt();
                if (m > 12 || m < 1) {
                    System.out.println("Ви ввели неправильний місяць, спробуйте ще раз.");
                    scanner = new Scanner(System.in);
                } else {
                    for ( MonthUa monthUa : MonthUa.values()) {
                        if (m == monthUa.ordinal() + 1) {
                            return monthUa;
                        }
                    }
                }
            }
        }
    }

    //    method 1
    public void check(MonthUa month) {
        boolean monthExists = false;
        for (MonthUa m : MonthUa.values()) {
            if (m.equals(month)) {
                monthExists = true;
            }
        }

        if (monthExists) {
            System.out.println(month + " дійсно існує ");
        }
        else {
            System.out.println("Немає такого місяця, як " + month);
        }
    }


    //method 2
    public void sameSeasonMonths(MonthUa monthUa) {
        SeasonsUa season;
        if (monthUa.ordinal() >= 8 && monthUa.ordinal() <= 10) {
            season = SeasonsUa.Осінь;
        } else if (monthUa.ordinal() >= 2 && monthUa.ordinal() <= 4) {
            season = SeasonsUa.Весна;
        } else if (monthUa.ordinal() >= 5 && monthUa.ordinal() <= 7) {
            season = SeasonsUa.Літо;
        } else {
            season = SeasonsUa.Зима;
        }
        switch (season) {
            case Осінь:
                for ( MonthUa months : MonthUa.values()) {
                    if (months.ordinal() == monthUa.ordinal() || months.ordinal() < 8 || months.ordinal() > 10) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
            case Весна:
                for ( MonthUa months : MonthUa.values()) {
                    if (months.ordinal() == monthUa.ordinal() || months.ordinal() < 2 || months.ordinal() > 4) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
            case Літо:
                for ( MonthUa months : MonthUa.values()) {
                    if (months.ordinal() == monthUa.ordinal() || months.ordinal() < 5 || months.ordinal() > 7) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
            case Зима:
                for ( MonthUa months : MonthUa.values()) {
                    if (months.ordinal() == monthUa.ordinal() || months.ordinal() < 11 && months.ordinal() > 1) {
                    } else {
                        System.out.println(months);
                    }
                }
                break;
        }
    }

    //method 10
    public void evenNumberOfDays (MonthUa monthUa) {
        if (monthUa.inDays % 2 == 0) {
            System.out.println(monthUa.name() + " має парну кількість днів.");
        } else {
            System.out.println(monthUa.name() + " має непарну кількість днів.");
        }
    }
}
