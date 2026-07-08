package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGatePopup {

    @C09CT("button")
    public FeedButton button;

    @C09CT("button_link")
    public String buttonLink;

    @C09CT("cover_image")
    public String coverImage;

    @C09CT("desc")
    public Title desc;

    @C09CT("desc_link")
    public String descLink;

    @C09CT("highlight_desc")
    public Title highlightDesc;

    @C09CT("highlight_title")
    public Title highlightTitle;

    @C09CT("title")
    public Title title;

    public AgeGatePopup(String str, Title title, Title title2, FeedButton feedButton, Title title3, Title title4, String str2, String str3) {
        this.coverImage = str;
        this.title = title;
        this.highlightTitle = title2;
        this.button = feedButton;
        this.desc = title3;
        this.highlightDesc = title4;
        this.buttonLink = str2;
        this.descLink = str3;
    }
}
