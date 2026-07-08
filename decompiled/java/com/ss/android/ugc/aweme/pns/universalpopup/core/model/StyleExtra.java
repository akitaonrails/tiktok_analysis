package com.ss.android.ugc.aweme.pns.universalpopup.core.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class StyleExtra implements Serializable {

    @C09CT("dsa_toggles")
    public final List<DSAToggle> dsaToggles;

    @C09CT("webview_url")
    public final String webviewUrl;

    @C09CT("webview_ux_option")
    public final Integer webviewUxOption;

    public StyleExtra() {
        this(null, null, null);
    }

    public StyleExtra(String str, Integer num, List<DSAToggle> list) {
        this.webviewUrl = str;
        this.webviewUxOption = num;
        this.dsaToggles = list;
    }
}
