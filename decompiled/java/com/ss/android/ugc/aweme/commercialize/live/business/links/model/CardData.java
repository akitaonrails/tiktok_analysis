package com.ss.android.ugc.aweme.commercialize.live.business.links.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class CardData {

    @C09CT("card_type")
    public final int cardType;

    @C09CT("game_url")
    public final String gameUrl;

    @C09CT("link_id")
    public final long linkId;

    @C09CT("link_url")
    public final String linkUrl;

    @C09CT("liveLogExtra")
    public final String liveLogExtra;

    @C09CT("pic_url")
    public final String picUrl;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    public CardData(String str, String str2, String str3, long j, String str4, int i, String str5, String str6) {
        this.title = str;
        this.subtitle = str2;
        this.picUrl = str3;
        this.linkId = j;
        this.linkUrl = str4;
        this.cardType = i;
        this.gameUrl = str5;
        this.liveLogExtra = str6;
    }
}
