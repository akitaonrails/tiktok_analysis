package com.ss.android.ugc.aweme.story.experiment.celebration;

import X.C093Y;
import X.C09CT;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class CelebrationStickerFontConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("special_default_font")
    public final String classicFont;

    @C09CT("default")
    public final String defaultFont;

    @C09CT("lang_text_style_map")
    public final Map<String, String> languageCode2FontMap;

    @C09CT("use_classic_text_style_lang")
    public final Set<String> useClassicTextStyleLang;

    public CelebrationStickerFontConfig() {
        this(null, null, null, null, 15, null);
    }

    public final String getClassicFont() {
        return this.classicFont;
    }

    public final String getDefaultFont() {
        return this.defaultFont;
    }

    public final Map<String, String> getLanguageCode2FontMap() {
        return this.languageCode2FontMap;
    }

    public final Set<String> getUseClassicTextStyleLang() {
        return this.useClassicTextStyleLang;
    }

    public CelebrationStickerFontConfig(String str, Map<String, String> map, Set<String> set, String str2) {
        this.defaultFont = str;
        this.languageCode2FontMap = map;
        this.useClassicTextStyleLang = set;
        this.classicFont = str2;
    }

    public CelebrationStickerFontConfig(String str, Map map, Set set, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "525093" : str, (i & 2) != 0 ? C2097608Jq.LJIIJ(new Pair("vi-VN", "603721494"), new Pair("th-TH", "118442562"), new Pair("ar", "603730170"), new Pair("zh-Hant-TW", "641743"), new Pair("ja-JP", "59424479"), new Pair("ko-KR", "525217")) : map, (i & 4) != 0 ? C093Y.LJ("bg", "bn-IN", "el-GR", "he-IL", "hi-IN", "kk", "km-KH", "ru-RU", "uk-UA", "ur", "zh-Hans", "my-MM") : set, (i & 8) != 0 ? "525097" : str2);
    }
}
