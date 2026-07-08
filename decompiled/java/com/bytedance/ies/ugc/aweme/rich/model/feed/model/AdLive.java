package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLive implements Serializable {

    @C09CT("button_bg_color")
    public String buttonBgColor;

    @C09CT("button_text")
    public String buttonText;

    public final String getButtonBgColor() {
        return this.buttonBgColor;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final void setButtonBgColor(String str) {
        this.buttonBgColor = str;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }
}
