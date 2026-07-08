package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FeResourceChannelConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("channel_name")
    public String feChannelName;

    @C09CT("max_level")
    public int maxLevel;

    @C09CT("min_level")
    public int minLevel;

    static {
        NormalGson.singleton();
        ADAPTER = new FeResourceChannelConfig_OptTypeAdapter();
    }

    public FeResourceChannelConfig() {
        this(0, 0, null);
    }

    public FeResourceChannelConfig(int i, int i2, String str) {
        this.minLevel = i;
        this.maxLevel = i2;
        this.feChannelName = str;
    }
}
