package webcast.api.gift;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GiftRecommendationResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("recommended_gift_ids")
        public String recommendedGiftIds = "";

        @C09CT("strategy_token")
        public String strategyToken = "";
    }

    public static final class Extra {

        @C09CT("log_id")
        public String logId = "";
    }
}
