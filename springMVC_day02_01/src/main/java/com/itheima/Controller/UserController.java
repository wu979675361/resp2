package com.itheima.Controller;


import com.itheima.domain.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/userController")
    public String userController(Model model){
        User user = new User();
        user.setUsername("张三");
        user.setPassword("132456");
        user.setAge(18);
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/userController1")
    public void userController1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setUsername("张三");
        user.setPassword("132456");
        user.setAge(18);
        //request.setAttribute("user",user);
        request.getSession().setAttribute("user",user);
        /*request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);*/

        //重定向
        response.sendRedirect(request.getContextPath()+"/success.jsp");

    }


    /**
     * modelAndView
     *
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping("/userController2")
    public ModelAndView userController2() {
        User user = new User();
        user.setUsername("李四");
        user.setPassword("132456");
        user.setAge(18);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;

    }


    @RequestMapping("/forwordAndRedirect")
    public String userController(){
        User user = new User();
        user.setUsername("张三");
        user.setPassword("132456");
        user.setAge(18);
        return "forward:/WEB-INF/pages/success.jsp";
    }

    @RequestMapping("/testAjax")
    //获取请求体所有内容
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("ajax成功运行");
        System.out.println(user);
        //返回一个json串
        return user;

    }
}
