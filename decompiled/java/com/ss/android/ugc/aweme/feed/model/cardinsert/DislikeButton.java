package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class DislikeButton implements Serializable {

    @C09CT("bg_color")
    public String bgColor;

    @C09CT("text")
    public String text;

    public DislikeButton() {
        this("", "");
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getText() {
        return this.text;
    }

    public final void setBgColor(String str) {
        this.bgColor = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public DislikeButton(String str, String str2) {
        this.text = str;
        this.bgColor = str2;
    }
}
