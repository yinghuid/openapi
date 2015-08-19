package com.letv.cdn.openapi.pojo;

import org.springframework.util.StringUtils;

import com.letv.cdn.openapi.utils.Env;

public class CoopDomain {
    
    /** 0 禁用 */
    public final static Short ACTION_DISABLE = 0;
    /** 1 不可拖拽小文件 */
    public final static Short ACTION_ENABLE_SMALL_FILE = 1;
    /** 2 可拖拽小文件 */
    public final static Short ACTION_ENABLE_SMALL_FILE_MOVE = 2;
    /** 9 大文件预分发 */
    public final static Short ACTION_ENABLE_BIG_FILE = 9;
    /** 0 禁用 */
    public final static Short FLAG_DISABLE = 0;
    /** 1 启用 */
    public final static Short FLAG_ENABLE = 1;
    
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coop_domain.DOMAIN
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    private String domain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coop_domain.USERID
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coop_domain.USERTAG
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    private String usertag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coop_domain.FRONTCDN
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    private String frontcdn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coop_domain.SOURCE
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coop_domain.SRCDX
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    private String srcdx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coop_domain.SRCLT
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    private String srclt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coop_domain.QUERYHOST
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    private String queryhost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coop_domain.SRCISP
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    private Short srcisp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coop_domain.ACTION
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    private Short action;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coop_domain.ONTEST
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    private Short ontest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coop_domain.REMARK
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    private String remark;
    
    /**
     * 回源域名
     */
    private String setHost;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coop_domain.DOMAIN
     *
     * @return the value of tb_coop_domain.DOMAIN
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * 获取提交调度系统时传的domain，使用queryhost实现不同域名文件共享<br/>
     * <b>Method</b>: CoopDomain#getSubDomain <br/>
     * <b>Create Date</b> : 2015年6月1日
     * @author Chen Hao
     * @return  
     * @return String
     */
    public String getSubDomain() {
        return StringUtils.hasLength(queryhost) ? queryhost : domain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coop_domain.DOMAIN
     *
     * @param domain the value for tb_coop_domain.DOMAIN
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coop_domain.USERID
     *
     * @return the value of tb_coop_domain.USERID
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coop_domain.USERID
     *
     * @param userid the value for tb_coop_domain.USERID
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coop_domain.USERTAG
     *
     * @return the value of tb_coop_domain.USERTAG
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public String getUsertag() {
        return usertag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coop_domain.USERTAG
     *
     * @param usertag the value for tb_coop_domain.USERTAG
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public void setUsertag(String usertag) {
        this.usertag = usertag == null ? null : usertag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coop_domain.FRONTCDN
     *
     * @return the value of tb_coop_domain.FRONTCDN
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public String getFrontcdn() {
        return frontcdn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coop_domain.FRONTCDN
     *
     * @param frontcdn the value for tb_coop_domain.FRONTCDN
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public void setFrontcdn(String frontcdn) {
        this.frontcdn = frontcdn == null ? null : frontcdn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coop_domain.SOURCE
     *
     * @return the value of tb_coop_domain.SOURCE
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coop_domain.SOURCE
     *
     * @param source the value for tb_coop_domain.SOURCE
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coop_domain.SRCDX
     *
     * @return the value of tb_coop_domain.SRCDX
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public String getSrcdx() {
        return srcdx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coop_domain.SRCDX
     *
     * @param srcdx the value for tb_coop_domain.SRCDX
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public void setSrcdx(String srcdx) {
        this.srcdx = srcdx == null ? null : srcdx.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coop_domain.SRCLT
     *
     * @return the value of tb_coop_domain.SRCLT
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public String getSrclt() {
        return srclt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coop_domain.SRCLT
     *
     * @param srclt the value for tb_coop_domain.SRCLT
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public void setSrclt(String srclt) {
        this.srclt = srclt == null ? null : srclt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coop_domain.QUERYHOST
     *
     * @return the value of tb_coop_domain.QUERYHOST
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public String getQueryhost() {
        return queryhost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coop_domain.QUERYHOST
     *
     * @param queryhost the value for tb_coop_domain.QUERYHOST
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public void setQueryhost(String queryhost) {
        this.queryhost = queryhost == null ? null : queryhost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coop_domain.SRCISP
     *
     * @return the value of tb_coop_domain.SRCISP
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public Short getSrcisp() {
        return srcisp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coop_domain.SRCISP
     *
     * @param srcisp the value for tb_coop_domain.SRCISP
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public void setSrcisp(Short srcisp) {
        this.srcisp = srcisp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coop_domain.ACTION
     *
     * @return the value of tb_coop_domain.ACTION
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public Short getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coop_domain.ACTION
     *
     * @param action the value for tb_coop_domain.ACTION
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public void setAction(Short action) {
        this.action = action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coop_domain.ONTEST
     *
     * @return the value of tb_coop_domain.ONTEST
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public Short getOntest() {
        return ontest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coop_domain.ONTEST
     *
     * @param ontest the value for tb_coop_domain.ONTEST
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public void setOntest(Short ontest) {
        this.ontest = ontest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coop_domain.REMARK
     *
     * @return the value of tb_coop_domain.REMARK
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coop_domain.REMARK
     *
     * @param remark the value for tb_coop_domain.REMARK
     *
     * @mbggenerated Mon Jun 01 11:09:06 CST 2015
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    
    public String getDomaintag() {
        return this.usertag;
    }
    
    public String getCname() {
        return Env.get("cname_domain");
    }
    
    public int getFlag() {
        if (this.action == ACTION_ENABLE_BIG_FILE || this.action == ACTION_ENABLE_SMALL_FILE_MOVE) {
            return FLAG_ENABLE;
        } else {
            return FLAG_DISABLE;
        }
    }
    
    public int getType() {
    	return this.action;
    }

	public String getSetHost() {
		return setHost;
	}

	public void setSetHost(String setHost) {
		this.setHost = setHost;
	}
}