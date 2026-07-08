package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CarouselColorImage implements Serializable {

    @C09CT("bottom_background_color")
    public String bottomBackGroundColor;

    @C09CT("cta_background_color")
    public String ctaBackGroundColor;

    @C09CT("cta_text_color")
    public String ctaTextColor;

    @C09CT("top_background_color")
    public String topBackGroundColor;

    public final String getBottomBackGroundColor() {
        return this.bottomBackGroundColor;
    }

    public final String getCtaBackGroundColor() {
        return this.ctaBackGroundColor;
    }

    public final String getCtaTextColor() {
        return this.ctaTextColor;
    }

    public final String getTopBackGroundColor() {
        return this.topBackGroundColor;
    }

    public final void setBottomBackGroundColor(String str) {
        this.bottomBackGroundColor = str;
    }

    public final void setCtaBackGroundColor(String str) {
        this.ctaBackGroundColor = str;
    }

    public final void setCtaTextColor(String str) {
        this.ctaTextColor = str;
    }

    public final void setTopBackGroundColor(String str) {
        this.topBackGroundColor = str;
    }
}
