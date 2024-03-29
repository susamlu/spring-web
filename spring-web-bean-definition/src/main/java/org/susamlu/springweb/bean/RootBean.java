package org.susamlu.springweb.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lxc
 * @date 2023/03/17
 */
public class RootBean {

    public RootBean() {
        System.out.println("init RootBean");
    }

    private String field;

    public void setField(String field) {
        this.field = field;
    }

    @Autowired
    private ChildBean childBean;

    public void setChildBean(ChildBean childBean) {
        this.childBean = childBean;
    }

    public void doSomething() {
        System.out.println("from root bean, field: " + field + ", childBean: " + childBean);
    }

}
