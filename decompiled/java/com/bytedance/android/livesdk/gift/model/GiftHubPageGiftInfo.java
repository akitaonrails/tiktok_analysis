package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftHubPageGiftInfo {

    @C09CT("page_id")
    public String pageId = "";

    @C09CT("gift_items")
    public List<GiftItem> giftItems = new ArrayList();

    @C09CT("white_list_regions")
    public List<String> whiteListRegions = new ArrayList();

    @C09CT("white_list_countries")
    public List<String> whiteListCountries = new ArrayList();

    @C09CT("black_list_regions")
    public List<String> blackListRegions = new ArrayList();

    @C09CT("black_list_countries")
    public List<String> blackListCountries = new ArrayList();

    @C09CT("background_color")
    public String backgroundColor = "";

    public static final class GiftItem {

        @C09CT("gift_id")
        public long giftId;

        @C09CT("gift_price")
        public long giftPrice;

        @C09CT("gift_image_url")
        public String giftImageUrl = "";

        @C09CT("share_image_url")
        public String shareImageUrl = "";

        @C09CT("gift_title")
        public String giftTitle = "";

        @C09CT("gift_subtitle")
        public String giftSubtitle = "";

        @C09CT("gift_description")
        public String giftDescription = "";

        @C09CT("preview_effect_url")
        public String previewEffectUrl = "";

        @C09CT("preview_effect_type")
        public String previewEffectType = "";
    }
}
