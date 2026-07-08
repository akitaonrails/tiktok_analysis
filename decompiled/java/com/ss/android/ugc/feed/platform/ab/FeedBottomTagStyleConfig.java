package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedBottomTagStyleConfig {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("end_padding")
    public final int endPadding;

    @C09CT("start_padding")
    public final int startPadding;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("text_font")
    public final String textFont;

    public FeedBottomTagStyleConfig() {
        this(false, 0, 0, "", "", "");
    }

    public FeedBottomTagStyleConfig(boolean z, int i, int i2, String str, String str2, String str3) {
        this.enable = z;
        this.startPadding = i;
        this.endPadding = i2;
        this.textFont = str;
        this.textColor = str2;
        this.backgroundColor = str3;
    }
}
