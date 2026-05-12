package app;

public class Date{
    private int day;
    private int month;
    private int year;

    private boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private boolean isValidDate(int day, int month, int year){
        if(month < 1 || month > 12){
            return false;
        }
        if(year < 0){
            return false;
        }
        if(day < 1){
            return false;
        }
        if(month == 2){
            if(isLeapYear(year)){
                return day <= 29;
            }else{
                return day <= 28;
            }
        }
        if(month == 4 || month == 6 || month == 9 || month == 11){
            return day <= 30;
        }
        return day <= 31;
    }

    public Date(int day, int month, int year){
        if (isValidDate(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }else{
            System.out.println("Invalid date. The date was set to 01/01/2000.");
            this.day = 1;
            this.month = 1;
            this.year = 2000;
        }
    }

    public int getDay(){
        return this.day;
    }

    public void setDay(int day){
        if(isValidDate(day, this.month, this.year)){
            this.day = day;
        }
    }

    public int getMonth(){
        return this.month;
    }

    public void setMonth(int month){
        if(isValidDate(this.day, month, this.year)){
            this.month = month;
        }
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        if(isValidDate(this.day, this.month, year)){
            this.year = year;
        }
    }

    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }
}
