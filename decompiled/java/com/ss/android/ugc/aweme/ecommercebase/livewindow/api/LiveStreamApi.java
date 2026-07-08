package com.ss.android.ugc.aweme.ecommercebase.livewindow.api;

import X.C0X52;
import X.C16E6;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;

/* JADX INFO: loaded from: classes32.dex */
public interface LiveStreamApi {
    public static final C16E6 LIZ = C16E6.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/oec/live/stream")
    Object getLiveStream(@InterfaceC1501070pAH("room_id") long j, InterfaceC1364105Vn<? super C0X52<BaseResponse<StreamUrlStruct>>> interfaceC1364105Vn);
}
