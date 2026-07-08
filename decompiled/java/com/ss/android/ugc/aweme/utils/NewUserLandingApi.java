package com.ss.android.ugc.aweme.utils;

import X.C040I;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501240pAY;

/* JADX INFO: loaded from: classes14.dex */
public interface NewUserLandingApi {
    @InterfaceC1501240pAY("/tiktok/ug/landing/ads/attribution_event/post/v1/")
    C11NZ<UploadAttributionDataRes> LIZ(@C040I AttributionData attributionData, @InterfaceC1501120pAM("gaid") String str);

    @InterfaceC1501160pAQ("/tiktok/ug/landing/ads/dest/get/v1")
    C11NZ<AttributionInfoResponse> getGoogleAttributionInfo(@InterfaceC1501070pAH("gaid") String str, @InterfaceC1501070pAH("ssaid") String str2);
}
