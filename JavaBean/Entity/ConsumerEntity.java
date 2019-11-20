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

import java.sql.Timestamp;

/**
 * CONSUMER
 * 
 * @author bianj
 * @version 1.0.0 2019-11-06
 */
public class ConsumerEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 5310828920518208273L;

    /** id */
    private Integer id;

    /** 客户姓名 */
    private String name;

    /** 客户电话 */
    private String iphone;

    /** 进店人数 */
    private Integer num;

    /** 消费金额 */
    private Double money;

    /** 上级（用户） */
    private String superior;

    /** 提成 */
    private Double income;

    /** 插入时间 */
    private Timestamp time;

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
     * 获取客户姓名
     * 
     * @return 客户姓名
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置客户姓名
     * 
     * @param name
     *          客户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取客户电话
     * 
     * @return 客户电话
     */
    public String getIphone() {
        return this.iphone;
    }

    /**
     * 设置客户电话
     * 
     * @param iphone
     *          客户电话
     */
    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    /**
     * 获取进店人数
     * 
     * @return 进店人数
     */
    public Integer getNum() {
        return this.num;
    }

    /**
     * 设置进店人数
     * 
     * @param num
     *          进店人数
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取消费金额
     * 
     * @return 消费金额
     */
    public Double getMoney() {
        return this.money;
    }

    /**
     * 设置消费金额
     * 
     * @param money
     *          消费金额
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * 获取上级（用户）
     * 
     * @return 上级（用户）
     */
    public String getSuperior() {
        return this.superior;
    }

    /**
     * 设置上级（用户）
     * 
     * @param superior
     *          上级（用户）
     */
    public void setSuperior(String superior) {
        this.superior = superior;
    }

    /**
     * 获取提成
     * 
     * @return 提成
     */
    public Double getIncome() {
        return this.income;
    }

    /**
     * 设置提成
     * 
     * @param income
     *          提成
     */
    public void setIncome(Double income) {
        this.income = income;
    }

    /**
     * 获取插入时间
     * 
     * @return 插入时间
     */
    public Timestamp getTime() {
        return this.time;
    }

    /**
     * 设置插入时间
     * 
     * @param time
     *          插入时间
     */
    public void setTime(Timestamp time) {
        this.time = time;
    }
}