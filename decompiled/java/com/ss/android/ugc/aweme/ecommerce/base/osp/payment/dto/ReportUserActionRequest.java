package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ReportUserActionRequest {

    @C09CT("action_type")
    public final String actionType;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("operation_type")
    public final String operationType;

    public ReportUserActionRequest() {
        this(null, null, null, null);
    }

    public ReportUserActionRequest(String str, String str2, String str3, String str4) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.operationType = str3;
        this.actionType = str4;
    }
}
