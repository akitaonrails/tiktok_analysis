package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class RealTimeLiveRewardsResult {

    @C09CT("data")
    public RealTimeLiveRewardsData data;

    public static final class RealTimeLiveRewardsData {

        @C09CT("completed_per_live_missions")
        public boolean completedPerLiveMissions;

        @C09CT("content_quality_adjustment")
        public ContentQualityAdjustmentItem contentQualityAdjustment;

        @C09CT("data_timestamp")
        public long dataTimestamp;

        @C09CT("diamonds")
        public long diamonds;

        @C09CT("in_diamond_perception_ab")
        public boolean inDiamondPerceptionAb;

        @C09CT("refresh_interval")
        public long refreshInterval;

        @C09CT("show_content_quality_adjustment")
        public boolean showContentQualityAdjustment;

        @C09CT("show_penetration_ui")
        public boolean showPenetrationUi;

        @C09CT("websocket_refresh_interval_ms")
        public long websocketRefreshIntervalMs;

        @C09CT("weekly_bonus_diamonds")
        public long weeklyBonusDiamonds;

        @C09CT("currency")
        public String currency = "";

        @C09CT("amount")
        public String amount = "";

        @C09CT("reward_missions")
        public List<RewardMissionItem> rewardMissions = new ArrayList();

        @C09CT("bonus_tip")
        public String bonusTip = "";

        @C09CT("weekly_bonus_amount")
        public String weeklyBonusAmount = "";

        @C09CT("live_percentage")
        public String livePercentage = "";

        @C09CT("msg_id")
        public String msgId = "";

        @C09CT("weekly_bonus_percentage")
        public String weeklyBonusPercentage = "";

        @C09CT("live_mission_tip")
        public String liveMissionTip = "";

        @C09CT("week_mission_tip")
        public String weekMissionTip = "";
    }
}
