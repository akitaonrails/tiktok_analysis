package com.ss.android.ugc.aweme.model;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectCreatorCenterConfig {

    @C09CT("container")
    public final String container;

    @C09CT("container_parameter")
    public final String containerParam;

    @C09CT("url")
    public final String url;

    @C09CT("url_fragment")
    public final String urlFragment;

    public EffectCreatorCenterConfig() {
        this("aweme://webview/?url=", "&container_bg_color=000000&use_spark=1&hide_nav_bar=1", "https%3A%2F%2Finapp.tiktokv.com%2Fttep%2Finapp%2Fcreator-center%3F_pia_%3D1", "");
    }

    public EffectCreatorCenterConfig(String str, String str2, String str3, String str4) {
        this.container = str;
        this.containerParam = str2;
        this.url = str3;
        this.urlFragment = str4;
    }
}
