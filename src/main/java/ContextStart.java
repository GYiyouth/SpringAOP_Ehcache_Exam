/**
 * Created by geyao on 2017/3/4.
 */

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.*;
import java.util.Hashtable;
import java.util.Map;

public class ContextStart implements ServletContextListener,
        HttpSessionListener {

    // Public constructor is required by servlet spec
    public ContextStart() {
        super();
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
        System.out.println("\n\n\n  应用启动了");
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
        System.out.println("\n\n\n应用关闭了");
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    /**
     * session开始、创建时实现
     * @param se
     */
    public void sessionCreated(HttpSessionEvent se) {
      /* Session is created. */
        System.out.println("\n\n\nsessionCreated");
        System.out.println("session开始啦 " + this.getClass());
        System.out.println("看看现在HttpSessionEvent se里有什么 " + se.toString());
        HttpSession session = se.getSession();
        System.out.println("看看现在的HttpSession有什么 " + session.toString());
        ServletContext application = session.getServletContext();
        System.out.println("看看现在的ServletContext是什么 " + application.toString());
        String sessionId = session.getId();
        System.out.println("看看sessionId呢 " + sessionId);
        //如果是新的session
        if (session.isNew()){
            String user = (String) session.getAttribute("user");
            user = (user == null) ? "游客" : user;
            System.out.println("user是游客吗 " + user);
            Map<String, String> online = (Map<String, String>) application.getAttribute("online");
            if (online == null){
                online = new Hashtable<String, String>();
            }
            online.put(sessionId, user);
            application.setAttribute("online", online);
        }
    }

    /**
     * 会话断开，销毁时实现
     * @param se
     */
    public void sessionDestroyed(HttpSessionEvent se) {
      /* Session is destroyed. */
        System.out.println("\n\n\nsessionDestroyed");
        System.out.println("会话被销毁" + this.getClass());
        System.out.println("看看现在HttpSessionEvent se里有什么 " + se.toString());
        HttpSession session = se.getSession();
        System.out.println("看看现在的HttpSession有什么 " + session);
        ServletContext application = session.getServletContext();
        System.out.println("看看现在的ServletContext是什么 " + application);
        String sessionId = session.getId();
        System.out.println("看看sessionId呢 " + sessionId);
        Map<String, String> online = (Map<String, String>)application.getAttribute("online");
        if (online!=null){
            online.remove(sessionId);
        }
        application.setAttribute("online", online);
    }
}
