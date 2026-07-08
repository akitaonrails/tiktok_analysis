package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class BriefLivePublisherTask {

    @C09CT("cpa_price")
    public PublisherTaskCPAPrice cpaPrice;

    @C09CT("end_ts")
    public long endTs;

    @C09CT("game_link_type")
    public int gameLinkType;

    @C09CT("is_joined")
    public boolean isJoined;

    @C09CT("not_display_budget")
    public boolean notDisplayBudget;

    @C09CT("recruit_type")
    public int recruitType;

    @C09CT("start_ts")
    public long startTs;

    @C09CT("task_mode")
    public int taskMode;

    @C09CT("task_status")
    public int taskStatus;

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("game_id")
    public String gameId = "";

    @C09CT("game_name")
    public String gameName = "";

    @C09CT("game_icon")
    public String gameIcon = "";

    @C09CT("estimated_earnings")
    public String estimatedEarnings = "";

    @C09CT("unit_price")
    public String unitPrice = "";

    @C09CT("max_earnings")
    public String maxEarnings = "";

    @C09CT("task_name")
    public String taskName = "";

    @C09CT("cps_price_list")
    public List<CpsPrice> cpsPriceList = new ArrayList();
}
