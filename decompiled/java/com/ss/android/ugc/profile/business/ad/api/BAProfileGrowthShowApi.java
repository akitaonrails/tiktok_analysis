package com.ss.android.ugc.profile.business.ad.api;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface BAProfileGrowthShowApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/ad/ba/profile/message/show/")
    C11NZ<BaseResponse> sendMessageIsShown(@InterfaceC1501050pAF("message_id") String str);
}
