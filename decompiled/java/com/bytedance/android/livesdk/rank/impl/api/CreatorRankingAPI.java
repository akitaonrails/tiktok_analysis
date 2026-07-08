package com.bytedance.android.livesdk.rank.impl.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import webcast.api.ranklist.RankInteractClickResponse;

/* JADX INFO: loaded from: classes18.dex */
public interface CreatorRankingAPI {
    @InterfaceC1501160pAQ("/webcast/ranklist/interact/click/")
    Object clickRankInteract(@InterfaceC1501070pAH("room_anchor_id") long j, @InterfaceC1501070pAH("to_anchor_id") long j2, @InterfaceC1501070pAH("interact_type") int i, @InterfaceC1501070pAH("click_type") int i2, @InterfaceC1501070pAH("room_id") long j3, InterfaceC1364105Vn<? super RankInteractClickResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/ranklist/list/v2/")
    Object getLiveCreatorRankingPageData(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("rank_type") String str, @InterfaceC1501070pAH("region_type") int i, @InterfaceC1501070pAH("gap_interval") long j3, @InterfaceC1501070pAH("use_simple_user") boolean z, @InterfaceC1501070pAH("league_phase") int i2, InterfaceC1364105Vn<? super RankListV2Response> interfaceC1364105Vn);
}
