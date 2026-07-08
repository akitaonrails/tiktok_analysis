package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class TtsDecisionGetResponseMixMall {

    @C09CT("cooling_time")
    public final Long coolingTime;

    @C09CT("diversion_config")
    public final String diversionConfig;

    @C09CT("result_msg")
    public final String resultMsg;

    public TtsDecisionGetResponseMixMall() {
        this(null, null, null);
    }

    public TtsDecisionGetResponseMixMall(String str, Long l, String str2) {
        this.diversionConfig = str;
        this.coolingTime = l;
        this.resultMsg = str2;
    }
}
