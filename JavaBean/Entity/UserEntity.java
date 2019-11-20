/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.8
 */

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Date;

/**
 * USER
 * 
 * @author bianj
 * @version 1.0.0 2019-11-06
 */
public class UserEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4037082195140431782L;

    /** id */
    private Integer id;

    /** openid */
    private String openId;

    /** 用户姓名 */
    private String name;

    /** 电话 */
    private String iphone;

    /** 邮箱 */
    private String email;

    /** 角色（0客户,1用户,2店内业务员,3超级管理员） */
    private String role;

    /** 注册时间 */
    private Date registerTime;

    /** image */
    private Blob image;

    /** 修改者 */
    private String updateBy;

    /** 修改时间 */
    private Timestamp updateTime;

    /**
     * 获取id
     * 
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置id
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取openid
     * 
     * @return openid
     */
    public String getOpenId() {
        return this.openId;
    }

    /**
     * 设置openid
     * 
     * @param openId
     *          openid
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取用户姓名
     * 
     * @return 用户姓名
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置用户姓名
     * 
     * @param name
     *          用户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取电话
     * 
     * @return 电话
     */
    public String getIphone() {
        return this.iphone;
    }

    /**
     * 设置电话
     * 
     * @param iphone
     *          电话
     */
    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    /**
     * 获取邮箱
     * 
     * @return 邮箱
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 设置邮箱
     * 
     * @param email
     *          邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取角色（0客户,1用户,2店内业务员,3超级管理员）
     * 
     * @return 角色（0客户
     */
    public String getRole() {
        return this.role;
    }

    /**
     * 设置角色（0客户,1用户,2店内业务员,3超级管理员）
     * 
     * @param role
     *          角色（0客户
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 获取注册时间
     * 
     * @return 注册时间
     */
    public Date getRegisterTime() {
        return this.registerTime;
    }

    /**
     * 设置注册时间
     * 
     * @param registerTime
     *          注册时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取image
     * 
     * @return image
     */
    public Blob getImage() {
        return this.image;
    }

    /**
     * 设置image
     * 
     * @param image
     */
    public void setImage(Blob image) {
        this.image = image;
    }

    /**
     * 获取修改者
     * 
     * @return 修改者
     */
    public String getUpdateBy() {
        return this.updateBy;
    }

    /**
     * 设置修改者
     * 
     * @param updateBy
     *          修改者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取修改时间
     * 
     * @return 修改时间
     */
    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    /**
     * 设置修改时间
     * 
     * @param updateTime
     *          修改时间
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}