package com.company.jmixpmflowbase.view.viewauditrecordlist;

import com.company.jmixpmflowbase.view.main.MainView;
import com.company.viewaudit.annotation.IgnoreViewAudit;
import com.company.viewaudit.view.viewauditrecord.ViewAuditRecordListView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@IgnoreViewAudit
@Route(value = "viewAuditRecords", layout = MainView.class)
@ViewController("va_ViewAuditRecord.list")
@ViewDescriptor("ext-view-audit-record-list-view.xml")
public class ExtViewAuditRecordListView extends ViewAuditRecordListView {
}