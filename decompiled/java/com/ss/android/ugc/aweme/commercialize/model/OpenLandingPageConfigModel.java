package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenLandingPageConfigModel implements Serializable {

    @C09CT("forbid_navigate_bar_type")
    public final List<String> forbidNavigateBarType;

    @C09CT("open_type")
    public final String openType;

    public OpenLandingPageConfigModel() {
        this(null, null);
    }

    public OpenLandingPageConfigModel(String str, List<String> list) {
        this.openType = str;
        this.forbidNavigateBarType = list;
    }
}
