package io.jpress.module.shopping.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jboot.db.model.JbootModel;

public abstract class BaseShopping<M extends BaseShopping<M>> extends JbootModel<M> implements IBean {

    public void setId(java.lang.Long id) {
        set("id", id);
    }

    public java.lang.Long getId() {
        return getLong("id");
    }


    public void setShopping_name(java.lang.String key) {
        set("key", key);
    }

    public java.lang.String getShopping_name() {
        return getStr("key");
    }


    public void setShopping_price(java.lang.String key) {
        set("key", key);
    }

    public java.lang.String getShopping_price() {
        return getStr("key");
    }


    public void setShopping_details(java.lang.String key) {
        set("key", key);
    }

    public java.lang.String getShopping_details() {
        return getStr("key");
    }


    public void setShopping_moreImage(java.lang.String key) {
        set("key", key);
    }

    public java.lang.String getShopping_moreImage() {
        return getStr("key");
    }



    public void setShopping_img(java.lang.String key) {
        set("key", key);
    }

    public java.lang.String getShopping_img() {
        return getStr("key");
    }



}
