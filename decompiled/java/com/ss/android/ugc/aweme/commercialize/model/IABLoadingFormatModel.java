package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class IABLoadingFormatModel implements Serializable {
    public LandingPageDataModel LL;

    @C09CT("gecko_channel")
    public final List<String> geckoChannel;

    @C09CT("landing_page_data")
    public final String landingPageDataString;

    @C09CT("landing_format_type")
    public final int landingFormatType = -1;

    @C09CT("enable_dynamic_split_screen")
    public final boolean enableDynamicSplitScreen = true;

    public final boolean getEnableDynamicSplitScreen() {
        return this.enableDynamicSplitScreen;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final int getLandingFormatType() {
        return this.landingFormatType;
    }

    public final LandingPageDataModel getLandingPageData() {
        return this.LL;
    }

    public final String getLandingPageDataString() {
        return this.landingPageDataString;
    }

    public final void setLandingPageData(LandingPageDataModel landingPageDataModel) {
        this.LL = landingPageDataModel;
    }
}
