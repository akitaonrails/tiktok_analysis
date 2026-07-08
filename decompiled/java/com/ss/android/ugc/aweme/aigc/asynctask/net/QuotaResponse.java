package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QuotaResponse {

    @C09CT("quotas")
    public final List<QuotaStruct> quotas;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMessage;

    public QuotaResponse() {
        this(null, null, "");
    }

    public QuotaResponse(List<QuotaStruct> list, Integer num, String str) {
        this.quotas = list;
        this.statusCode = num;
        this.statusMessage = str;
    }
}
