package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment;

import X.C093Y;
import X.C09CT;
import X.C2097608Jq;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class PastMemoryTextFontConfig {

    @C09CT("default_font_map")
    public final Map<Integer, String> defaultFontMap;

    @C09CT("font_name_id_map")
    public final Map<String, String> fontNameResourceIdMap;

    @C09CT("language_code_2_font_map")
    public final Map<String, Map<Integer, String>> languageCode2FontMap;

    @C09CT("special_default_font_map")
    public final Map<Integer, String> specialDefaultFontMap;

    @C09CT("special_default_language_code")
    public final Set<String> useClassicTextStyleLang;

    public PastMemoryTextFontConfig() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PastMemoryTextFontConfig(Map<Integer, String> map, Map<String, ? extends Map<Integer, String>> map2, Map<Integer, String> map3, Set<String> set, Map<String, String> map4) {
        this.defaultFontMap = map;
        this.languageCode2FontMap = map2;
        this.specialDefaultFontMap = map3;
        this.useClassicTextStyleLang = set;
        this.fontNameResourceIdMap = map4;
    }

    public PastMemoryTextFontConfig(Map map, Map map2, Map map3, Set set, Map map4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJIIJ(new Pair(3, "Damion-Regular.ttf"), new Pair(0, "Sansita-ExtraBoldItalic.ttf"), new Pair(1, "CormorantGaramond-Regular.ttf"), new Pair(2, "BarlowCondensed-Bold.ttf")) : map, (i & 2) != 0 ? C2097608Jq.LJIIJ(new Pair("vi-VN", C2097608Jq.LJIIJ(new Pair(3, "DancingScript-Bold.ttf"), new Pair(0, "Calistoga-Regular.ttf"), new Pair(1, "CormorantGaramond-Regular.ttf"), new Pair(2, "BarlowCondensed-Bold.ttf"))), new Pair("th-TH", C2097608Jq.LJIIJ(new Pair(3, "Sriracha-Regular.ttf"), new Pair(0, "Pattaya-Regular.ttf"), new Pair(1, "Chonburi-Regular.ttf"), new Pair(2, "IBMPlexSansArabic-Bold.ttf"))), new Pair("ar", C2097608Jq.LJIIJ(new Pair(3, "Lemonada-Bold.ttf"), new Pair(0, "Alkalami-Regular.ttf"), new Pair(1, "Ruwudu-Regular.ttf"), new Pair(2, "Qahiri-Regular.ttf"))), new Pair("zh-Hant-TW", C2097608Jq.LJIIJ(new Pair(3, "jf-liao-proportional.ttf"), new Pair(0, "DFT_BC.ttf"), new Pair(1, "DFT_N5.ttf"), new Pair(2, "BarlowCondensed-Regular.ttf"))), new Pair("ja-JP", C2097608Jq.LJIIJ(new Pair(3, "mushin.otf"), new Pair(0, "まるご"), new Pair(1, "ShipporiMincho-Regular.ttf"), new Pair(2, "MPLUS2-Bold.ttf"))), new Pair("ko-KR", C2097608Jq.LJIIJ(new Pair(3, "YoonSunShowerL.otf"), new Pair(0, "YoonGothic780.otf"), new Pair(1, "NotoSerifKR-Light.ttf"), new Pair(2, "SDSwaggerTTF.ttf")))) : map2, (i & 4) != 0 ? C2097608Jq.LJIIJ(new Pair(3, "Proxima-Nova-Semibold.otf"), new Pair(0, "Proxima-Nova-Semibold.otf"), new Pair(1, "Proxima-Nova-Semibold.otf"), new Pair(2, "Proxima-Nova-Semibold.otf")) : map3, (i & 8) != 0 ? C093Y.LJ("bg", "bn-IN", "el-GR", "he-IL", "hi-IN", "kk", "km-KH", "ru-RU", "uk-UA", "ur", "zh-Hans", "my-MM") : set, (i & 16) != 0 ? C2097608Jq.LJIIJ(new Pair("Damion-Regular.ttf", "6792500762950767112"), new Pair("Sansita-ExtraBoldItalic.ttf", "7272277704764822018"), new Pair("CormorantGaramond-Regular.ttf", "7272277556408095234"), new Pair("BarlowCondensed-Bold.ttf", "7163279368096059905"), new Pair("Lemonada-Bold.ttf", "7402538715920208401"), new Pair("Alkalami-Regular.ttf", "7402538876092289553"), new Pair("Ruwudu-Regular.ttf", "7402539023220085264"), new Pair("Qahiri-Regular.ttf", "7402539182029017601"), new Pair("mushin.otf", "7262974879970890242"), new Pair("まるご", "6995862417234203138"), new Pair("ShipporiMincho-Regular.ttf", "7262975280342372866"), new Pair("MPLUS2-Bold.ttf", "7262973669524115970"), new Pair("YoonSunShowerL.otf", "6792509965903860238"), new Pair("YoonGothic780.otf", "6792509793396331016"), new Pair("NotoSerifKR-Light.ttf", "7402539370495873552"), new Pair("SDSwaggerTTF.ttf", "6792509261512446472"), new Pair("Sriracha-Regular.ttf", "7298562134835728897"), new Pair("Pattaya-Regular.ttf", "7298558604813013505"), new Pair("Chonburi-Regular.ttf", "7298557990745936386"), new Pair("IBMPlexSansArabic-Bold.ttf", "7441121584259011088"), new Pair("DancingScript-Bold.ttf", "7402538486676328977"), new Pair("Calistoga-Regular.ttf", "7298603968752521729"), new Pair("jf-liao-proportional.ttf", "6806234398392848903"), new Pair("DFT_BC.ttf", "6792510788033581575"), new Pair("DFT_N5.ttf", "6792511022679724557"), new Pair("BarlowCondensed-Regular.ttf", "6792500337614787085"), new Pair("Proxima-Nova-Semibold.otf", "7298280746832105985")) : map4);
    }
}
