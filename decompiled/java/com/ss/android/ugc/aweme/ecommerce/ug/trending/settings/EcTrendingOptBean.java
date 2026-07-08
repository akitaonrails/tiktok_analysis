package com.ss.android.ugc.aweme.ecommerce.ug.trending.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcTrendingOptBean {

    @C09CT("enable_resize")
    public final Boolean enableResize;

    @C09CT("enable_texture_view_degrade")
    public final Boolean enableTextureViewDegrade;

    public EcTrendingOptBean() {
        this(Boolean.FALSE, Boolean.FALSE);
    }

    public EcTrendingOptBean(Boolean bool, Boolean bool2) {
        this.enableResize = bool;
        this.enableTextureViewDegrade = bool2;
    }
}
