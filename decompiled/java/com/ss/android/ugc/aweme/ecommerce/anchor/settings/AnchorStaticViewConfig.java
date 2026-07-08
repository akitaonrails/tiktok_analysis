package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorStaticViewConfig {

    @C09CT("ec_anchor_icon_style")
    public final int anchorIconStyle;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("primary_style")
    public final boolean primaryStyle;

    public AnchorStaticViewConfig() {
        this(0, false, false);
    }

    public AnchorStaticViewConfig(int i, boolean z, boolean z2) {
        this.anchorIconStyle = i;
        this.primaryStyle = z;
        this.enable = z2;
    }
}
