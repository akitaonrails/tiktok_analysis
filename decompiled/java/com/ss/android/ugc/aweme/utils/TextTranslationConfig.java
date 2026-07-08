package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class TextTranslationConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("dnt_lang_list")
    public final List<String> dntLangList;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("target_lang")
    public final String targetLang;

    public TextTranslationConfig(String str, String str2, List<String> list) {
        this.scene = str;
        this.targetLang = str2;
        this.dntLangList = list;
    }
}
