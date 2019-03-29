package io.jpress.module.store.model.base;

/**
 * 品牌属性
 * @author jie
 * @date
 * @param <M>
 */
public class BaseBrand<M extends BaseBrand<M>> extends BaseEntity<M> {

    public void setBrandName(String key) {
        set("name", key);
    }

    public String getBrandName() {
        return getStr("name");
    }


    public void setBrandLogo(String key) {
        set("img_url", key);
    }

    public String getBrandLogo() {
        return getStr("img_url");
    }


    public void setBrandDescription(String key) {
        set("description", key);
    }

    public String getBrandDescription() {
        return getStr("description");
    }









}
