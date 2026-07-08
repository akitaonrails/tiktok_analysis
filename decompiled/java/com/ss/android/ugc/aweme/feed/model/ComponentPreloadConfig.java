package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ComponentPreloadConfig implements Serializable {

    @C09CT("component_key")
    public String componentKey;

    @C09CT("enable_landing_page_preload")
    public Boolean enableLandingPagePreload;

    public ComponentPreloadConfig() {
        this(null, null);
    }

    public ComponentPreloadConfig(String str, Boolean bool) {
        this.componentKey = str;
        this.enableLandingPagePreload = bool;
    }
}
