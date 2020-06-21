package golden.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import golden.model.Calendar;
import golden.model.Collection;
import golden.model.HasReadWords;
import golden.model.HasReadWordsWithBLOBs;
import golden.model.WordListWithBLOBs;
import golden.tempmodel.collection_1;

public interface userservice {
	public WordListWithBLOBs selectbyword_id(Integer word_id);
	public List<Object> selectbyword(String word); 
	public HasReadWordsWithBLOBs selectby_studentid(Integer student_id);
	public Calendar select_calendar_by_studentid(Integer student_id); 
	public int collection(Collection collec);
	public collection_1 select_collection(Integer student_id);
}
