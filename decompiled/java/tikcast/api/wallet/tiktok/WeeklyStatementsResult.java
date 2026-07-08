package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WeeklyStatementsResult {

    @C09CT("data")
    public WeeklyStatementsData data;

    public static final class WeeklyStatementsData {

        @C09CT("currency")
        public String currency = "";

        @C09CT("amount")
        public String amount = "";

        @C09CT("rewards_list")
        public List<Item> rewardsList = new ArrayList();

        @C09CT("cursor")
        public String cursor = "";

        public static final class Item {

            @C09CT("is_calculating")
            public boolean isCalculating;

            @C09CT("start_trade_time")
            public String startTradeTime = "";

            @C09CT("end_trade_time")
            public String endTradeTime = "";

            @C09CT("amount")
            public String amount = "";

            @C09CT("week_id")
            public String weekId = "";

            @C09CT("currency")
            public String currency = "";
        }
    }
}
