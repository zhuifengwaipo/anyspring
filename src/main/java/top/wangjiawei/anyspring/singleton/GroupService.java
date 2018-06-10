package top.wangjiawei.anyspring.singleton;

/**
 * @author wangjiawei
 * description:
 * date 2018/6/7 22:47
 */
public class GroupService {

    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void say() {
        System.out.println(this.getClass().getName() + " : " + userDAO.getUsername());
    }
}
