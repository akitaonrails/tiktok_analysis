package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class TextConfig {
    public static final TypeAdapter ADAPTER = new TextConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("default_format")
    public TextFormat defaultFormat;

    @C09CT("default_pattern")
    public String defaultPattern;

    @C09CT("key")
    public String key;

    public TextConfig() {
        this("", "", null);
    }

    public TextConfig(String str, String str2, TextFormat textFormat) {
        this.key = str;
        this.defaultPattern = str2;
        this.defaultFormat = textFormat;
    }
}
