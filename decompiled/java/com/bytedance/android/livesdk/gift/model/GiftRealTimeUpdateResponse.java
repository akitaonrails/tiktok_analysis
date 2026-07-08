package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GiftRealTimeUpdateResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("strategy_data")
        public GiftRealTimeStrategyData strategyData;

        @C09CT("rerank_position_to_giftid")
        public Map<Long, Long> rerankPositionToGiftid = new LinkedHashMap();

        @C09CT("giftid_to_recommend_info")
        public Map<Long, GiftRecommendInfo> giftidToRecommendInfo = new LinkedHashMap();
    }
}
