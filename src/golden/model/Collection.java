package golden.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Collection {
    private Integer id;

    private Integer studentId;

    private String words=null;

    private String article=null;

    private String vedio=null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Object getWords() {
//   	JSONObject object = JSON.parseObject((String) this.words);
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    	String total=null;
    	if(words!=null) {
        Calendar calendar=Calendar.getInstance(); 
        String time=sdf.format(calendar.getTime());
        total="{\""+"date"+"\""+":\""+time+"\","+"\"words\":\""+words+"\"}";
//    	String time=sdf.format(calendar.getTime());
//    	System.out.println(time);
//    	StringBuffer stringbuffer=new StringBuffer(words);
//    	total=stringbuffer.insert(1,"\""+"date"+"\""+":\""+time+"\",").toString();
    	}
    	return total;    
        }

    public void setWords(String words) {
        this.words = words;
    }

    public Object getArticle() {
//    	JSONObject object = JSON.parseObject((String) this.article);
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    	String total=null;
    	if(article!=null) {
    	Calendar calendar=Calendar.getInstance(); 
    	String time=sdf.format(calendar.getTime());
        total="{\""+"date"+"\""+":\""+time+"\","+"\"article\":\""+article+"\"}";
//    	StringBuffer stringbuffer=new StringBuffer(article);
//    	total=stringbuffer.insert(1,"\""+"date"+"\""+":\""+time+"\",").toString();  
    	}
    	return total;  
        }

    public void setArticle(String article) {
        this.article = article;
    }

    public Object getVedio() {
//    	JSONObject object = JSON.parseObject((String) this.vedio);
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String total=null;
        if(vedio!=null) {
    	Calendar calendar=Calendar.getInstance(); 
    	String time=sdf.format(calendar.getTime());
        total="{\""+"date"+"\""+":\""+time+"\","+"\"vedio\":\""+vedio+"\"}";
//    	StringBuffer stringbuffer=new StringBuffer(vedio);
//    	total=stringbuffer.insert(1,"\""+"date"+"\""+":\""+time+"\",").toString();
        }
        return total;    
        }

    public void setVedio(String vedio) {
        this.vedio = vedio;
    }
}