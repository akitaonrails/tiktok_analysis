package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ServerConfigStyle {

    @C09CT("background_image")
    public final BackgroundImage backgroundImage;

    @C09CT("cart_entry")
    public final CartEntry cartEntry;

    @C09CT("feed_list_module_title")
    public final String feedTitle;

    @C09CT("auction_live_title")
    public final String liveFeedTitle;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("title")
    public final String title;

    @C09CT("auction_video_title")
    public final String videoFeedTitle;

    @C09CT("voucher_module_schema")
    public final String voucherSchema;

    public ServerConfigStyle(String str, String str2, String str3, BackgroundImage backgroundImage, String str4, CartEntry cartEntry, String str5, String str6) {
        this.title = str;
        this.subTitle = str2;
        this.feedTitle = str3;
        this.backgroundImage = backgroundImage;
        this.voucherSchema = str4;
        this.cartEntry = cartEntry;
        this.liveFeedTitle = str5;
        this.videoFeedTitle = str6;
    }
}
