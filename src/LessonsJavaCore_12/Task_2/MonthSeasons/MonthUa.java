package LessonsJavaCore_12.Task_2.MonthSeasons;

public enum  MonthUa {
    Січень(31,SeasonsUa.Зима),
    Лютий(28,SeasonsUa.Зима),
    Березень(31,SeasonsUa.Весна),
    Квітень(30,SeasonsUa.Весна),
    Травень(31,SeasonsUa.Весна),
    Червень(30,SeasonsUa.Літо),
    Липень(31,SeasonsUa.Літо),
    Серпень(31,SeasonsUa.Літо),
    Вересень(30,SeasonsUa.Осінь),
    Жовтень(31,SeasonsUa.Осінь),
    Листопад(30,SeasonsUa.Осінь),
    Грудень(31,SeasonsUa.Зима);

    int days;
    SeasonsUa seasons;
    public int getDays() {
        return days;
    }

    public SeasonsUa getSeasons() {
        return seasons;
    }

    MonthUa(int days,SeasonsUa seasons) {
        this.days = days;
        this.seasons = seasons;
    }
}
