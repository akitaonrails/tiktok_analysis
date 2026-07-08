package com.ss.android.ugc.aweme.offlinemode.api;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class InspectItemResponse {

    @C09CT("impr_id")
    public final String imprId;

    @C09CT("item_status")
    public final String itemStatus;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public InspectItemResponse() {
        this(0, "", "", "");
    }

    public InspectItemResponse(int i, String str, String str2, String str3) {
        this.statusCode = i;
        this.statusMsg = str;
        this.imprId = str2;
        this.itemStatus = str3;
    }
}
