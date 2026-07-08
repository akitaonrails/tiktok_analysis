package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class RetentionPopup {

    @C09CT("bg_color")
    public final String bgColor;

    @C09CT("close_button")
    public final Button closeButton;

    @C09CT("desc")
    public final Title desc;

    @C09CT("keep_button")
    public final Button keepButton;

    @C09CT("title")
    public final Title title;

    @C09CT("top_image")
    public final String topImage;

    public RetentionPopup() {
        this(null, null, null, null, null, null);
    }

    public RetentionPopup(String str, String str2, Title title, Button button, Button button2, Title title2) {
        this.topImage = str;
        this.bgColor = str2;
        this.title = title;
        this.keepButton = button;
        this.closeButton = button2;
        this.desc = title2;
    }
}
