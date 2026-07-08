package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PopupView {
    public String LIZ;

    @C09CT("button")
    public FeedButton button;

    @C09CT("cover_image")
    public String coverImage;

    @C09CT("highlight_title")
    public Title highlightTitle;

    @C09CT("title")
    public Title title;

    @C09CT("widget_image")
    public String widgetImage;

    public PopupView(Title title, Title title2, FeedButton feedButton, String str, String str2, String str3) {
        this.title = title;
        this.highlightTitle = title2;
        this.button = feedButton;
        this.coverImage = str;
        this.widgetImage = str2;
        this.LIZ = str3;
    }
}
