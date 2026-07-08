package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class EffectConfig {
    public static final TypeAdapter ADAPTER = new EffectConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("height")
    public int height;

    @C09CT("resource")
    public ResourceConfig resourceConfig;

    @C09CT("width")
    public int width;

    public EffectConfig() {
        this(0, 0, null);
    }

    public EffectConfig(int i, int i2, ResourceConfig resourceConfig) {
        this.width = i;
        this.height = i2;
        this.resourceConfig = resourceConfig;
    }
}
