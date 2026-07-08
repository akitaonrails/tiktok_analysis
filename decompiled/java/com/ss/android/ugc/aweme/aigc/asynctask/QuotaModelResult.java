package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;

/* JADX INFO: loaded from: classes6.dex */
public final class QuotaModelResult {

    @C09CT("extra")
    public final String extra;

    @C09CT("quota_result")
    public final QuotaResult quotaResult;

    @C09CT("req_key")
    public final String reqKey;

    public QuotaModelResult() {
        this(null, null, null);
    }

    public QuotaModelResult(String str, QuotaResult quotaResult, String str2) {
        this.reqKey = str;
        this.quotaResult = quotaResult;
        this.extra = str2;
    }
}
