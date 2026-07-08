package com.ss.android.ugc.aweme.component.playableconvertcomponent;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SponsoredLabel implements Serializable {
    public static final int $stable = 0;

    @C09CT("color")
    public final String color;

    @C09CT("color_text")
    public final String colorText;

    @C09CT("text")
    public final String text;

    public SponsoredLabel() {
        this(null, null, null);
    }

    public SponsoredLabel(String str, String str2, String str3) {
        this.color = str;
        this.colorText = str2;
        this.text = str3;
    }
}
