package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class WeeklyBonusResult {

    @C09CT("data")
    public WeeklyBonusData data;

    public static final class WeeklyBonusData {

        @C09CT("bonus")
        public WeeklyBonus bonus;

        @C09CT("campaign_details")
        public WeeklyBonusCampaignDetails campaignDetails;

        @C09CT("has_live_permission")
        public boolean hasLivePermission;

        @C09CT("highlight_amount")
        public boolean highlightAmount;

        @C09CT("is_mission_changed")
        public boolean isMissionChanged;

        @C09CT("league_details")
        public CreatorLeagueDetails leagueDetails;

        @C09CT("prev_week_has_income")
        public boolean prevWeekHasIncome;

        @C09CT("refresh_interval")
        public long refreshInterval;

        @C09CT("show_penetration_ui")
        public boolean showPenetrationUi;

        @C09CT("show_weekly_recap")
        public boolean showWeeklyRecap;

        @C09CT("reward_factors")
        public List<RewardFactorItem> rewardFactors = new ArrayList();

        @C09CT("policy_id")
        public String policyId = "";

        @C09CT("calendar")
        public List<Calendar> calendar = new ArrayList();

        @C09CT("week_id")
        public String weekId = "";
    }
}
