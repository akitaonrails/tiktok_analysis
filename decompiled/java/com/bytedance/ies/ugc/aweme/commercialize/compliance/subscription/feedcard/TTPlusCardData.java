package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class TTPlusCardData {

    @C09CT("card_style_id")
    public final String cardStyleId;

    @C09CT("cover")
    public final Cover cover;

    @C09CT("feed_card_page_info")
    public final FeedCardPageInfo feedCardPageInfo;

    @C09CT("h5_page_info")
    public final String midPageInfo;

    @C09CT("mid_page_url")
    public final String midPageUrl;

    @C09CT("product_info")
    public final ProductInfo productInfo;

    @C09CT("text_display_time")
    public final Integer textDisplayTime;

    @C09CT("use_mid_page")
    public final Boolean useMidPage;

    @C09CT("video")
    public final Video video;

    public TTPlusCardData() {
        this(null, null, null, null, null, null, "", 0, "");
    }

    public TTPlusCardData(ProductInfo productInfo, FeedCardPageInfo feedCardPageInfo, Boolean bool, String str, Video video, Cover cover, String str2, Integer num, String str3) {
        this.productInfo = productInfo;
        this.feedCardPageInfo = feedCardPageInfo;
        this.useMidPage = bool;
        this.midPageUrl = str;
        this.video = video;
        this.cover = cover;
        this.midPageInfo = str2;
        this.textDisplayTime = num;
        this.cardStyleId = str3;
    }
}
