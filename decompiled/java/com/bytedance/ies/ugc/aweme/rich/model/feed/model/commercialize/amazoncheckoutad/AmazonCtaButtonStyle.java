package com.bytedance.ies.ugc.aweme.rich.model.feed.model.commercialize.amazoncheckoutad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class AmazonCtaButtonStyle implements Serializable {

    @C09CT("color")
    public final String backgroundColor;

    @C09CT("text")
    public final String text;

    @C09CT("text_color")
    public final String textColor;

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }
}
