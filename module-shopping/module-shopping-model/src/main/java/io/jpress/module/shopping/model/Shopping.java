package io.jpress.module.shopping.model;


import io.jboot.db.annotation.Table;
import io.jpress.module.shopping.model.base.BaseShopping;


@Table(tableName = "shopping" ,primaryKey = "id")
public class Shopping extends BaseShopping<Shopping> {



}
