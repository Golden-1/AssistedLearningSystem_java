package golden.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import golden.dao.userdao;
import golden.model.Calendar;
import golden.model.Collection;
import golden.model.HasReadWords;
import golden.model.HasReadWordsWithBLOBs;
import golden.model.WordListWithBLOBs;
import golden.service.userservice;
import golden.tempmodel.collection_1;

@Service("userservice")
public class userserviceimpl implements userservice {
    @Autowired
     userdao user_dao;

	@Override
	public WordListWithBLOBs selectbyword_id(Integer word_id) {
		// TODO Auto-generated method stub
		WordListWithBLOBs word_info = user_dao.selectbyword_id(word_id);
		return word_info;
	}

	
	  
	  public List<Object> selectbyword(String word) { 
	      List<Object> word_list =user_dao.selectbyword(word); 
	      return word_list; 
	   }



	@Override
	public HasReadWordsWithBLOBs selectby_studentid(Integer student_id) {
		// TODO Auto-generated method stub
		return user_dao.selectby_studentid(student_id);
	}



	@Override
	public Calendar select_calendar_by_studentid(Integer student_id) {
		// TODO Auto-generated method stub
		return user_dao.select_calendar_by_studentid(student_id);
	}



	@Override
	public int collection(Collection collec) {
		// TODO Auto-generated method stub
		int result =user_dao.collection(collec);
		return result;
	}



	@Override
	public collection_1 select_collection(Integer student_id) {
		// TODO Auto-generated method stub
		return user_dao.select_collection(student_id);
	}
	  
	 
}
