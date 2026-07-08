package com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes35.dex */
public final class AdPitayaReRankClientAbModel {

    @C09CT("business_name")
    public final String businessName;

    @C09CT("should_check_is_ads")
    public final boolean checkIsAds;

    @C09CT("core_task_name")
    public final String coreTaskName;

    @C09CT("should_data_source_change_optimization")
    public final boolean dataSourceChangeOptimization;

    @C09CT("delete_step_calculation")
    public final boolean delete_step_calculation;

    @C09CT("enable_pitaya_rerank")
    public final boolean enablePitayaReRank;

    @C09CT("input_shown_num")
    public final int input_shown_num;

    @C09CT("insert_check_post_roll")
    public final boolean insertCheckPostRoll;

    @C09CT("low_memory_optimization_android")
    public final long low_memory_optimization_android;

    @C09CT("min_floor_step")
    public final int minFloorStep;

    @C09CT("min_run_interval")
    public final int minRunInterval;

    @C09CT("pitaya_re_rank_ab_params")
    public final n pitayaReRankAbParams;

    @C09CT("post_on_viewholder_selected_ms")
    public final long postOnHolderSelectedDelay;

    @C09CT("prepare_task_name")
    public final String prepareTaskName;

    @C09CT("prune_pitaya_input_optimization")
    public final boolean prune_pitaya_input_optimization;

    @C09CT("recent_feed_count")
    public final int recentFeedCount;

    @C09CT("recent_pitaya_count")
    public final int recentPitayaCount;

    @C09CT("replace_insert_check")
    public final boolean replaceInsertCheck;

    @C09CT("replace_range_optimization")
    public final boolean replace_range_optimization_only_android;

    @C09CT("rerank_showtime_bugfix")
    public final boolean rerankShowtimeBugfix;

    @C09CT("rerank_trigger_check_show_optimization")
    public final boolean rerankTriggerCheckShowOptimization;

    @C09CT("rerank_trigger_only_check_show_trigger_source_6")
    public final boolean rerankTriggerOnlyCheckShownTriggerSource6;

    @C09CT("run_period")
    public final int runPeriod;

    @C09CT("should_block_for_same_items")
    public final boolean should_block_for_same_items;

    @C09CT("should_slide_optimization")
    public final boolean slideOptimization;

    @C09CT("should_support_cancel_rerank")
    public final boolean supportCancelReRank;

    @C09CT("should_timer_optimization")
    public final boolean timerOptimization;

    public AdPitayaReRankClientAbModel() {
        this(false, "tiktok_showtime_ad_gap", "prepare_item_structure", "adjust_items", 15, 8, 30, 30, 2, new n(), 350L, false, false, false, false, false, false, false, false, false, false, false, 6, false, false, 0L, false);
    }

    public AdPitayaReRankClientAbModel(boolean z, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, n nVar, long j, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i6, boolean z13, boolean z14, long j2, boolean z15) {
        this.enablePitayaReRank = z;
        this.businessName = str;
        this.prepareTaskName = str2;
        this.coreTaskName = str3;
        this.runPeriod = i;
        this.minRunInterval = i2;
        this.recentFeedCount = i3;
        this.recentPitayaCount = i4;
        this.minFloorStep = i5;
        this.pitayaReRankAbParams = nVar;
        this.postOnHolderSelectedDelay = j;
        this.timerOptimization = z2;
        this.slideOptimization = z3;
        this.checkIsAds = z4;
        this.supportCancelReRank = z5;
        this.dataSourceChangeOptimization = z6;
        this.insertCheckPostRoll = z7;
        this.replaceInsertCheck = z8;
        this.rerankTriggerCheckShowOptimization = z9;
        this.rerankTriggerOnlyCheckShownTriggerSource6 = z10;
        this.rerankShowtimeBugfix = z11;
        this.prune_pitaya_input_optimization = z12;
        this.input_shown_num = i6;
        this.delete_step_calculation = z13;
        this.replace_range_optimization_only_android = z14;
        this.low_memory_optimization_android = j2;
        this.should_block_for_same_items = z15;
    }
}
