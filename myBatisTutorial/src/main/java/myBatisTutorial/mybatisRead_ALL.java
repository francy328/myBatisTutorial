package myBatisTutorial;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class mybatisRead_ALL {
	 public static void main(String args[]) throws IOException{

	      Reader reader = Resources.getResourceAsReader("configuration.xml");
	      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
	      SqlSession session = sqlSessionFactory.openSession();
	      
	      //select contact all contacts		
	      List<Studente> student = session.selectList("getAll");
	          
	      for(Studente st : student ){    	  
	         System.out.println(st.getId());
	         System.out.println(st.getNome());
	         System.out.println(st.getCognome());   
	      }  
			
	      System.out.println("Records Read Successfully ");  
	      session.commit();   
	      session.close();			
	   }

}
