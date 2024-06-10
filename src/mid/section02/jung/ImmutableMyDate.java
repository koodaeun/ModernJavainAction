package jung.mid1.sec2;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;
    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public ImmutableMyDate setYear(int newYear) {
        return new ImmutableMyDate(newYear, month, day);
    }
    public ImmutableMyDate setMonth(int newMonth) {
        return new ImmutableMyDate(year, newMonth, day);
    }
    public ImmutableMyDate setDay(int newDay) {
        return new ImmutableMyDate(year, month, newDay);
    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
