package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class BackgroundMessage implements Serializable {

    @C09CT("bottom_color")
    public String bottomColor;

    @C09CT("top_color")
    public String topColor;

    public BackgroundMessage() {
        this("", "");
    }

    public final String getBottomColor() {
        return this.bottomColor;
    }

    public final String getTopColor() {
        return this.topColor;
    }

    public final void setBottomColor(String str) {
        this.bottomColor = str;
    }

    public final void setTopColor(String str) {
        this.topColor = str;
    }

    public BackgroundMessage(String str, String str2) {
        this.topColor = str;
        this.bottomColor = str2;
    }
}
