package com.ss.android.ugc.gamora.recorder.sticker.abtest;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectLanguageMap {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public final String f86default;

    @C09CT("language_map")
    public final Map<String, String> languageMap;

    public EffectLanguageMap() {
        this(C2097608Jq.LJ(), "source");
    }

    public EffectLanguageMap(Map<String, String> map, String str) {
        this.languageMap = map;
        this.f86default = str;
    }
}
