package com.ss.android.ugc.aweme.commercialize.router.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterLynxModel implements Serializable {

    @C09CT("native_site_custom_data")
    public String lynxCustomData;

    @C09CT("lynx_landing_style")
    public int lynxLandingStyle;

    @C09CT("lynx_scheme")
    public String lynxScheme;

    @C09CT("lynx_show_style")
    public int lynxShowStyle;

    @C09CT("native_site_ad_info")
    public String nativeSiteAdInfo;

    public CRouterLynxModel() {
        this(null, null, null, 0, 0);
    }

    public final String getLynxCustomData() {
        return this.lynxCustomData;
    }

    public final int getLynxLandingStyle() {
        return this.lynxLandingStyle;
    }

    public final String getLynxScheme() {
        return this.lynxScheme;
    }

    public final int getLynxShowStyle() {
        return this.lynxShowStyle;
    }

    public final String getNativeSiteAdInfo() {
        return this.nativeSiteAdInfo;
    }

    public final void setLynxCustomData(String str) {
        this.lynxCustomData = str;
    }

    public final void setLynxLandingStyle(int i) {
        this.lynxLandingStyle = i;
    }

    public final void setLynxScheme(String str) {
        this.lynxScheme = str;
    }

    public final void setLynxShowStyle(int i) {
        this.lynxShowStyle = i;
    }

    public final void setNativeSiteAdInfo(String str) {
        this.nativeSiteAdInfo = str;
    }

    public CRouterLynxModel(String str, String str2, String str3, int i, int i2) {
        this.lynxScheme = str;
        this.lynxCustomData = str2;
        this.nativeSiteAdInfo = str3;
        this.lynxLandingStyle = i;
        this.lynxShowStyle = i2;
    }
}
