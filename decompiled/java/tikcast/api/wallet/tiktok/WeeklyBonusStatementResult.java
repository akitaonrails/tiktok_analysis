package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class WeeklyBonusStatementResult {

    @C09CT("data")
    public WeeklyBonusStatementData data;

    public static final class WeeklyBonusStatementData {

        @C09CT("start_trade_time")
        public String startTradeTime = "";

        @C09CT("end_trade_time")
        public String endTradeTime = "";

        @C09CT("percentage_value")
        public String percentageValue = "";

        @C09CT("currency")
        public String currency = "";

        @C09CT("amount")
        public String amount = "";

        @C09CT("bonus_ratio_period_description")
        public String bonusRatioPeriodDescription = "";

        @C09CT("bonus_factors")
        public List<RewardFactorItem> bonusFactors = new ArrayList();
    }
}
