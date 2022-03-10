package mao.spring_mvc_exception_handling;

import java.io.FileNotFoundException;

/**
 * Project name(项目名称)：Spring_MVC_exception_handling
 * Package(包名): mao.spring_mvc_exception_handling
 * Interface(接口名): DemoService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/10
 * Time(创建时间)： 21:06
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface DemoService
{
    void show1();

    void show2();

    void show3() throws FileNotFoundException;

    void show4();

    void show5() throws MyException;
}
