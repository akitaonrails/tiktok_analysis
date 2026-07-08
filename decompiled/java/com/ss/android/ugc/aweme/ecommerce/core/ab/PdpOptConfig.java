package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpOptConfig {

    @C09CT("is_opt_show_func")
    public boolean isOptSlowFunc;

    @C09CT("lazy_show_after_render")
    public boolean lazyShowAfterRender;

    @C09CT("other")
    public boolean other;

    @C09CT("remove_update_info_repeat")
    public boolean removeUpdateInfoRepeat;

    public PdpOptConfig() {
        this(false, false, false, false);
    }

    public PdpOptConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isOptSlowFunc = z;
        this.removeUpdateInfoRepeat = z2;
        this.lazyShowAfterRender = z3;
        this.other = z4;
    }
}
