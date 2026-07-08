package com.ss.android.ugc.aweme.paid.content.consumption;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidContentAnchorExtraModel {

    @C09CT("discounted_iap_id")
    public String discountedIapID;

    @C09CT("discounted_usd_price")
    public String discountedUSDPrice;

    @C09CT("enable_single_video_purchase")
    public final boolean enableSingleVideoPurchase;

    @C09CT("iap_id")
    public String iapID;

    @C09CT("is_limited_free")
    public final boolean isLimitedFree;

    @C09CT("is_schema_encoded")
    public final boolean isSchemaEncoded;

    @C09CT("original_iap_id")
    public String originalIapID;

    @C09CT("original_usd_price")
    public String originalUSDPrice;

    @C09CT("post_title")
    public String postTitle;

    @C09CT("series_anchor_type")
    public final String seriesAnchorType;

    @C09CT("series_cover_url")
    public String seriesCoverImageUrl;

    @C09CT("single_video_iap_id")
    public final String singleVideoIapId;

    @C09CT("single_video_original_usd_price")
    public final String singleVideoOriginalUsdPrice;

    @C09CT("subtitle")
    public String subtitle;

    @C09CT("voucher_tag")
    public String voucherTag;

    public PaidContentAnchorExtraModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, String str12, boolean z3) {
        this.postTitle = str;
        this.subtitle = str2;
        this.iapID = str3;
        this.originalIapID = str4;
        this.discountedIapID = str5;
        this.voucherTag = str6;
        this.seriesCoverImageUrl = str7;
        this.originalUSDPrice = str8;
        this.discountedUSDPrice = str9;
        this.singleVideoIapId = str10;
        this.singleVideoOriginalUsdPrice = str11;
        this.enableSingleVideoPurchase = z;
        this.isSchemaEncoded = z2;
        this.seriesAnchorType = str12;
        this.isLimitedFree = z3;
    }
}
