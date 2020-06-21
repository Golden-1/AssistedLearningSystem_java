package golden.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alibaba.dubbo.config.support.Parameter;
import com.alibaba.fastjson.JSONObject;

import golden.dao.userdao;
import golden.model.Calendar;
import golden.model.Collection;
import golden.model.HasReadWords;
import golden.model.HasReadWordsWithBLOBs;
import golden.model.WordListWithBLOBs;
import golden.tempmodel.collection_1;



@Repository
public class userdaoimpl extends SqlSessionDaoSupport implements userdao{
    
	 @Autowired
	  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
	    super.setSqlSessionFactory(sqlSessionFactory);
	  }

	/* static private SqlSessionFactory sqlSessionFactory; */
	  String ns_1 = "golden.mapper.WordListMapper.";
	  String ns_2 = "golden.mapper.HasReadWordsMapper.";
	  String ns_3 = "golden.mapper.CalendarMapper.";
	  String ns_4 = "golden.mapper.CollectionMapper.";
	/*
	 * public SqlSession getSqlSession() { InputStream is; try { is =
	 * Resources.getResourceAsStream("WordListMapper.xml"); if (sqlSessionFactory ==
	 * null) { sqlSessionFactory = new SqlSessionFactoryBuilder().build(is); }
	 * return sqlSessionFactory.openSession(); } catch (IOException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } return null; }
	 */
	
	@Override
	public WordListWithBLOBs selectbyword_id(Integer word_id) {
		// TODO Auto-generated method stub
		 return (WordListWithBLOBs)getSqlSession().selectOne(String.valueOf(this.ns_1) + "selectByPrimaryKey", word_id);
	}

	
	  
	  
	  @Override 
	  public List<Object> selectbyword(@Param(value="word")String word)
	  {
		  
	      List<Object> word_list=getSqlSession().selectList(String.valueOf(this.ns_1) + "selectByWord", word);
	      return word_list;
	  }



	  @Override 
	public HasReadWordsWithBLOBs selectby_studentid(Integer student_id) {
		// TODO Auto-generated method stub
		return (HasReadWordsWithBLOBs)getSqlSession().selectOne(String.valueOf(this.ns_2)+"selectby_studentid",student_id);
	}




	@Override
	public Calendar select_calendar_by_studentid(Integer student_id) {
		// TODO Auto-generated method stub
		return (Calendar)getSqlSession().selectOne(String.valueOf(this.ns_3)+"selectby_studentid",student_id);
	}




	@Override
	public int collection(Collection collec) {
		// TODO Auto-generated method stub		
		int result = getSqlSession().update(String.valueOf(this.ns_4)+"updateby_studentid",collec);
		return result;	
	}




	@Override
	public collection_1 select_collection(Integer student_id) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne(String.valueOf(this.ns_4)+"selectby_student_id",student_id);
	}

}
