package Chat.domain;

import javax.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
