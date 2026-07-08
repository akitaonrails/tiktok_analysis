package com.ss.android.ugc.aweme.story.onthisday;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface OnThisDayRequestApi {
    @InterfaceC1501170pAR("/tiktok/v1/memorable/video/update/")
    Object sendViewedMemorableView(@InterfaceC1501070pAH("past_memory_key") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
