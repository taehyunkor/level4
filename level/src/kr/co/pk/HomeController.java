package kr.co.pk;


import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.pk.domain.ProductVO;
import kr.co.pk.service.ProductService;


@Controller
public class HomeController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	//리턴을 하지 않으면 input 으로 forwarding
	@RequestMapping(value="input", method = RequestMethod.GET)
	public void input() {}
	
	@RequestMapping(value="input", method = RequestMethod.POST)
	public String input(ProductVO vo) {
		productService.insert(vo);
		//삽입 삭제 갱신 등 새로고침을 했을 때 이전 작업을 다시 하지 
		//않아도 되는 경우는 redirect로 이동해야 합니다.
		return "redirect:./";
	}
	
	//리턴을 하지 않으면 input 으로 forwarding
	@RequestMapping(value="search", method = RequestMethod.GET)
	public void search() {}
	
	//리턴을 하지 않으면 input 으로 forwarding
	@RequestMapping(value="search", method = RequestMethod.POST)
	public String search(
			@RequestParam("code") String code, 
			Model model) {
		ProductVO vo = productService.search(code);
		vo.setGcode(vo.getGcode().trim());
		model.addAttribute("vo", vo);
		System.out.println(vo);
		return "searchresult";
	}
		
	//리턴을 하지 않으면 input 으로 forwarding
	@RequestMapping(value="update", method = RequestMethod.POST)
	public String update(ProductVO vo) {
		productService.update(vo);
		return "redirect:./";
	}
		
	//리턴을 하지 않으면 input 으로 forwarding
	@RequestMapping(value="delete", method = RequestMethod.POST)
	public String delete(@RequestParam("code") String code) {
		productService.delete(code);
		return "redirect:./";
	}
	@RequestMapping(value="fast", method = RequestMethod.GET)
	public String fast(Model model) {
		
		List<Map> list = productService.fast();
         model.addAttribute("list", list);		
		 return "fast";
	}
	
	
}









