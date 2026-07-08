package com.ss.android.ugc.aweme.ecommerce.ug.promotion.api;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class EcUgDecisionGetResponse {

    @C09CT("cooling_time")
    public final Long coolingTime;

    @C09CT("diversion_config")
    public final String diversionConfig;

    @C09CT("result_msg")
    public final String resultMsg;

    public EcUgDecisionGetResponse() {
        this(null, null, null);
    }

    public EcUgDecisionGetResponse(String str, Long l, String str2) {
        this.diversionConfig = str;
        this.coolingTime = l;
        this.resultMsg = str2;
    }
}
