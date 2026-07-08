package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchStickerVariantItem implements Serializable {

    @C09CT("animated_image")
    public final StickerImage animatedImage;

    @C09CT("sticker_variant")
    public final Integer defaultStickerVariant;

    @C09CT("sticker_id")
    public final Long stickerId;

    @C09CT("sticker_type")
    public final Integer stickerType;

    public SwitchStickerVariantItem(Integer num, Long l, StickerImage stickerImage, @StickerVariant Integer num2) {
        this.stickerType = num;
        this.stickerId = l;
        this.animatedImage = stickerImage;
        this.defaultStickerVariant = num2;
    }
}
