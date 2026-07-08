package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class AnchorECSaleMode implements Serializable {

    @C09CT("has_non_self_product")
    public final boolean hasNonSelfProduct;

    @C09CT("has_self_product")
    public final boolean hasSelfProduct;

    @C09CT("if_bc_whitelist")
    public final boolean isBcWhiteList;

    @C09CT("if_self_sale")
    public final boolean isSelfMode;

    @C09CT("toggle_compliance")
    public final ToggleCompliance toggleCompliance;

    public AnchorECSaleMode() {
        this(false, false, false, false, null);
    }

    public final boolean isBcWhiteList() {
        return this.isBcWhiteList;
    }

    public final boolean isSelfMode() {
        return this.isSelfMode;
    }

    public AnchorECSaleMode(boolean z, boolean z2, boolean z3, boolean z4, ToggleCompliance toggleCompliance) {
        this.isSelfMode = z;
        this.hasSelfProduct = z2;
        this.hasNonSelfProduct = z3;
        this.isBcWhiteList = z4;
        this.toggleCompliance = toggleCompliance;
    }
}
