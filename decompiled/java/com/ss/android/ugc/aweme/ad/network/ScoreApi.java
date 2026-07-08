package com.ss.android.ugc.aweme.ad.network;

import X.C1048710dOf;
import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes17.dex */
public interface ScoreApi {
    public static final C1048710dOf LIZ = C1048710dOf.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/ad/experience/ad/history/rating/")
    C11NZ<BaseResponse> sendScoreOption(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("advertiser_id") String str2, @InterfaceC1501050pAF("ad_id") String str3, @InterfaceC1501050pAF("creative_id") String str4, @InterfaceC1501050pAF("send_notice_time") int i, @InterfaceC1501050pAF("rating") int i2, @InterfaceC1501050pAF("experience_ad_type") int i3, @InterfaceC1501050pAF("msg_extra") String str5);
}
