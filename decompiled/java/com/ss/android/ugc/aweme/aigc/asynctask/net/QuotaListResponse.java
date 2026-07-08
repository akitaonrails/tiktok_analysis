package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class QuotaListResponse {

    @C09CT("quota_infos")
    public final List<QuotaResponItem> quotaInfos;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMessage;

    public QuotaListResponse() {
        this(null, null, "");
    }

    public QuotaListResponse(List<QuotaResponItem> list, Integer num, String str) {
        this.quotaInfos = list;
        this.statusCode = num;
        this.statusMessage = str;
    }
}
