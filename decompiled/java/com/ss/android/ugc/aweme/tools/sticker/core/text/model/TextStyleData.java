package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;

/* JADX INFO: loaded from: classes6.dex */
public final class TextStyleData {

    @C09CT("font_res_id")
    public String fontResId;

    @C09CT("is_effect_style")
    public Boolean isEffectStyle;

    public TextStyleData() {
        this(null, "");
    }

    public TextStyleData(Boolean bool, String str) {
        this.isEffectStyle = bool;
        this.fontResId = str;
    }
}
