package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class AvailableSwapGiftResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("recommend_gifts")
        public List<Gift> recommendGifts = new ArrayList();

        @C09CT("available_gifts")
        public List<Gift> availableGifts = new ArrayList();

        public static final class Gift {

            @C09CT("coin_price")
            public int coinPrice;

            @C09CT("gift_id")
            public int giftId;

            @C09CT("goal_count")
            public int goalCount;

            @C09CT("image_url")
            public String imageUrl = "";

            @C09CT("gift_name")
            public String giftName = "";
        }
    }

    public static final class Extra {

        @C09CT("log_id")
        public String logId = "";
    }
}
