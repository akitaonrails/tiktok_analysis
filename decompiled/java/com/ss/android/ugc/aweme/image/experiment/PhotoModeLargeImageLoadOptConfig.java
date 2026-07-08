package com.ss.android.ugc.aweme.image.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class PhotoModeLargeImageLoadOptConfig {
    public static final int $stable = 0;

    @C09CT("large_image_load_opt_enabled")
    public final boolean enableLargeImageLoadOpt;

    @C09CT("large_image_load_opt_ratio")
    public final float largeImageLoadOptRatio;

    @C09CT("large_image_load_opt_resize_height")
    public final int largeImageLoadResizeHeight;

    @C09CT("large_image_load_opt_resize_width")
    public final int largeImageLoadResizeWidth;

    public PhotoModeLargeImageLoadOptConfig() {
        this(false, 0.2f, 1080, 1080);
    }

    public final boolean getEnableLargeImageLoadOpt() {
        return this.enableLargeImageLoadOpt;
    }

    public final float getLargeImageLoadOptRatio() {
        return this.largeImageLoadOptRatio;
    }

    public final int getLargeImageLoadResizeHeight() {
        return this.largeImageLoadResizeHeight;
    }

    public final int getLargeImageLoadResizeWidth() {
        return this.largeImageLoadResizeWidth;
    }

    public PhotoModeLargeImageLoadOptConfig(boolean z, float f, int i, int i2) {
        this.enableLargeImageLoadOpt = z;
        this.largeImageLoadOptRatio = f;
        this.largeImageLoadResizeWidth = i;
        this.largeImageLoadResizeHeight = i2;
    }
}
