package com.example.sprbasic2025.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Controller
public class DefaultController {

    @RequestMapping({"/index","","/"}) //배열로 맵핑할 수 있다. 또 리다이렉트를 쓰기도 한다.
    public String index(){ //파라미터 받기
        return "index";
    }

    @RequestMapping("/sum") //배열로 맵핑할 수 있다. 또 리다이렉트를 쓰기도 한다.
    public String sum(@RequestParam int a,@RequestParam int b, String name, Model model){ //파라미터 받기
        //@RequestParam 어노테이션일 붙은 파라미터인 경우에는 없으면 에러가 난다
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int sum = a + b;
        System.out.println("sum: " + sum);
        System.out.println("name: " + name);
        model.addAttribute("sum",sum);
        model.addAttribute("name", "!!" + name);
        return "sum";
    }

    @RequestMapping("/test") //배열로 맵핑할 수 있다. 또 리다이렉트를 쓰기도 한다.
    public String test(){ //파라미터 받기
        int a = 0;
        Integer a1 = 0;
        double b = 0.0;
        Double b1 = 0.0;
        boolean c = true;
        Boolean c1 = false;
        String d = "";

        a++;
        System.out.println("a : " + a++); //1
        System.out.println("a : " + ++a); //3

        int sum = 0;
        for(int i=0; i<10; i++){
            sum += i;
        }
        System.out.println("sum : " + sum);

        //sum1
        int sum1 = 0;
        int count = 0;

        while(count <= 10){
            sum1 += count;
            count++;
        }


        if(sum > 50){
            c= false;
        } else if(sum > 10) {
            c = true;
        } else{
            c= true;
        }

        switch(d){
            case "a":
            case "b":
                break;
            default:
                break;

        }

        Map<String, Object> map = new HashMap<>();
        map.put("11", "111");
        map.put("22", "222");
        map.remove("11"); //key값으로 삭제
        map.put("22", "3333");

        String aaaa = (String) map.get("22");
        System.out.println("aaaa : " + aaaa); // 덮어써진 것이 나온다

        List<String> list = new ArrayList<>();
        list.add("adrgaergae");
        list.add("adrgaergae1");
        list.add("adrgaergae2");
        list.add("adrgaergae3");
        list.remove(2);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        for(String s: list){
            System.out.println(s);
        }

        String[] array1 = {"a", "b", "c", "d", "e", "f", "g"};
        for(String s : array1){
            System.out.println(s);
        }

        return "sum";
    }

}
