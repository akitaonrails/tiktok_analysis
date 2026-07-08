package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GIPActivityBase {

    @C09CT("activity_status")
    public int activityStatus;

    @C09CT("activity_type")
    public int activityType;

    @C09CT("distribution_type")
    public int distributionType;

    @C09CT("end_time")
    public long endTime;

    @C09CT("esports_tournament_id")
    public long esportsTournamentId;

    @C09CT("is_restream_live")
    public boolean isRestreamLive;

    @C09CT("need_creator_join")
    public boolean needCreatorJoin;

    @C09CT("settle_time")
    public long settleTime;

    @C09CT("start_time")
    public long startTime;

    @C09CT("statistics_limit")
    public int statisticsLimit;

    @C09CT("activity_id")
    public String activityId = "";

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("game_id")
    public String gameId = "";

    @C09CT("restream_types")
    public List<Integer> restreamTypes = new ArrayList();

    @C09CT("store_countries")
    public List<String> storeCountries = new ArrayList();
}
