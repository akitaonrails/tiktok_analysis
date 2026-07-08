package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class TriggerConfiguration {
    public static final TypeAdapter ADAPTER;

    @C09CT("delay")
    public double delay;

    @C09CT("play_immediate")
    public int playImmediate;

    @C09CT("trigger_type")
    public int triggerType;

    static {
        NormalGson.singleton();
        ADAPTER = new TriggerConfiguration_OptTypeAdapter();
    }

    public TriggerConfiguration() {
        this(0, 0.0d, 0);
    }

    public TriggerConfiguration(int i, double d, int i2) {
        this.triggerType = i;
        this.delay = d;
        this.playImmediate = i2;
    }
}
