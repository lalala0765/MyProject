package spring.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello.do") //value="/hello.do" method=RequestMethod.POST 하면 405에러가 나온다.(get방식 지원안해서) (GET으로 하면 됨)
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		
		//view 정보 저장
		mav.setViewName("hello");
		
		//model 데이터 저장 (key, value)
		mav.addObject("greeting",getGreeting()); //키값은 스트링, value는 메서드 호출
		return mav;
	}
	
	private String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour >= 6 && hour <= 10) {
			return "좋은 아침입니다.";
		} else if (hour >=12 && hour <= 15) {
			return "점심식사는 하셨나요?";
		} else if (hour >= 18 && hour <= 22) {
			return "좋은 밤 되세요";
		}
		return "안녕하세요";
	}
}
