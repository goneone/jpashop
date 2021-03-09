package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String Hello(Model model) { //model에 데이터를 실어서 view에다가 넘길수 있음.
        model.addAttribute("data", "hello!!");
        return "hello"; //이건 화면이름. 관례상 resources/templates 하위랑 맵핑됨.
    }
}
