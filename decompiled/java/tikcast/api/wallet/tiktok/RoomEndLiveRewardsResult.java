package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class RoomEndLiveRewardsResult {

    @C09CT("data")
    public RoomEndLiveRewardsData data;

    public static final class RoomEndLiveRewardsData {

        @C09CT("diamonds")
        public long diamonds;

        @C09CT("in_diamond_perception_ab")
        public boolean inDiamondPerceptionAb;

        @C09CT("is_periodic_payout")
        public boolean isPeriodicPayout;

        @C09CT("is_settle_finish")
        public boolean isSettleFinish;

        @C09CT("organization_account_data")
        public OrganizationAccountData organizationAccountData;

        @C09CT("recv_first_gift")
        public boolean recvFirstGift;

        @C09CT("refresh_interval")
        public long refreshInterval;

        @C09CT("show_penetration_ui")
        public boolean showPenetrationUi;

        @C09CT("show_policy_upgrade")
        public boolean showPolicyUpgrade;

        @C09CT("weekly_bonus_amount_increase")
        public boolean weeklyBonusAmountIncrease;

        @C09CT("weekly_bonus_diamonds")
        public long weeklyBonusDiamonds;

        @C09CT("weekly_bonus_loading")
        public boolean weeklyBonusLoading;

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

        @C09CT("room_id")
        public String roomId = "";

        @C09CT("live_reward_percentage")
        public String liveRewardPercentage = "";
    }
}
