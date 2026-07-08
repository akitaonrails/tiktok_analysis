package com.bytedance.android.livesdk.rank.impl.api;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;

/* JADX INFO: loaded from: classes.dex */
public interface AudienceRankingAPI {
    @InterfaceC1501170pAR("/aweme/v1/oec/live/rank/refresh/")
    Object getECommerceTopBuyerRankingInfo(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("source") long j3, @InterfaceC1501070pAH("use_simple_user") boolean z, InterfaceC1364105Vn<? super C470590Icr<EcomTopBuyerData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/ranklist/online_audience/")
    Object getTopViewerRankingInfo(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("source") long j3, @InterfaceC1501070pAH("use_simple_user") boolean z, InterfaceC1364105Vn<? super C470590Icr<OnlineRankListResponse>> interfaceC1364105Vn);
}
