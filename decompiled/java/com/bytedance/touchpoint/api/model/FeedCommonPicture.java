package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedCommonPicture {

    @C09CT("animation")
    public Animation animation;

    @C09CT("background_image")
    public String bgImage;

    @C09CT("button")
    public FeedButton button;

    @C09CT("highlight_title")
    public Title highlightTitle;

    @C09CT("multi_show_count")
    public final int multiShowCount;

    @C09CT("music_url")
    public final String music;

    @C09CT("show_condition")
    public final String showCondituon;

    @C09CT("subtitle")
    public Title subTitle;

    @C09CT("title")
    public final Title title;

    public FeedCommonPicture(String str, int i, Title title, String str2, Title title2, Title title3, Animation animation, String str3, FeedButton feedButton) {
        this.showCondituon = str;
        this.multiShowCount = i;
        this.title = title;
        this.music = str2;
        this.highlightTitle = title2;
        this.subTitle = title3;
        this.animation = animation;
        this.bgImage = str3;
        this.button = feedButton;
    }
}
