package ss1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Ex8_2 {
    public static void main(String[] args) throws ParseException {
            // a
            String str="02/28/2023";
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            Date date = sdf.parse(str);
            System.out.println(date);

            // b
            Date currentDate = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String dateCurrent=formatter.format(currentDate);
            System.out.println(dateCurrent);


            //c
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate localDate = LocalDate.parse(str,formatter2);
            System.out.println(localDate);

            // d
            DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate2 = LocalDate.now();
            String currentDate2 = formatter3.format(localDate2);
            System.out.println(localDate2);
            //e
            LocalDateTime localDate3 = LocalDateTime.now();
            int day=localDate3.getDayOfMonth();
            int month=localDate3.getMonthValue();
            int year=localDate3.getYear();
            int hour=localDate3.getHour();
            int minute=localDate3.getMinute();
            int second=localDate3.getSecond();
            System.out.println("day: "+day);
            System.out.println("month: "+month);
            System.out.println("year: "+year);
            System.out.println("hour: "+hour);
            System.out.println("minute: "+minute);
            System.out.println("second: "+second);

            // f
            LocalDate localDate4 = LocalDate.now();
            LocalDate lastOneMonth = localDate4.plusMonths(1);
            long dayUn=localDate4.until(lastOneMonth, ChronoUnit.DAYS);
            System.out.println(dayUn);

            //g
            LocalDate localDate5 = localDate4.plusDays(1000);
            System.out.println(localDate5);
            //h
            String time1="20/03/2024";
            String time2="22/05/2024";
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate6_1 = LocalDate.parse(time1,formatter1);
            LocalDate localDate6_2 = LocalDate.parse(time2,formatter1);
            long dayUn2=localDate6_1.until(localDate6_2, ChronoUnit.DAYS);
            System.out.println(dayUn2);

    }
}


//        Scanner in = new Scanner(System.in);
//        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        System.out.println("Nhap ngay sinh");
//        String date = in.nextLine();
//        LocalDate localDate = LocalDate.parse(date , formatter);
//        localDate = localDate.plusYears(2);
//
//        System.out.println(localDate.format(formatter));