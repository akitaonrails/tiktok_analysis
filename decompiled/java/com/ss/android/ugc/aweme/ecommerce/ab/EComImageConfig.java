package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EComImageConfig {

    @C09CT("low_image_size")
    public final int lowImageSize;

    @C09CT("middle_image_size")
    public final int middleImageSize;

    @C09CT("preload_duration")
    public final int preloadDuration;

    @C09CT("preload_size")
    public final int preloadSize;

    public EComImageConfig(int i, int i2, int i3, int i4) {
        this.preloadDuration = i;
        this.lowImageSize = i2;
        this.middleImageSize = i3;
        this.preloadSize = i4;
    }
}
