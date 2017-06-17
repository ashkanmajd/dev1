package project1;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.jws.WebService;

@Stateless(name = "SessionEJB", mappedName = "Application1-Project1-SessionEJB")
@WebService
public class SessionEJBBean implements SessionEJB, SessionEJBLocal {
    @Resource
    SessionContext sessionContext;

    public SessionEJBBean() {
    }
}
