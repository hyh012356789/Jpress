package io.jpress.module.shopping;

import com.jfinal.core.Controller;
import io.jpress.core.menu.MenuGroup;
import io.jpress.core.module.ModuleListener;
import io.jpress.core.module.ModuleListenerBase;

import java.util.List;

public class ShoppingModuleListener implements ModuleListener {

    @Override
    public String onRenderDashboardBox(Controller controller) {
        return null;
    }

    @Override
    public String onRenderToolsBox(Controller controller) {
        return null;
    }

    @Override
    public void onConfigAdminMenu(List<MenuGroup> adminMenus) {

        MenuGroup menuGroup = new MenuGroup();
        menuGroup.setId("shopping");
        menuGroup.setText("商城");
        menuGroup.setIcon("<i class=\"fa fa-fw fa-file\"></i>");
        menuGroup.setOrder(1);

        adminMenus.add(menuGroup);

    }

    @Override
    public void onConfigUcenterMenu(List<MenuGroup> ucenterMenus) {

    }
}
