package mao.spring_mvc_exception_handling;

import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Project name(项目名称)：Spring_MVC_exception_handling
 * Package(包名): mao.spring_mvc_exception_handling
 * Class(类名): DemoServiceImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/10
 * Time(创建时间)： 21:07
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Service
public class DemoServiceImpl implements DemoService
{

    public void show1()
    {
        System.out.println("抛出类型转换异常....");
        Object str = "123";
        Integer num = (Integer) str;
    }

    public void show2()
    {
        System.out.println("抛出除零异常....");
        int i = 1 / 0;
    }

    public void show3() throws FileNotFoundException
    {
        System.out.println("文件找不到异常....");
        InputStream in = new FileInputStream("C:/xxx/xxx/xxx.txt");
    }

    public void show4()
    {
        System.out.println("空指针异常.....");
        String str = null;
        str.length();
    }

    public void show5() throws MyException
    {
        System.out.println("自定义异常....");
        throw new MyException();
    }
}
