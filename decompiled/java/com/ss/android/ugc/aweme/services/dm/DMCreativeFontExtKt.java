package com.ss.android.ugc.aweme.services.dm;

import X.EnumC1466150oFx;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;

/* JADX INFO: loaded from: classes23.dex */
public final class DMCreativeFontExtKt {
    public static final TextStickerModel toTextStickerModel(DMCreativeStickerFontData dMCreativeStickerFontData) {
        String text = dMCreativeStickerFontData.getText();
        BaseStickerModel baseStickerModel = new BaseStickerModel(0, 0, EnumC1466150oFx.TEXT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dMCreativeStickerFontData.getTranslationY(), 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.7f, null, null, null, false, 2143289339, 15, null);
        int style = dMCreativeStickerFontData.getStyle();
        int color = dMCreativeStickerFontData.getColor();
        String fontResId = dMCreativeStickerFontData.getFontResId();
        if (fontResId == null) {
            fontResId = "";
        }
        return new TextStickerModel(baseStickerModel, null, null, text, null, style, color, 0, 0.0f, new TextFontModel(null, fontResId, null, null, null, null, 0, 0, null, null, false, false, false, 0, 16381, null), false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, true, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -7786, 65533, null);
    }
}
