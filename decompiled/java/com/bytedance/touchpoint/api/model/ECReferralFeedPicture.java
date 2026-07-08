package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ECReferralFeedPicture {
    public String LIZ;
    public String LIZIZ;

    @C09CT("background_image")
    public final String backgroundImage;

    @C09CT("button")
    public final FeedButton btnMainAction;

    @C09CT("not_interest_button")
    public final FeedButton btnNotInterest;

    @C09CT("background_color")
    public final String cardBgColor;

    @C09CT("cover_image")
    public final String coverImage;

    @C09CT("description")
    public final Content description;

    @C09CT("multi_show_count")
    public final Integer multiShowCount;

    @C09CT("music_url")
    public final String music;

    @C09CT("subtitle")
    public final Content subtitle;

    @C09CT("title")
    public final Title title;

    public ECReferralFeedPicture(Title title, Content content, String str, String str2, FeedButton feedButton, FeedButton feedButton2, String str3, String str4, Content content2, Integer num, String str5, String str6) {
        this.title = title;
        this.subtitle = content;
        this.backgroundImage = str;
        this.music = str2;
        this.btnMainAction = feedButton;
        this.btnNotInterest = feedButton2;
        this.coverImage = str3;
        this.cardBgColor = str4;
        this.description = content2;
        this.multiShowCount = num;
        this.LIZ = str5;
        this.LIZIZ = str6;
    }
}
