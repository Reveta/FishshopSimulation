package time;

public class Time {
    private static Time ttime= new Time(00,00,0000);

    private int day;
    private int month;
    private int year;

    public void skipDay(){
        day=day+1;
        if(day==31){
            day=0;
            month=month+1;
        }
        if (month==13){
            month=0;
            year=year+1;
        }
    }

    private Time(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public static Time time(){
        return ttime;
    }

    public String timeNow(){
        String timeNow= "For now time is: "+ ttime.day + " day "+  ttime.month + " month "+ ttime.year + " year";
        return timeNow;
    }

}
