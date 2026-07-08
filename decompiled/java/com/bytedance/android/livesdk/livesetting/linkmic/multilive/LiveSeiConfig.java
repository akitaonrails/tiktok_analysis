package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveSeiConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("parse_interval")
    public int interval;

    @C09CT("parse_type")
    public int parseType;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveSeiConfig_OptTypeAdapter();
    }

    public LiveSeiConfig() {
        this(0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
    }

    public LiveSeiConfig(int i, int i2) {
        this.parseType = i;
        this.interval = i2;
    }
}
