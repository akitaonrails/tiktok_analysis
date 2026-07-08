package com.ss.android.ugc.aweme.ecommerce.image;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class EcomImageFpsOptData {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("provider_size")
    public final int providerSize;

    public EcomImageFpsOptData() {
        this(true, 200);
    }

    public EcomImageFpsOptData(boolean z, int i) {
        this.enable = z;
        this.providerSize = i;
    }
}
