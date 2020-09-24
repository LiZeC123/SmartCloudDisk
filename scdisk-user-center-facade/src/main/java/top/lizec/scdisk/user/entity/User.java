package top.lizec.scdisk.user.entity;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private Integer role;
    private Date createTime;
    private Date modifiedTime;
}
