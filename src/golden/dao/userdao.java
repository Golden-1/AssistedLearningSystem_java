package golden.dao;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import golden.model.Calendar;
import golden.model.Collection;
import golden.model.HasReadWordsWithBLOBs;
import golden.model.WordListWithBLOBs;
import golden.tempmodel.collection_1;

public interface userdao {
	public WordListWithBLOBs selectbyword_id(Integer word_id);
	/* public List<WordListWithBLOBs> selectbyword(String word); */
    public HasReadWordsWithBLOBs selectby_studentid(Integer student_id);
    public Calendar select_calendar_by_studentid(Integer student_id);
	public List<Object> selectbyword(String word);
	public int collection(Collection collec);
	public collection_1 select_collection(Integer student_id);
}
