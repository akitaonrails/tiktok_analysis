package com.bytedance.pipo.googlepay.pushprovisioning.api;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class BizContent {

    @C09CT("app_version")
    public final String appVersion;

    @C09CT("card_id")
    public final String cardId;

    @C09CT("one_time_token")
    public final String oneTimeToken;

    @C09CT("wuid")
    public final String wuid;

    public BizContent() {
        this("", "", "", "");
    }

    public BizContent(String str, String str2, String str3, String str4) {
        this.wuid = str;
        this.cardId = str2;
        this.oneTimeToken = str3;
        this.appVersion = str4;
    }
}
