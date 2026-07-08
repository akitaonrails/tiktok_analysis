package com.ss.android.ugc.aweme.ecommerce.base.pdp.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RelatedGidInfo {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("enter_from_info")
    public final String enterFromInfo;

    @C09CT("first_source_page")
    public final String firstSourcePage;

    @C09CT("room_id")
    public final String roomId;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("video_id")
    public final String videoId;

    public RelatedGidInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.firstSourcePage = str;
        this.enterFromInfo = str2;
        this.authorId = str3;
        this.sellerId = str4;
        this.roomId = str5;
        this.videoId = str6;
    }
}
