package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class AmePackageSizeFactorOrigConfig {

    @C09CT("edit_page_pkgsize_offset_bytes")
    public final int editPagePkgSizeOffsetBytes;

    @C09CT("edit_page_pkgsize_scale")
    public final double editPagePkgSizeScale;

    public AmePackageSizeFactorOrigConfig() {
        this(1.0d, 0);
    }

    public AmePackageSizeFactorOrigConfig(double d, int i) {
        this.editPagePkgSizeScale = d;
        this.editPagePkgSizeOffsetBytes = i;
    }
}
