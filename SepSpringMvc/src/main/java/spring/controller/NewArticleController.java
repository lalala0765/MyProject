package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.service.ArticleService;
import spring.service.NewArticleCommand;

@Controller
@RequestMapping("/article/newArticle.do")
public class NewArticleController {
	@Autowired
	private ArticleService articleService;
	
	//@RequestMapping 메서드의 리턴 타입이 String => return값을 viewname으로 사용
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "article/newArticleForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("command") NewArticleCommand command) {
		//@ModelAttribute //뷰에 전달할 데이터를 어트리뷰트로 추가. 파라미터값 저장된 객체를 command라는 이름으로 3)모델데이터로 추가시킨다. 이 어노테이션을 사용하지 않으면 그냥 클래스명으로 저장되는데 소문자로 시작한다.
		//NewArticleCommand command //1)NewArticleCommand 객체를 만들고 2)같은 이름으로 전달된 파라미터값을 저장 
		articleService.writeArticle(command);
		return "article/newArticleSubmit";
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	
	
}
