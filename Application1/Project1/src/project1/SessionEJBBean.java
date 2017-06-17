package project1;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless(name = "SessionEJB", mappedName = "Application1-Project1-SessionEJB")
public class SessionEJBBean implements SessionEJB, SessionEJBLocal {
    @Resource
    SessionContext sessionContext;

    public SessionEJBBean() {
    }
}
