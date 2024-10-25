package com.company.jmixpmflowbase.view.viewauditrecorddetail;

import com.company.jmixpmflowbase.view.main.MainView;
import com.company.viewaudit.annotation.IgnoreViewAudit;
import com.company.viewaudit.view.viewauditrecord.ViewAuditRecordDetailView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@IgnoreViewAudit
@Route(value = "viewAuditRecords/:id", layout = MainView.class)
@ViewController("va_ViewAuditRecord.detail")
@ViewDescriptor("ext-view-audit-record-detail-view.xml")
public class ExtViewAuditRecordDetailView extends ViewAuditRecordDetailView {
}