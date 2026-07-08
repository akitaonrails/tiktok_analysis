package com.ss.android.ugc.aweme.ad.network;

import X.C11NZ;
import X.C999670c7Z;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes17.dex */
public interface VoteApi {
    public static final C999670c7Z LIZ = C999670c7Z.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/ad/experience/vote/")
    C11NZ<BaseResponse> sendVoteOption(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("creative_id") String str2, @InterfaceC1501050pAF("ad_id") String str3, @InterfaceC1501050pAF("vote_result") int i);
}
