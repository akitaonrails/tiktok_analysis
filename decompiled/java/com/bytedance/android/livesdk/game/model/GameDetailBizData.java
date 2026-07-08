package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GameDetailBizData {

    @C09CT("attribution_info")
    public GameStationAttributionInfo attributionInfo;

    @C09CT("common")
    public DetailCommon common;

    @C09CT("esports_info")
    public EsportsTournamentInfo esportsInfo;

    @C09CT("game_detail_header_info")
    public GameDetailHeaderInfo gameDetailHeaderInfo;

    @C09CT("game_info")
    public GameStationGameInfo gameInfo;

    @C09CT("live_info")
    public GameDetailLiveInfo liveInfo;

    @C09CT("official_account")
    public GameStationGameOfficialAccount officialAccount;

    @C09CT("promote_task_info")
    public GameDetailPromoteTaskInfo promoteTaskInfo;

    @C09CT("videos")
    public FeedItemList videos;

    @C09CT("reward_list")
    public List<BriefBenefitInfo> rewardList = new ArrayList();

    @C09CT("activity_list")
    public List<GameStationOuterActivityInfo> activityList = new ArrayList();
}
