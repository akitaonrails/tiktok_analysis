package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PublisherTaskDetail {

    @C09CT("anchor_type")
    public int anchorType;

    @C09CT("bc_toggle_strategy")
    public int bcToggleStrategy;

    @C09CT("billing_indicator")
    public int billingIndicator;

    @C09CT("bonus_price_info")
    public BonusPriceInfo bonusPriceInfo;

    @C09CT("budget_control_threshold_percent")
    public float budgetControlThresholdPercent;

    @C09CT("content_required")
    public PublisherTaskContentRequired contentRequired;

    @C09CT("cpt_price_info")
    public CPTPriceInfo cptPriceInfo;

    @C09CT("create_ts")
    public long createTs;

    @C09CT("creator_task_join_info")
    public PublisherCreatorTaskJoinInfo creatorTaskJoinInfo;

    @C09CT("distribution_type")
    public int distributionType;

    @C09CT("end_ts")
    public long endTs;

    @C09CT("filter_store_country_enabled")
    public boolean filterStoreCountryEnabled;

    @C09CT("fixed_price_info")
    public FixedPriceInfo fixedPriceInfo;

    @C09CT("game_info")
    public PublisherTaskGameInfo gameInfo;

    @C09CT("has_joined")
    public boolean hasJoined;

    @C09CT("has_post_permission")
    public boolean hasPostPermission;

    @C09CT("has_sign_agreement")
    public boolean hasSignAgreement;

    @C09CT("header")
    public PublisherTaskHeader header;

    @C09CT("max_post_limit_day")
    public int maxPostLimitDay;

    @C09CT("max_post_limit_num")
    public int maxPostLimitNum;

    @C09CT("min_fans_limit")
    public int minFansLimit;

    @C09CT("not_display_budget")
    public boolean notDisplayBudget;

    @C09CT("note")
    public GBLGameRichText note;

    @C09CT("post_end_ts")
    public long postEndTs;

    @C09CT("post_requirement")
    public GBLGameRichText postRequirement;

    @C09CT("publish_start_ts")
    public long publishStartTs;

    @C09CT("remain_budget_percent")
    public float remainBudgetPercent;

    @C09CT("revision_limit")
    public long revisionLimit;

    @C09CT("start_ts")
    public long startTs;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("task_desc")
    public GBLGameRichText taskDesc;

    @C09CT("task_mode")
    public int taskMode;

    @C09CT("task_video_count")
    public long taskVideoCount;

    @C09CT("unit_price_increase_percent")
    public float unitPriceIncreasePercent;

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("task_name")
    public String taskName = "";

    @C09CT("remain_budget")
    public String remainBudget = "";

    @C09CT("total_budget")
    public String totalBudget = "";

    @C09CT("unit_price")
    public String unitPrice = "";

    @C09CT("post_forbid_types")
    public List<Integer> postForbidTypes = new ArrayList();

    @C09CT("reward_desc")
    public String rewardDesc = "";

    @C09CT("open_platform_extra")
    public String openPlatformExtra = "";

    @C09CT("cpa_unit_price")
    public String cpaUnitPrice = "";

    @C09CT("publisher_task_billing_layer_history_list")
    public List<PublisherTaskBillingLayerHistory> publisherTaskBillingLayerHistoryList = new ArrayList();

    @C09CT("pre_unit_price")
    public String preUnitPrice = "";

    @C09CT("link_hash_tag")
    public List<String> linkHashTag = new ArrayList();

    @C09CT("game_material_requirement")
    public List<String> gameMaterialRequirement = new ArrayList();

    @C09CT("game_material_multimedia")
    public String gameMaterialMultimedia = "";

    @C09CT("forbidden_behavior")
    public List<String> forbiddenBehavior = new ArrayList();

    @C09CT("remain_budget_int")
    public String remainBudgetInt = "";

    @C09CT("total_budget_int")
    public String totalBudgetInt = "";

    @C09CT("langs")
    public List<String> langs = new ArrayList();

    @C09CT("promote_billing_mode_list")
    public List<Integer> promoteBillingModeList = new ArrayList();
}
