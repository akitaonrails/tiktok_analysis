package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class OspJumpOptConfig {

    @C09CT("address_cache_timeout_hour")
    public final int addressCacheTimeoutHour;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("osp_jump_fix")
    public final boolean ospJumpFix;

    @C09CT("osp_loading_forbid_return")
    public final boolean ospLoadingForbidReturn;

    public OspJumpOptConfig() {
        this(false, false, 0, false);
    }

    public OspJumpOptConfig(boolean z, boolean z2, int i, boolean z3) {
        this.ospJumpFix = z;
        this.enable = z2;
        this.addressCacheTimeoutHour = i;
        this.ospLoadingForbidReturn = z3;
    }
}
