package com.ss.android.ugc.tiktok.addyours.collection;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursCollectionTopicsResp;

/* JADX INFO: loaded from: classes.dex */
public interface AddYoursCollectionApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/addyours/topic/collect")
    Object collectAddYoursTopic(@InterfaceC1501050pAF("topic_id") long j, @InterfaceC1501050pAF("action") int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/addyours/collection/topics")
    Object getAddYoursCollectionList(@InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, InterfaceC1364105Vn<? super AddYoursCollectionTopicsResp> interfaceC1364105Vn);
}
