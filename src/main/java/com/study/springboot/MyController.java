package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/")
    public @ResponseBody String root() throws Exception{
        return "JSP in Gradle";
    }
 
    @RequestMapping("/test1")    // localhost:8081/test1
    public String test1() {
        return "test1";          // 실제 호출 될 /WEB-INF/views/test1.jsp       
    }

    @RequestMapping("/test2")
    public String test2() {
        return "test2";       
    }
    
    @RequestMapping("/gikimirane")
    public @ResponseBody String gikimiTest() {
        return "내 페이지";       
    }
    
    @RequestMapping("/woogyuhwan")
    public @ResponseBody String woogyuhwan() {
    	
    	return "1958년생, 때를 만나 움직이니 서둘러 성공하리라.\r\n"
    			+ "1970년생, 처음에는 가망 없어 보이나 시간이 흐를수록 이루어진다.\r\n"
    			+ "1982년생, 다툼을 하려거든 내일로 미루어라. 이길 수 있다.\r\n"
    			+ "1994년생, 모든 일을 쉽게 이루니 기쁨이 가득하다.";       
    }

}
