package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class BonusFactorsResult {

    @C09CT("data")
    public BonusFactorsData data;

    public static final class BonusFactorsData {

        @C09CT("bonus_ratio_period_description")
        public String bonusRatioPeriodDescription = "";

        @C09CT("data_reset_description")
        public String dataResetDescription = "";

        @C09CT("valid_go_live_days")
        public GoLiveDays validGoLiveDays;

        @C09CT("valid_total_viewers")
        public TotalViewers validTotalViewers;
    }
}
