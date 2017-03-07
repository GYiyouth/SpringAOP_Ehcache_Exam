import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by geyao on 2017/3/4.
 */
@WebListener
public class MyServletRequestListener implements ServletRequestListener, ServletContextAttributeListener{
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("\n\n\n 有个request被移除了");
        HttpServletRequest request = (HttpServletRequest) servletRequestEvent.getServletRequest();
        System.out.println("\nDDD看看HttpServletRequest " + request.toString());
        HttpSession session = request.getSession();
        System.out.println("\nDDD那我在调用一次request.getSession()");
        request.getSession();

        System.out.println("\nDDD看看HttpSession" + session.getClass());
        //获取sessionId
        String sessionId = session.getId();
        String ip = request.getRemoteAddr();
        String page = request.getRequestURI();
        String user = (String) session.getAttribute("user");
        user = (user == null) ? "游客" : user;
        System.out.println("\nDDD ip是 " + ip + "的用户正在访问 " + page);
        System.out.println("sessionId是 " + sessionId);
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("\n\n\n 新的Request到来啦");
        HttpServletRequest request = (HttpServletRequest) servletRequestEvent.getServletRequest();
        System.out.println("\nRRR看看HttpServletRequest " + request.toString());
        HttpSession session = request.getSession();
        System.out.println("\nRRR那我在调用一次request.getSession()");
        request.getSession();

        System.out.println("\nRRR看看HttpSession" + session.toString());
        //获取sessionId
        String sessionId = session.getId();
        String ip = request.getRemoteAddr();
        String page = request.getRequestURI();
        String user = (String) session.getAttribute("user");
        user = (user == null) ? "游客" : user;
        System.out.println("\nRRR ip是 " + ip + "的用户正在访问 " + page);
        System.out.println("sessionId是 " + sessionId);
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("\n向application里添加属性了");
        ServletContext application = servletContextAttributeEvent.getServletContext();
        String name = servletContextAttributeEvent.getName();
        Object value = servletContextAttributeEvent.getValue();
        Object source = servletContextAttributeEvent.getSource();
        System.out.println(application + "范围添加了名为 " + name + "，值为" + value + "的属性，他的source是 " + source);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("\n向application里删除属性了");
        ServletContext application = servletContextAttributeEvent.getServletContext();
        String name = servletContextAttributeEvent.getName();
        Object value = servletContextAttributeEvent.getValue();
        Object source = servletContextAttributeEvent.getSource();
        System.out.println(application + "范围删除了名为 " + name + "，值为" + value + "的属性，他的source是 " + source);
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("\n向application里替代属性了");
        ServletContext application = servletContextAttributeEvent.getServletContext();
        String name = servletContextAttributeEvent.getName();
        Object value = servletContextAttributeEvent.getValue();
        Object source = servletContextAttributeEvent.getSource();
        System.out.println(application + "范围替代了名为 " + name + "，值为" + value + "的属性，他的source是 " + source);
    }
}
