package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ChunkConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("show_loading")
    public final boolean showLoading;

    public ChunkConfig() {
        this(false, false);
    }

    public ChunkConfig(boolean z, boolean z2) {
        this.enable = z;
        this.showLoading = z2;
    }
}
