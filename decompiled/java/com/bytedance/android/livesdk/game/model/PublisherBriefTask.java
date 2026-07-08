package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class PublisherBriefTask {

    @C09CT("bonus_price_info")
    public BonusPriceInfo bonusPriceInfo;

    @C09CT("end_time")
    public long endTime;

    @C09CT("fixed_price_info")
    public FixedPriceInfo fixedPriceInfo;

    @C09CT("host_platform_type")
    public int hostPlatformType;

    @C09CT("mode")
    public int mode;

    @C09CT("not_display_budget")
    public boolean notDisplayBudget;

    @C09CT("post_end_ts")
    public long postEndTs;

    @C09CT("publisher_start_ts")
    public long publisherStartTs;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("task_type")
    public int taskType;

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("task_name")
    public String taskName = "";

    @C09CT("game_name")
    public String gameName = "";

    @C09CT("game_logo")
    public String gameLogo = "";

    @C09CT("game_id")
    public String gameId = "";

    @C09CT("max_earnings")
    public String maxEarnings = "";
}
