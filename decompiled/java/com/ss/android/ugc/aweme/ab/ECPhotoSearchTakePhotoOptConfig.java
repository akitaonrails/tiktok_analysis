package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class ECPhotoSearchTakePhotoOptConfig {

    @C09CT("photo_search_opt_preview_size")
    public final boolean isAdjustPreviewSize;

    @C09CT("photo_search_opt_early_init")
    public final boolean isEarlyInitVE;

    @C09CT("photo_search_opt_ve_internal")
    public final boolean isOptVEInternal;

    public ECPhotoSearchTakePhotoOptConfig() {
        this(false, false, false);
    }

    public ECPhotoSearchTakePhotoOptConfig(boolean z, boolean z2, boolean z3) {
        this.isEarlyInitVE = z;
        this.isAdjustPreviewSize = z2;
        this.isOptVEInternal = z3;
    }
}
