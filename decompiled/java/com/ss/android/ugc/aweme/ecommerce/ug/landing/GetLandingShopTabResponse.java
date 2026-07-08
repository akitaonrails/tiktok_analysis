package com.ss.android.ugc.aweme.ecommerce.ug.landing;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class GetLandingShopTabResponse {

    @C09CT("bring_back_info")
    public final String backInfo;

    @C09CT("data")
    public final LandingShopTabData data;

    public GetLandingShopTabResponse(LandingShopTabData landingShopTabData, String str) {
        this.data = landingShopTabData;
        this.backInfo = str;
    }
}
