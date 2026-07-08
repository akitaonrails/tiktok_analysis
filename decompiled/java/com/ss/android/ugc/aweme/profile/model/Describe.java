package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class Describe implements Serializable {

    @C09CT("text")
    public String remoteText;

    @C09CT("text_color")
    public String textColor;

    @C09CT("text_font")
    public String textFont;

    public final String getRemoteText() {
        return this.remoteText;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTextFont() {
        return this.textFont;
    }

    public final void setRemoteText(String str) {
        this.remoteText = str;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public final void setTextFont(String str) {
        this.textFont = str;
    }
}
