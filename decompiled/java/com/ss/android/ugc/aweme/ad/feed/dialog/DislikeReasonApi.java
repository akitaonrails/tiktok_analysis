package com.ss.android.ugc.aweme.ad.feed.dialog;

import X.C11NZ;
import X.C312900COi;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface DislikeReasonApi {
    public static final C312900COi LIZ = C312900COi.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/ad/experience/dislike/")
    C11NZ<BaseResponse> submitReason(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("ad_id") String str2, @InterfaceC1501050pAF("creative_id") String str3, @InterfaceC1501050pAF("dislike_reasons") String str4, @InterfaceC1501050pAF("log_extra") String str5, @InterfaceC1501050pAF("room_id") String str6);
}
