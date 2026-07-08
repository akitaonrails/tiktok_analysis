package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class DialogTextModel implements Serializable {

    @C09CT("text")
    public final String remoteText;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("font")
    public final String textFont;

    public final String getRemoteText() {
        return this.remoteText;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTextFont() {
        return this.textFont;
    }
}
