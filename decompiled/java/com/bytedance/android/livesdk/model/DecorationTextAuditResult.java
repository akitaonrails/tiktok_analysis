package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class DecorationTextAuditResult {

    @C09CT("audit_nopass_warn")
    public String auditNotPassWarnText;

    @C09CT("audit_status")
    public int auditStatus;

    public String getAuditNotPassWarnText() {
        return this.auditNotPassWarnText;
    }

    public int getAuditStatus() {
        return this.auditStatus;
    }

    public void setAuditNotPassWarnText(String str) {
        this.auditNotPassWarnText = str;
    }

    public void setAuditStatus(int i) {
        this.auditStatus = i;
    }
}
