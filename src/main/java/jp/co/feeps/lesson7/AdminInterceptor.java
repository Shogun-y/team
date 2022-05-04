package jp.co.feeps.lesson7;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdminInterceptor {
	
	@Autowired
	HttpSession session;
	
	@Autowired
	HttpServletResponse response;
	
//	@Before("execution(* jp.co.feeps.lesson5.ItemAdd.inputItem(..))")
	public void loginCheck(Joinpoint joinpoint)throws IOException{
		String admin=(String)session.getAttribute("admin");
		if(admin==null) {
			response.sendRedirect("/spring_practice/inputAdmin");
		}
	}

}
