package com.bytedance.android.livesdk.rank.impl.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.rank.model.RankEntranceRefreshResponse;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import java.util.List;
import webcast.api.ranklist.RankInteractListResponse;

/* JADX INFO: loaded from: classes18.dex */
public interface RankApi {
    @InterfaceC1501160pAQ("/webcast/ranklist/offline/list/")
    C11NZ<String> getOfflineRankList(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("rank_types") int i, @InterfaceC1501070pAH("gap_interval") long j2, @InterfaceC1501070pAH("without_rank_type") boolean z, @InterfaceC1501070pAH("use_simple_user") boolean z2);

    @InterfaceC1501160pAQ("/webcast/ranklist/online_audience/")
    C11NZ<String> getOnlineRankList(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("source") int i, @InterfaceC1501070pAH("use_simple_user") boolean z);

    @InterfaceC1501160pAQ("/webcast/ranklist/entrance/v3/")
    C11NZ<String> getRankEntrancesV3(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("room_id") long j2);

    @InterfaceC1501160pAQ("/webcast/ranklist/interact/list/")
    C11NZ<RankInteractListResponse> getRankInteractList(@InterfaceC1501070pAH("room_anchor_id") long j, @InterfaceC1501070pAH("to_anchor_id") long j2, @InterfaceC1501070pAH("interact_type") int i);

    @InterfaceC1501160pAQ("/webcast/ranklist/list/v2/")
    C11NZ<String> getRankListV2(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("rank_type") String str, @InterfaceC1501070pAH("region_type") int i, @InterfaceC1501070pAH("gap_interval") long j3, @InterfaceC1501070pAH("use_simple_user") boolean z, @InterfaceC1501070pAH("league_phase") int i2);

    @InterfaceC1501160pAQ("/webcast/ranklist/entrance/refresh")
    C11NZ<RankEntranceRefreshResponse> notifyRankingEntranceRefresh(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/ranklist/entrance/v3/")
    C11NZ<C470590Icr<List<RankEntranceV3Response.EntranceGroup>>> queryRankEntrancesV3(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("room_id") long j2);
}
