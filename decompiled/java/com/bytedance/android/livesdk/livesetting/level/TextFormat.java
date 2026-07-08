package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class TextFormat {
    public static final TypeAdapter ADAPTER;

    @C09CT("color")
    public String color;

    @C09CT("font_size")
    public int fontSize;

    @C09CT("weight")
    public int weight;

    static {
        NormalGson.singleton();
        ADAPTER = new TextFormat_OptTypeAdapter();
    }

    public TextFormat() {
        this("", 0, 0);
    }

    public TextFormat(String str, int i, int i2) {
        this.color = str;
        this.weight = i;
        this.fontSize = i2;
    }
}
