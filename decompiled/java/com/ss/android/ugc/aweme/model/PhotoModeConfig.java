package com.ss.android.ugc.aweme.model;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class PhotoModeConfig {

    @C09CT("full_page_max_image_container_ratio")
    public Float imageContainerMaxRatio;

    @C09CT("photos_ratio")
    public Float photosRatio;

    @C09CT("title_size")
    public Integer titleSize;

    public PhotoModeConfig() {
        this(Float.valueOf(0.5625f), 20, Float.valueOf(0.75f));
    }

    public PhotoModeConfig(Float f, Integer num, Float f2) {
        this.photosRatio = f;
        this.titleSize = num;
        this.imageContainerMaxRatio = f2;
    }
}
