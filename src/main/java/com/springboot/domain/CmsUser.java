package com.springboot.domain;

import java.util.Date;

public class CmsUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.id
     *
     * @mbg.generated Tue Feb 06 13:41:54 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.name
     *
     * @mbg.generated Tue Feb 06 13:41:54 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.created_at
     *
     * @mbg.generated Tue Feb 06 13:41:54 CST 2018
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.id
     *
     * @return the value of cms_user.id
     *
     * @mbg.generated Tue Feb 06 13:41:54 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.id
     *
     * @param id the value for cms_user.id
     *
     * @mbg.generated Tue Feb 06 13:41:54 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.name
     *
     * @return the value of cms_user.name
     *
     * @mbg.generated Tue Feb 06 13:41:54 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.name
     *
     * @param name the value for cms_user.name
     *
     * @mbg.generated Tue Feb 06 13:41:54 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.created_at
     *
     * @return the value of cms_user.created_at
     *
     * @mbg.generated Tue Feb 06 13:41:54 CST 2018
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.created_at
     *
     * @param createdAt the value for cms_user.created_at
     *
     * @mbg.generated Tue Feb 06 13:41:54 CST 2018
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}