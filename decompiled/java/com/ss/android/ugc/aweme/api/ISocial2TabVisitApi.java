package com.ss.android.ugc.aweme.api;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface ISocial2TabVisitApi {
    @InterfaceC1501170pAR("/tiktok/v1/friend/visit")
    C11NZ<BaseResponse> visitFriendsFeedV1();

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/friends/tab/visit")
    C11NZ<BaseResponse> visitSocial2Tab(@InterfaceC1501050pAF("landing_feed_type") Integer num, @InterfaceC1501050pAF("feeds_to_clear_red_point") String str);
}
