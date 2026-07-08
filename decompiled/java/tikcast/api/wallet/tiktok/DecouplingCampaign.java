package tikcast.api.wallet.tiktok;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class DecouplingCampaign {

    @C09CT("flare_card_details")
    public FlareCardDetails flareCardDetails;

    @C09CT("is_last_week")
    public boolean isLastWeek;

    @C09CT("live_details")
    public LiveDetails liveDetails;

    @C09CT("now_timestamp")
    public long nowTimestamp;

    @C09CT("preheat_start_time")
    public long preheatStartTime;

    @C09CT("should_show_banner")
    public boolean shouldShowBanner;

    @C09CT("timezone_offset")
    public long timezoneOffset;

    @C09CT("week_end_timestamp")
    public long weekEndTimestamp;

    @C09CT("weekly_bonus_details")
    public WeeklyBonusDetails weeklyBonusDetails;

    @C09CT("weekly_pass_details")
    public WeeklyPassDetails weeklyPassDetails;

    @C09CT("promote_coupons")
    public List<PromoteCoupon> promoteCoupons = new ArrayList();

    @C09CT("live_rewards_schema")
    public String liveRewardsSchema = "";

    @C09CT("store_region")
    public String storeRegion = "";

    /* JADX INFO: loaded from: classes.dex */
    public static final class FlareCardDetails {

        @C09CT("curr_live_days")
        public long currLiveDays;

        @C09CT("expire_days")
        public long expireDays;

        @C09CT("flare_tier")
        public long flareTier;

        @C09CT("issued_days_after_unlock")
        public long issuedDaysAfterUnlock;

        @C09CT("live_days_needed")
        public long liveDaysNeeded;

        @C09CT("max_limit_per_week")
        public long maxLimitPerWeek;

        @C09CT("mission_status")
        public int missionStatus;

        @C09CT("num_used_flares")
        public long numUsedFlares;

        @C09CT("unlock_timestamp")
        public long unlockTimestamp;

        @C09CT("weekly_budget")
        public long weeklyBudget;

        @C09CT("flares")
        public List<FlareCard> flares = new ArrayList();

        @C09CT("this_week_flare_card_status")
        public String thisWeekFlareCardStatus = "";
    }

    public static final class LiveDetails {

        @C09CT("live_room_duration")
        public long liveRoomDuration;

        @C09CT("live_room_duration_needed")
        public long liveRoomDurationNeeded;

        @C09CT("max_promote_coupons_gettable")
        public long maxPromoteCouponsGettable;

        @C09CT("received_promote_coupon")
        public boolean receivedPromoteCoupon;

        @C09CT("received_weekly_pass")
        public boolean receivedWeeklyPass;

        @C09CT("current_percentage")
        public String currentPercentage = "";

        @C09CT("max_percentage")
        public String maxPercentage = "";

        @C09CT("reward_factors")
        public List<RewardFactorItem> rewardFactors = new ArrayList();
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PromoteCoupon {

        @C09CT("coupon_id")
        public String couponId = "";

        @C09CT("discount_percentage")
        public String discountPercentage = "";

        @C09CT("issue_room_id")
        public String issueRoomId = "";

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }

    public static final class WeeklyBonusDetails {

        @C09CT("all_missions_completed")
        public boolean allMissionsCompleted;

        @C09CT("num_unfinished_weekly_missions")
        public long numUnfinishedWeeklyMissions;

        @C09CT("current_percentage")
        public String currentPercentage = "";

        @C09CT("max_percentage")
        public String maxPercentage = "";

        @C09CT("weekly_pass_added_percentage")
        public String weeklyPassAddedPercentage = "";

        @C09CT("reward_factors")
        public List<RewardFactorItem> rewardFactors = new ArrayList();

        @C09CT("applied_weekly_passes")
        public List<WeeklyPassSelection> appliedWeeklyPasses = new ArrayList();

        @C09CT("weekly_pass_selection_task_id")
        public String weeklyPassSelectionTaskId = "";
    }

    public static final class WeeklyPassDetails {

        @C09CT("available_weekly_passes")
        public List<WeeklyPass> availableWeeklyPasses = new ArrayList();

        @C09CT("can_receive_pass")
        public boolean canReceivePass;

        @C09CT("num_pass_gettable")
        public long numPassGettable;

        @C09CT("num_pass_used")
        public long numPassUsed;

        @C09CT("num_pass_used_before_current_week")
        public long numPassUsedBeforeCurrentWeek;

        @C09CT("per_live_mission_completed")
        public long perLiveMissionCompleted;

        @C09CT("per_live_mission_needed")
        public long perLiveMissionNeeded;
    }
}
