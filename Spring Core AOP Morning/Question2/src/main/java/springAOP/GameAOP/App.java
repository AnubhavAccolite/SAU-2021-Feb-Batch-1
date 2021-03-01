package springAOP.GameAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import GameService.GameService;


public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		GameService GameService = (GameService) ctx.getBean("GameService");
		GameService.getGame().setCompanyName("Call of Duty");
		System.out.println(GameService.getGame().getCompanyName());
    }
}
