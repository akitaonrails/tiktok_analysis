package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class InstantRewardsResult {

    @C09CT("data")
    public InstantRewardsData data;

    public static final class InstantRewardsData {

        @C09CT("content_quality_adjustment")
        public ContentQualityAdjustment contentQualityAdjustment;

        @C09CT("diamonds")
        public long diamonds;

        @C09CT("refresh_interval")
        public long refreshInterval;

        @C09CT("show_penetration_ui")
        public boolean showPenetrationUi;

        @C09CT("currency")
        public String currency = "";

        @C09CT("amount")
        public String amount = "";

        @C09CT("min_percentage")
        public String minPercentage = "";

        @C09CT("max_percentage")
        public String maxPercentage = "";

        @C09CT("current_percentage")
        public String currentPercentage = "";

        @C09CT("tip")
        public String tip = "";

        @C09CT("reward_factors")
        public List<RewardFactorItem> rewardFactors = new ArrayList();

        @C09CT("room_id")
        public String roomId = "";

        @C09CT("policy_id")
        public String policyId = "";
    }
}
