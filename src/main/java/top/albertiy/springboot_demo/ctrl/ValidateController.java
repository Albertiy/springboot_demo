package top.albertiy.springboot_demo.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import top.albertiy.springboot_demo.po.Reader;
import top.albertiy.springboot_demo.dal.ReaderRepository;

@Controller
@RequestMapping("/login")
public class ValidateController {

    @Autowired
    ReaderRepository readerRepository;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String loginPage(@RequestParam(value="error",required=false) Boolean error, Model model) {
        if(error != null && error){
            System.out.println("error login");
            model.addAttribute("error",true);
        } else{
            System.out.println("normal login");
        }
        return "login";
    }

    /*Spring Security 默认post请求必须带token（开启了CSRF），*/
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String loginValidate(Reader reader) {
        if(reader == null) {
            System.out.println("未获取到账号和密码");
        }else {
            System.out.println(reader.getUsername()+"|"+reader.getPassword());
        }
        return "redirect:/readingList/Albertiy";
    }
}
