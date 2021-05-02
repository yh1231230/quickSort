import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {

        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        for (String s:list
             ) {
            if("b".equals(s))
                ;
        }


        String jia = "2020年11月11日 0:03:47";
        String pi = "2020年11月11日 0:10:11";
        dateTest(jia);
        dateTest(pi);

    }

    static void dateTest(String str) throws ParseException {
        String start = "2020年11月11日 0:0:0";
        String end = "2020年11月11日 0:10:0";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long startDate = sdf.parse(start).getTime();
        long endDate = sdf.parse(end).getTime();
        long strDate = sdf.parse(str).getTime();
        if (strDate >= startDate && strDate <= endDate) {
            System.out.println("参与成功");
        } else {
            System.out.println("参与失败");
        }

    }
}


