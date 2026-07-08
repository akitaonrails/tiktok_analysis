package com.ss.android.ugc.aweme.social.sticker.language;

import X.C09CT;
import X.C2097608Jq;
import X.EnumC1157960gEs;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class StoryStickerLanguageConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("font_map")
    public final Map<String, FontTypeEffectMap> fontMap;

    public StoryStickerLanguageConfig() {
        this(null, 1, null);
    }

    public final Map<String, FontTypeEffectMap> getFontMap() {
        return this.fontMap;
    }

    public StoryStickerLanguageConfig(Map<String, FontTypeEffectMap> map) {
        this.fontMap = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StoryStickerLanguageConfig(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            EnumC1157960gEs enumC1157960gEs = EnumC1157960gEs.BOLD;
            EnumC1157960gEs enumC1157960gEs2 = EnumC1157960gEs.BLACK;
            map = C2097608Jq.LJIIIIZZ(new Pair("th-TH", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3113125457"), new Pair(enumC1157960gEs2.getValue(), "3113125458")))), new Pair("km-KH", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3112961631"), new Pair(enumC1157960gEs2.getValue(), "3113125463")))), new Pair("zh-Hans", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3113125460"), new Pair(enumC1157960gEs2.getValue(), "3113125462")))), new Pair("zh-Hant-TW", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3113125459"), new Pair(enumC1157960gEs2.getValue(), "3113125461")))), new Pair("ja-JP", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3113125464"), new Pair(enumC1157960gEs2.getValue(), "3113125467")))), new Pair("ko-KR", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3113125465"), new Pair(enumC1157960gEs2.getValue(), "3113125466")))), new Pair("he-IL", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3113125470"), new Pair(enumC1157960gEs2.getValue(), "3113125468")))), new Pair("hi-IN", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3113125471"), new Pair(enumC1157960gEs2.getValue(), "3113125473")))), new Pair("bn-IN", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3113125469"), new Pair(enumC1157960gEs2.getValue(), "3113125472")))), new Pair("ar", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3113125475"), new Pair(enumC1157960gEs2.getValue(), "3113125474")))), new Pair("my-MM", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3112959598"), new Pair(enumC1157960gEs2.getValue(), "3112960741")))), new Pair("ru-RU", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3117118515"), new Pair(enumC1157960gEs2.getValue(), "3117118516")))), new Pair("uk-UA", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3117118515"), new Pair(enumC1157960gEs2.getValue(), "3117118516")))), new Pair("bg", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3117118515"), new Pair(enumC1157960gEs2.getValue(), "3117118516")))), new Pair("kk", new FontTypeEffectMap(C2097608Jq.LJIIIIZZ(new Pair(enumC1157960gEs.getValue(), "3117118515"), new Pair(enumC1157960gEs2.getValue(), "3117118516")))));
        }
        this(map);
    }
}
