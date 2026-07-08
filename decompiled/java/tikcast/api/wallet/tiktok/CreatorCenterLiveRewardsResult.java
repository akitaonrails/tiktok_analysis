package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class CreatorCenterLiveRewardsResult {

    @C09CT("data")
    public CreatorCenterLiveRewardsData data;

    public static final class CreatorCenterLiveRewardsData {

        @C09CT("diamonds")
        public long diamonds;

        @C09CT("end_date")
        public long endDate;

        @C09CT("is_periodic_payout")
        public boolean isPeriodicPayout;

        @C09CT("show_penetration_ui")
        public boolean showPenetrationUi;

        @C09CT("show_policy_upgrade")
        public boolean showPolicyUpgrade;

        @C09CT("start_date")
        public long startDate;

        @C09CT("live_reward_currency")
        public String liveRewardCurrency = "";

        @C09CT("live_reward_amount")
        public String liveRewardAmount = "";

        @C09CT("live_reward_max_percentage")
        public String liveRewardMaxPercentage = "";

        @C09CT("weekly_bonus_currency")
        public String weeklyBonusCurrency = "";

        @C09CT("weekly_bonus_amount")
        public String weeklyBonusAmount = "";

        @C09CT("weekly_bonus_percentage")
        public String weeklyBonusPercentage = "";

        @C09CT("weekly_bonus_max_percentage")
        public String weeklyBonusMaxPercentage = "";

        @C09CT("weekly_bonus_tip")
        public String weeklyBonusTip = "";

        @C09CT("bonus_ratio_period_description")
        public String bonusRatioPeriodDescription = "";
    }
}
