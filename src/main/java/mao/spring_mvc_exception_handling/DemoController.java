package mao.spring_mvc_exception_handling;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;

/**
 * Project name(项目名称)：Spring_MVC_exception_handling
 * Package(包名): mao.spring_mvc_exception_handling
 * Class(类名): DemoController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/10
 * Time(创建时间)： 21:09
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class DemoController
{
    private static final Log log = LogFactory.getLog(DemoController.class);

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/show")
    public String show() throws FileNotFoundException, MyException
    {
        System.out.println("show running......");
        log.info("show running......");
        //demoService.show1();
        //demoService.show2();
        //demoService.show3();
        //demoService.show4();
        demoService.show5();
        return "index";
    }
}
