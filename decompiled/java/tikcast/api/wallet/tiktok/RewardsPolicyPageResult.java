package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class RewardsPolicyPageResult {

    @C09CT("data")
    public RewardsPolicyPageData data;

    public static final class RewardsPolicyPageData {

        @C09CT("content_quality_adjustment")
        public ContentQualityAdjustment contentQualityAdjustment;

        @C09CT("decoupling_ab_group")
        public int decouplingAbGroup;

        @C09CT("is_mission_changed")
        public boolean isMissionChanged;

        @C09CT("show_penetration_ui")
        public boolean showPenetrationUi;

        @C09CT("update_timestamp")
        public long updateTimestamp;

        @C09CT("max_per_live_reward_percentage")
        public String maxPerLiveRewardPercentage = "";

        @C09CT("max_weekly_bonus_percentage")
        public String maxWeeklyBonusPercentage = "";

        @C09CT("per_live_reward_factors")
        public List<RewardFactorItem> perLiveRewardFactors = new ArrayList();

        @C09CT("weekly_bonus_factors")
        public List<RewardFactorItem> weeklyBonusFactors = new ArrayList();

        @C09CT("reward_cap_description")
        public String rewardCapDescription = "";

        @C09CT("policy_id")
        public String policyId = "";
    }
}
