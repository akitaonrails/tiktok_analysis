package com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.api;

import X.C212216183a;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data.GetLiveTaskCardRequest;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data.LiveTaskCardData;

/* JADX INFO: loaded from: classes33.dex */
public interface FeedTaskCardApi {
    public static final C212216183a LIZ = C212216183a.LIZ;

    @InterfaceC1501170pAR("/api/v1/oec/affiliate/creator_activity/get_live_task_card")
    Object getLiveTaskCardData(@InterfaceC1485405rg GetLiveTaskCardRequest getLiveTaskCardRequest, InterfaceC1364105Vn<? super BaseResponse<LiveTaskCardData>> interfaceC1364105Vn);
}
