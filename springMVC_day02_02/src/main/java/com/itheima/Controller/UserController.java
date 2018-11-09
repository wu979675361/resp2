package com.itheima.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;


@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 上传
     * @return
     */
    @RequestMapping("/upload")
    public String testUpload(HttpServletRequest request, MultipartFile upload) throws IOException {
        System.out.println("springMVC方法上传");
        //获取上传的文件目录
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        //创建file对象
        File file= new File(path);
        //判断路径是都存在
        if (!file.exists()){
            file.mkdir();
        }
        //获取到上传文件的名称
        String filename = upload.getOriginalFilename();
        //文件名进行拼接这边去掉_防止我们不容易确认真正的文件名字
        String uuid = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        String newname = uuid+"_"+filename;
        //上传文件
        upload.transferTo(new File(file,newname));
        return "success";
    }
}
