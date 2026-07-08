package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class AnchorPublishPermission implements Serializable {

    @C09CT("enable_anchor")
    public final boolean enableAnchor;

    @C09CT("enable_multi_anchor")
    public final boolean enableMultiAnchor;

    @C09CT("enable_shop_anchor")
    public final boolean enableShopAnchor;

    public AnchorPublishPermission() {
        this(false, false, false);
    }

    public AnchorPublishPermission(boolean z, boolean z2, boolean z3) {
        this.enableAnchor = z;
        this.enableMultiAnchor = z2;
        this.enableShopAnchor = z3;
    }
}
