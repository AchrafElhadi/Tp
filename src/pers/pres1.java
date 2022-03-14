package pers;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
import org.springframework.context.support.*;
import dao.*;
import metier.*;

public class pres1 {

	public static void main(String[] args) throws Exception {
		
		//instantiation statique
//		DaoImpl dao= new DaoImpl( );
//		MetierImpl metier= new MetierImpl();
//		metier.setDao(dao);
//		System.out.println(metier.calcule());
//		
//		
			
//			Scanner s=new Scanner(new File("config.txt"));
//	
//			String daoclass= s.nextLine();
//			Class cDao=Class.forName(daoclass);
//			IDao dao=(IDao) cDao.getDeclaredConstructor().newInstance();
//			
//			String metierClassName=s.nextLine();
//			Class cMetier=Class.forName(metierClassName);
//			IMetier metier=(IMetier) cMetier.getDeclaredConstructor().newInstance();
//			Method method=cMetier.getMethod("setDao", IDao.class);
//			method.invoke(metier, dao);
//	
		
		
//		ApplicationContext context=new ClassPathxmlApplicationContext("spring-ioc.xml");
//		IMetier metierscontext.getBean("metier");
//		System.out.println(metier.calcule());

		ApplicationContext ctx=new AnnotationConfigApplicationContext("dao","metier");
		
	
	}

}
