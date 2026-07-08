package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class RelationRankInfo {

    @C09CT("activity_id")
    public long activityId;

    @C09CT("ahead_by")
    public long aheadBy;

    @C09CT("behind_by")
    public long behindBy;

    @C09CT("behind_rank")
    public long behindRank;

    @C09CT("bonus_end_time")
    public long bonusEndTime;

    @C09CT("bonus_start_time")
    public long bonusStartTime;

    @C09CT("coin_to_point_factor")
    public long coinToPointFactor;

    @C09CT("cold_start_bonus_expire_time")
    public long coldStartBonusExpireTime;

    @C09CT("cold_start_bonus_point")
    public long coldStartBonusPoint;

    @C09CT("end_time")
    public long endTime;

    @C09CT("live_ranking_gift_factor")
    public long liveRankingGiftFactor;

    @C09CT("main_rank_has_more")
    public boolean mainRankHasMore;

    @C09CT("main_rank_next_offset")
    public long mainRankNextOffset;

    @C09CT("opt_out")
    public boolean optOut;

    @C09CT("point")
    public long point;

    @C09CT("rank")
    public long rank;

    @C09CT("risk_controlled")
    public boolean riskControlled;

    @C09CT("start_time")
    public long startTime;

    @C09CT("warm_up_time")
    public long warmUpTime;

    @C09CT("rank_rewards")
    public List<RelationRankReward> rankRewards = new ArrayList();

    @C09CT("live_ranking_gifts")
    public List<RelationRankGift> liveRankingGifts = new ArrayList();

    @C09CT("cp_rank_relations")
    public List<CPRankRelation> cpRankRelations = new ArrayList();

    @C09CT("main_rank_users")
    public List<MainRankUser> mainRankUsers = new ArrayList();
}
