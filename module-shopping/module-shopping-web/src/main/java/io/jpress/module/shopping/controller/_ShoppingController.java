package io.jpress.module.shopping.controller;

import com.jfinal.aop.Inject;
import com.jfinal.config.Interceptors;
import com.jfinal.i18n.I18n;
import com.jfinal.i18n.I18nInterceptor;
import com.jfinal.i18n.Res;
import com.jfinal.kit.Ret;
import com.jfinal.plugin.activerecord.Page;
import io.jboot.utils.StrUtil;
import io.jboot.web.controller.annotation.RequestMapping;
import io.jpress.JPressConsts;
import io.jpress.JPressOptions;
import io.jpress.core.menu.annotation.AdminMenu;

import io.jpress.module.page.model.SinglePage;
import io.jpress.module.page.service.SinglePageService;
import io.jpress.module.shopping.model.Shopping;
import io.jpress.module.shopping.provider.ShoppingService;
import io.jpress.web.base.AdminControllerBase;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;

import java.util.Map;

@RequestMapping(value = "/admin/shopping",viewPath = JPressConsts.DEFAULT_ADMIN_VIEW)
public class _ShoppingController extends AdminControllerBase {


    @Inject
    private ShoppingService shoppingService;




    @Inject
    private SinglePageService sps;

    @AdminMenu(text = "品牌管理", groupId = "shopping")
    public void index() {


        String status = getPara("status");
        String title = getPara("title");

        Page<SinglePage> page =
                StrUtil.isBlank(status)
                        ? sps._paginateWithoutTrash(getPagePara(), 10, title)
                        : sps._paginateByStatus(getPagePara(), 10, title, status);

        setAttr("page", page);

        int draftCount = sps.findCountByStatus(SinglePage.STATUS_DRAFT);
        int trashCount = sps.findCountByStatus(SinglePage.STATUS_TRASH);
        int normalCount = sps.findCountByStatus(SinglePage.STATUS_NORMAL);

        setAttr("draftCount", draftCount);
        setAttr("trashCount", trashCount);
        setAttr("normalCount", normalCount);
        setAttr("totalCount", draftCount + trashCount + normalCount);
        setAttr("hahah","hahahha");

        render("shopping/page_list.html");
    }


    @AdminMenu(text = "商城页面", groupId = "shopping")
    public void shoppingPage(){
        // 通过locale参数en_US得到对应的Res对象
        Res resZh = I18n.use("zh_CN");
        // 直接获取数据
        String msgZh = resZh.get("msg");

        // 获取数据并使用参数格式化
        String msgZhFormat = resZh.format("msg", "詹波", new Date());
        System.out.println(msgZhFormat);
        setAttr("msg",msgZhFormat);
        render("shopping/shopping_page.html");
    }




    public void doSave() {

        String shopping_name = getPara("shopping_name");
        System.out.println(shopping_name);
        Integer shopping_price = Integer.parseInt(getPara("shopping_price"));
        String shopping_details = getPara("shopping_details");
        String shopping_moreImage = getPara("shopping_moreImage");
        String shopping_img = getPara("shopping_img");


        Shopping shopping = new Shopping().set("shopping_name", shopping_name).set("shopping_price", shopping_price).set("shopping_details", shopping_details).set("shopping_moreImage", shopping_moreImage).set("shopping_img", shopping_img);
        shoppingService.save(shopping);

        renderOkJson();
    }



    public void configInterceptor(Interceptors me) {
        me.add(new I18nInterceptor());
    }



}
