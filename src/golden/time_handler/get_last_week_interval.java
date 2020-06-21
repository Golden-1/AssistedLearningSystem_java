package golden.time_handler;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class get_last_week_interval {
    public Date[] getLastWeekInterval() { 
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar1 = Calendar.getInstance();  
        Calendar calendar2 = Calendar.getInstance();  
        int dayOfWeek = calendar1.get(Calendar.DAY_OF_WEEK) - 1;  
        int offset1 = 1 - dayOfWeek;  
        int offset2 = - dayOfWeek;  
        calendar1.add(Calendar.DATE, offset1 - 7);  
        calendar2.add(Calendar.DATE, offset2);  
        // System.out.println(sdf.format(calendar1.getTime()));// last Monday  
        Date lastBeginDate = calendar1.getTime();  
        // System.out.println(sdf.format(calendar2.getTime()));// last Sunday  
        Date lastEndDate = calendar2.getTime();  
        Date[] dates= {lastBeginDate,lastEndDate};
        return dates;
}
}
