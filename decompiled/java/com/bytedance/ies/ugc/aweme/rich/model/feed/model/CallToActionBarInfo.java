package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class CallToActionBarInfo implements Serializable {

    @C09CT("text")
    public String text = "";

    @C09CT("button_text")
    public String buttonText = "";

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getText() {
        return this.text;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
