package com.company.jmixpmflowbase.view.resourcerolemodellist;

import com.company.jmixpmflowbase.view.main.MainView;
import com.company.viewaudit.annotation.IgnoreViewAudit;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import io.jmix.securityflowui.view.resourcerole.ResourceRoleModelListView;

@IgnoreViewAudit
@Route(value = "sec/resourcerolemodels", layout = MainView.class)
@ViewController("sec_ResourceRoleModel.list")
@ViewDescriptor("ext-resource-role-model-list-view.xml")
public class ExtResourceRoleModelListView extends ResourceRoleModelListView {
}