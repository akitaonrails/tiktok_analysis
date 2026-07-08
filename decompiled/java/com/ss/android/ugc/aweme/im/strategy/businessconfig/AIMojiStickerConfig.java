package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionStickerSetMessage;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class AIMojiStickerConfig {

    @C09CT("expressions")
    public final List<String> expressions;

    @C09CT("fallback_sticker")
    public final LightInteractionStickerSetMessage fallbackSticker;

    public AIMojiStickerConfig(List<String> list, LightInteractionStickerSetMessage lightInteractionStickerSetMessage) {
        this.expressions = list;
        this.fallbackSticker = lightInteractionStickerSetMessage;
    }
}
