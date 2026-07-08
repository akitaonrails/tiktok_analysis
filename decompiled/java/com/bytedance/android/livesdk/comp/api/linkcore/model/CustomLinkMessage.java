package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class CustomLinkMessage {
    public final BizContentWrapper bizContentWrapper;
    public final int businessId;
    public final ExtraDataWrapper extra;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomLinkMessage(businessId=");
        sbLIZ.append(this.businessId);
        sbLIZ.append(", bizContentWrapper=");
        sbLIZ.append(this.bizContentWrapper);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CustomLinkMessage(int i, BizContentWrapper bizContentWrapper, ExtraDataWrapper extraDataWrapper) {
        this.businessId = i;
        this.bizContentWrapper = bizContentWrapper;
        this.extra = extraDataWrapper;
    }
}
