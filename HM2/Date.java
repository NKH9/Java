import java.time.LocalDate;
import java.time.Period;

public class Date {
    private int day;
    private int month;
    private int year;
    private int days;
    public String whichMonth(int x) {
        switch (x) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return ".";
    }
    public int calcdays() {
        LocalDate end = LocalDate.of(year,month,day);
        LocalDate start = LocalDate.of(year-1,12,31);
        return Period.between(start,end).getDays();}
    public Date( int dayy, int monthh, int yearr) {
        this.day=dayy;
        this.month=monthh;
        this.year=yearr;
        this.days=calcdays();
        }
    public Date(String month, int dayy, int yearr) {
        this.day=dayy;
        this.year=yearr;
        switch (month){
            case "January":
                this.month=1;
                break;
            case "February":
                this.month=2;
                break;
            case "March":
                this.month=3;
                break;
            case "April":
                this.month=4;
                break;
            case "May":
                this.month=5;
                break;
            case "June":
                this.month=6;
                break;
            case "July":
                this.month=7;
                break;
            case "August":
                this.month=8;
                break;
            case "September":
                this.month=9;
                break;
            case "October":
                this.month=10;
                break;
            case "November":
                this.month=11;
                break;
            case "December":
                this.month=12;
                break;
            default:
                System.out.println("Invalid Month Name");
        }
        this.days=calcdays();
    }
    public Date(int daysTogether,int yearr) {
        this.year=yearr;
        LocalDate startDateOfyear =LocalDate.of(yearr-1,12,31);
        LocalDate dateAfterradd = startDateOfyear.plusDays(daysTogether);
        this.month = dateAfterradd.getMonthValue();
        this.day = dateAfterradd.getDayOfMonth();
        this.days=daysTogether;
    }

    public String print1() {
        return Integer.toString(month)+'/'+Integer.toString(day)+'/'+Integer.toString(year);
    }

    public String print2() {
        return whichMonth(month)+' '+Integer.toString(day)+','+Integer.toString(year);
    }
    public String print3() {
        return Integer.toString(days)+' '+Integer.toString(year);
    }
    public static void main(String[] args) {
        Date new_date = new Date(2,2,2000);
        Date new_date1 = new Date(300,2000);
        Date new_date2 = new Date("July",29,2000);


        System.out.println("new_date");
        System.out.println(new_date.print1());
        System.out.println(new_date.print2());
        System.out.println(new_date.print3());
        System.out.println("new_date1");
        System.out.println(new_date1.print1());
        System.out.println(new_date1.print2());
        System.out.println(new_date1.print3());
        System.out.println("new_date2");
        System.out.println(new_date2.print1());
        System.out.println(new_date2.print2());
        System.out.println(new_date2.print3());


    }
}
