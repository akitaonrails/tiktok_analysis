package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ECCtaInfo implements Serializable {

    @C09CT("buttonBackgroundColor")
    public final ECRGBAColor buttonBackgroundColor;

    @C09CT("buttonTextColor")
    public final ECRGBAColor buttonTextColor;

    @C09CT("standAloneTextColor")
    public final ECRGBAColor standAloneTextColor;

    @C09CT("style")
    public final Integer style;

    @C09CT("text")
    public final String text;

    public ECCtaInfo() {
        this(null, null, null, null, null);
    }

    public ECCtaInfo(String str, Integer num, ECRGBAColor eCRGBAColor, ECRGBAColor eCRGBAColor2, ECRGBAColor eCRGBAColor3) {
        this.text = str;
        this.style = num;
        this.buttonBackgroundColor = eCRGBAColor;
        this.buttonTextColor = eCRGBAColor2;
        this.standAloneTextColor = eCRGBAColor3;
    }
}
