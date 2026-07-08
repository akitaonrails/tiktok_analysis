package com.ss.android.ugc.aweme.social.sticker.language;

import X.C09CT;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class FontTypeEffectMap implements Serializable {
    public static final int $stable = 8;

    @C09CT("font_type_effect_id_map")
    public final Map<String, String> fontTypeMap;

    public FontTypeEffectMap() {
        this(C2097608Jq.LJ());
    }

    public final Map<String, String> getFontTypeMap() {
        return this.fontTypeMap;
    }

    public FontTypeEffectMap(Map<String, String> map) {
        this.fontTypeMap = map;
    }
}
