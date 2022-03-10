package mao.spring_mvc_exception_handling;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Project name(项目名称)：Spring_MVC_exception_handling
 * Package(包名): mao.spring_mvc_exception_handling
 * Class(类名): ExceptionResolver
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/10
 * Time(创建时间)： 21:10
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class ExceptionResolver implements HandlerExceptionResolver
{
    /**
     * 参数Exception：异常对象
     * 返回值ModelAndView：跳转到错误视图信息
     */
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception e)
    {
        ModelAndView modelAndView = new ModelAndView();

        if (e instanceof MyException)
        {
            modelAndView.addObject("info", "自定义异常");
        }
        else if (e instanceof ClassCastException)
        {
            modelAndView.addObject("info", "类转换异常");
        }

        modelAndView.setViewName("error");

        return modelAndView;
    }
}
