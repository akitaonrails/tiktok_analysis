package com.ss.android.ugc.aweme.home.repo.network.data;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class HomepageSchemaRequest {

    @C09CT("auth_type")
    public final String authType;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("priority_region")
    public final String priorityRegion;

    public HomepageSchemaRequest(String str, String str2, String str3, String str4) {
        this.enterFrom = str;
        this.priorityRegion = str2;
        this.authType = str3;
        this.merchantId = str4;
    }
}
