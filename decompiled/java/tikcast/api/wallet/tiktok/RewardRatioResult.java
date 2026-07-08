package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class RewardRatioResult {

    @C09CT("data")
    public RewardRatioData data;

    public static final class RewardRatioData {

        @C09CT("content_quality_adjustment")
        public ContentQualityAdjustment contentQualityAdjustment;

        @C09CT("end_time")
        public long endTime;

        @C09CT("percentage_value")
        public String percentageValue = "";

        @C09CT("currency")
        public String currency = "";

        @C09CT("amount")
        public String amount = "";

        @C09CT("reward_factors")
        public List<RewardFactorItem> rewardFactors = new ArrayList();

        @C09CT("max_week_ratio")
        public String maxWeekRatio = "";
    }
}
