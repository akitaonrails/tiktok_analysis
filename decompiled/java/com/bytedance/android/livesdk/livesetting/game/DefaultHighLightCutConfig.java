package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import X.C1078710eB3;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DefaultHighLightCutConfig {
    public static final TypeAdapter ADAPTER;
    public static final C1078710eB3 Companion = new Object() { // from class: X.0eB3
    };
    public static final int DEFAULT_CUT_INTERVAL = 300;

    @C09CT("min_cut_interval")
    public int minCutInterval = DEFAULT_CUT_INTERVAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0eB3] */
    static {
        NormalGson.singleton();
        ADAPTER = new DefaultHighLightCutConfig_OptTypeAdapter();
    }

    public final int getMinCutInterval() {
        return this.minCutInterval;
    }

    public final void setMinCutInterval(int i) {
        this.minCutInterval = i;
    }
}
