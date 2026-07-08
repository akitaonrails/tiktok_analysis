package com.ss.android.ugc.aweme.commercialize.model.router;

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

    public CRouterLynxModel() {
        this(null, null, 0);
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

    public final void setLynxCustomData(String str) {
        this.lynxCustomData = str;
    }

    public final void setLynxLandingStyle(int i) {
        this.lynxLandingStyle = i;
    }

    public final void setLynxScheme(String str) {
        this.lynxScheme = str;
    }

    public CRouterLynxModel(String str, String str2, int i) {
        this.lynxScheme = str;
        this.lynxCustomData = str2;
        this.lynxLandingStyle = i;
    }
}
