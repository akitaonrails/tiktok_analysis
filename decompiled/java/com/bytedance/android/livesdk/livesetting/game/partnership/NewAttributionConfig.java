package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class NewAttributionConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("attr_frequency_limit")
    public int attrFrequencyLimit;

    static {
        NormalGson.singleton();
        ADAPTER = new NewAttributionConfig_OptTypeAdapter();
    }

    public NewAttributionConfig() {
        this(0);
    }

    public NewAttributionConfig(int i) {
        this.attrFrequencyLimit = i;
    }
}
