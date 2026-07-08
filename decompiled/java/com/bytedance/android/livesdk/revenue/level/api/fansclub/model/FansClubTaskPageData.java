package com.bytedance.android.livesdk.revenue.level.api.fansclub.model;

import X.C09CT;
import tikcast.api.fans.FansGetTaskInfoResponse;
import tikcast.api.fans.UserPopularityInfo;
import webcast.data.FansLevelInfo;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubTaskPageData {

    @C09CT("old_level_info")
    public final FansLevelInfo lastLevelInfo;

    @C09CT("old_rank_info")
    public final UserPopularityInfo oldRankInfo;

    @C09CT("rank_first_info")
    public final RankFirstInfo rankFirstInfo;

    @C09CT("data")
    public final FansGetTaskInfoResponse.Data taskInfoData;

    public FansClubTaskPageData(FansLevelInfo fansLevelInfo, UserPopularityInfo userPopularityInfo, RankFirstInfo rankFirstInfo, FansGetTaskInfoResponse.Data data) {
        this.lastLevelInfo = fansLevelInfo;
        this.oldRankInfo = userPopularityInfo;
        this.rankFirstInfo = rankFirstInfo;
        this.taskInfoData = data;
    }
}
