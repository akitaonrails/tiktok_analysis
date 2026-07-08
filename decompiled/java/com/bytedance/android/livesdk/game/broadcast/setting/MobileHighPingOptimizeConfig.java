package com.bytedance.android.livesdk.game.broadcast.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class MobileHighPingOptimizeConfig {
    public static final int $stable = 8;
    public static final TypeAdapter ADAPTER;

    @C09CT("high_ping_tips_trigger_count")
    public int high_ping_tips_trigger_count;

    @C09CT("high_ping_value")
    public int high_ping_value;

    @C09CT("ping_confidence")
    public float ping_confidence;

    @C09CT("valid_high_ping_reference_count")
    public int valid_high_ping_reference_count;

    static {
        NormalGson.singleton();
        ADAPTER = new MobileHighPingOptimizeConfig_OptTypeAdapter();
    }

    public MobileHighPingOptimizeConfig() {
        this(15, 5, 100, 0.95f);
    }

    public final int getHigh_ping_tips_trigger_count() {
        return this.high_ping_tips_trigger_count;
    }

    public final int getHigh_ping_value() {
        return this.high_ping_value;
    }

    public final float getPing_confidence() {
        return this.ping_confidence;
    }

    public final int getValid_high_ping_reference_count() {
        return this.valid_high_ping_reference_count;
    }

    public final void setHigh_ping_tips_trigger_count(int i) {
        this.high_ping_tips_trigger_count = i;
    }

    public final void setHigh_ping_value(int i) {
        this.high_ping_value = i;
    }

    public final void setPing_confidence(float f) {
        this.ping_confidence = f;
    }

    public final void setValid_high_ping_reference_count(int i) {
        this.valid_high_ping_reference_count = i;
    }

    public MobileHighPingOptimizeConfig(int i, int i2, int i3, float f) {
        this.valid_high_ping_reference_count = i;
        this.high_ping_tips_trigger_count = i2;
        this.high_ping_value = i3;
        this.ping_confidence = f;
    }
}
