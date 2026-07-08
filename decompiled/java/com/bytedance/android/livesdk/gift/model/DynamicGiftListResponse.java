package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicGiftListResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("gifts_info")
        public GiftsInfo giftsInfo;

        @C09CT("is_full_gift_data")
        public boolean isFullGiftData;

        @C09CT("pannel_refresh")
        public int pannelRefresh;

        @C09CT("pages")
        public List<GiftPage> pages = new ArrayList();

        @C09CT("hot_fields")
        public List<String> hotFields = new ArrayList();

        @C09CT("special_gifts")
        public List<Gift> specialGifts = new ArrayList();

        @C09CT("cold_gift_hash")
        public String coldGiftHash = "";

        @C09CT("cold_gift_url")
        public String coldGiftUrl = "";

        @C09CT("cold_gift_fallback_url")
        public String coldGiftFallbackUrl = "";
    }

    public static final class Extra extends com.bytedance.android.livesdk.model.Extra {

        @C09CT("log_id")
        public String logId = "";
    }
}
