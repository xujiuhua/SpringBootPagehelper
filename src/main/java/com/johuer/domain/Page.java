package com.johuer.domain;

/**
 * ${DESCRIPTION}
 *
 * @author xujiuhua
 * @create 2016-11-09-22:09
 */
public class Page {

    private Integer pageNo = 1;
    private Integer pageSize = 10;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
