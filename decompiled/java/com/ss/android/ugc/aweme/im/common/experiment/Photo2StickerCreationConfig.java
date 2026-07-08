package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class Photo2StickerCreationConfig {

    @C09CT("colored_outline_image_compression_length")
    public final int coloredOutlineImageCompressionLength;

    @C09CT("colored_outline_width_to_image_ratio")
    public final float coloredOutlineWidthToImageRatio;

    @C09CT("cutout_api_image_compression_length")
    public final int cutoutApiImageCompressionLength;

    public Photo2StickerCreationConfig() {
        this(480, 0.03f, 480);
    }

    public Photo2StickerCreationConfig(int i, float f, int i2) {
        this.coloredOutlineImageCompressionLength = i;
        this.coloredOutlineWidthToImageRatio = f;
        this.cutoutApiImageCompressionLength = i2;
    }
}
