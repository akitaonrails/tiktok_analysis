package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class LivePublisherTaskDetail {

    @C09CT("budget_control")
    public int budgetControl;

    @C09CT("cpa_price")
    public PublisherTaskCPAPrice cpaPrice;

    @C09CT("end_ts")
    public long endTs;

    @C09CT("game_link_type")
    public int gameLinkType;

    @C09CT("has_joined_history")
    public boolean hasJoinedHistory;

    @C09CT("is_joined")
    public boolean isJoined;

    @C09CT("max_complete_times")
    public long maxCompleteTimes;

    @C09CT("reached_max_times")
    public boolean reachedMaxTimes;

    @C09CT("recruit_type")
    public int recruitType;

    @C09CT("remain_budget_percent")
    public float remainBudgetPercent;

    @C09CT("start_ts")
    public long startTs;

    @C09CT("summary_info")
    public LivePublisherTaskSummaryInfo summaryInfo;

    @C09CT("task_mode")
    public int taskMode;

    @C09CT("task_offline_reason")
    public int taskOfflineReason;

    @C09CT("task_requirement")
    public LivePublisherTaskDetailRequirement taskRequirement;

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

    @C09CT("remain_budget")
    public String remainBudget = "";

    @C09CT("total_budget")
    public String totalBudget = "";

    @C09CT("unit_price")
    public String unitPrice = "";

    @C09CT("max_earnings")
    public String maxEarnings = "";

    @C09CT("game_tag_id")
    public String gameTagId = "";

    @C09CT("cps_price_list")
    public List<CpsPrice> cpsPriceList = new ArrayList();
}
