package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.commercialize.MultiCTAInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class AdBrandZone implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("banner")
    public SearchBanner banner;

    @C09CT("bg_color")
    public String bgColor;

    @C09CT("display_type")
    public Integer displayType;

    @C09CT("is_default_color")
    public Boolean isDefaultColor;

    @C09CT("multi_cta_info")
    public MultiCTAInfo multiCTAInfo;

    public static final class Companion {
    }

    public final boolean isHorizonDisplay() {
        Integer num = this.displayType;
        return num != null && num.intValue() == 2;
    }

    public final SearchBanner getBanner() {
        return this.banner;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final Integer getDisplayType() {
        return this.displayType;
    }

    public final MultiCTAInfo getMultiCTAInfo() {
        return this.multiCTAInfo;
    }

    public final Boolean isDefaultColor() {
        return this.isDefaultColor;
    }

    public final void setBanner(SearchBanner searchBanner) {
        this.banner = searchBanner;
    }

    public final void setBgColor(String str) {
        this.bgColor = str;
    }

    public final void setDefaultColor(Boolean bool) {
        this.isDefaultColor = bool;
    }

    public final void setDisplayType(Integer num) {
        this.displayType = num;
    }

    public final void setMultiCTAInfo(MultiCTAInfo multiCTAInfo) {
        this.multiCTAInfo = multiCTAInfo;
    }
}
