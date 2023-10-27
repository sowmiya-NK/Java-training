package I_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class I_date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpledateformat = new SimpleDateFormat(" yyyy-MM-dd");
        System.out.println(simpledateformat.format(date));
        SimpleDateFormat simpleformat=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(simpleformat.format(date));
    }
}
