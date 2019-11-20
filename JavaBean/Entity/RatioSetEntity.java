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
 * RATIO_SET
 * 
 * @author bianj
 * @version 1.0.0 2019-11-06
 */
public class RatioSetEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3334590344069209448L;

    /** id */
    private Integer id;

    /** 最低消费 */
    private Double minimumConsumption;

    /** 提成比例 */
    private Double ratio;

    /** 添加日期 */
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
     * 获取最低消费
     * 
     * @return 最低消费
     */
    public Double getMinimumConsumption() {
        return this.minimumConsumption;
    }

    /**
     * 设置最低消费
     * 
     * @param minimumConsumption
     *          最低消费
     */
    public void setMinimumConsumption(Double minimumConsumption) {
        this.minimumConsumption = minimumConsumption;
    }

    /**
     * 获取提成比例
     * 
     * @return 提成比例
     */
    public Double getRatio() {
        return this.ratio;
    }

    /**
     * 设置提成比例
     * 
     * @param ratio
     *          提成比例
     */
    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    /**
     * 获取添加日期
     * 
     * @return 添加日期
     */
    public Timestamp getTime() {
        return this.time;
    }

    /**
     * 设置添加日期
     * 
     * @param time
     *          添加日期
     */
    public void setTime(Timestamp time) {
        this.time = time;
    }
}