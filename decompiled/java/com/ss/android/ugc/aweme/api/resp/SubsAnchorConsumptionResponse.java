package com.ss.android.ugc.aweme.api.resp;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class SubsAnchorConsumptionResponse {

    @C09CT("jump_url")
    public final String jumpUrl;

    @C09CT("subscribe_state")
    public final Integer subscribeStatus;

    public SubsAnchorConsumptionResponse() {
        this(null, null);
    }

    public SubsAnchorConsumptionResponse(String str, Integer num) {
        this.jumpUrl = str;
        this.subscribeStatus = num;
    }
}
