package MyPackage;

import java.util.GregorianCalendar;

class DateExample {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Текущая дата: " + year + "-" + month + "-" + day);


        long milliseconds = 90234543L;
        GregorianCalendar calendar2 = new GregorianCalendar();
        calendar2.setTimeInMillis(milliseconds);
        year = calendar2.get(GregorianCalendar.YEAR);
        month = calendar2.get(GregorianCalendar.MONTH) + 1;
        day = calendar2.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Дата для " + milliseconds + " миллисекунд: " + year + "-" + month + "-" + day);
    }
}