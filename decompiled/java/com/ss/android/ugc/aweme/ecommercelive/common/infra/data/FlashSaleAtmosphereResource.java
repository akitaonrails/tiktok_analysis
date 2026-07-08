package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class FlashSaleAtmosphereResource {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("background_gradient_colors")
    public final List<String> backgroundGradientColors;

    @C09CT("preheat_highlight_text_color")
    public final String preheatHighlightTextColor;

    @C09CT("tag_image")
    public final ECImage tagImage;

    public FlashSaleAtmosphereResource(ECImage eCImage, List<String> list, String str, String str2) {
        this.tagImage = eCImage;
        this.backgroundGradientColors = list;
        this.backgroundColor = str;
        this.preheatHighlightTextColor = str2;
    }
}
