package golden.tempmodel;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class collection_1 {
    

    private Integer studentId;

    private String words=null;

    private String article=null;

    private String vedio=null;

  

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Object getWords() {
        JSONArray total=JSON.parseArray("["+words+"]");
    	return total;    
        }

    public void setWords(String words) {
        this.words = words;
    }

    public Object getArticle() {
    	JSONArray total=JSON.parseArray("["+article+"]");
    	return total;  
        }

    public void setArticle(String article) {
        this.article = article;
    }

    public Object getVedio() {
    	JSONArray total=JSON.parseArray("["+vedio+"]");
        return total;    
        }

    public void setVedio(String vedio) {
        this.vedio = vedio;
    }
}