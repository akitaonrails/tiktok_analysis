package com.bytedance.android.livesdk.game.broadcast.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class MobileHighPingAdjustBitrateConfig {
    public static final int $stable = 8;
    public static final TypeAdapter ADAPTER;

    @C09CT("high_ping_adjust_bitrate_decline_range")
    public float high_ping_adjust_bitrate_decline_range;

    @C09CT("high_ping_adjust_bitrate_scope")
    public int high_ping_adjust_bitrate_scope;

    @C09CT("high_ping_adjust_bitrate_trigger_continue_high_ping_count")
    public int high_ping_adjust_bitrate_trigger_continue_high_ping_count;

    @C09CT("high_ping_adjust_bitrate_trigger_continue_not_high_ping_count")
    public int high_ping_adjust_bitrate_trigger_continue_not_high_ping_count;

    @C09CT("high_ping_limit_bitrate_allow_range")
    public float high_ping_limit_bitrate_allow_range;

    @C09CT("ping_confidence")
    public float ping_confidence;

    @C09CT("ping_value")
    public int ping_value;

    static {
        NormalGson.singleton();
        ADAPTER = new MobileHighPingAdjustBitrateConfig_OptTypeAdapter();
    }

    public MobileHighPingAdjustBitrateConfig() {
        this(0, 1, 3, 100, 0.95f, 0.8f, 0.1f);
    }

    public final float getHigh_ping_adjust_bitrate_decline_range() {
        return this.high_ping_adjust_bitrate_decline_range;
    }

    public final int getHigh_ping_adjust_bitrate_scope() {
        return this.high_ping_adjust_bitrate_scope;
    }

    public final int getHigh_ping_adjust_bitrate_trigger_continue_high_ping_count() {
        return this.high_ping_adjust_bitrate_trigger_continue_high_ping_count;
    }

    public final int getHigh_ping_adjust_bitrate_trigger_continue_not_high_ping_count() {
        return this.high_ping_adjust_bitrate_trigger_continue_not_high_ping_count;
    }

    public final float getHigh_ping_limit_bitrate_allow_range() {
        return this.high_ping_limit_bitrate_allow_range;
    }

    public final float getPing_confidence() {
        return this.ping_confidence;
    }

    public final int getPing_value() {
        return this.ping_value;
    }

    public final void setHigh_ping_adjust_bitrate_decline_range(float f) {
        this.high_ping_adjust_bitrate_decline_range = f;
    }

    public final void setHigh_ping_adjust_bitrate_scope(int i) {
        this.high_ping_adjust_bitrate_scope = i;
    }

    public final void setHigh_ping_adjust_bitrate_trigger_continue_high_ping_count(int i) {
        this.high_ping_adjust_bitrate_trigger_continue_high_ping_count = i;
    }

    public final void setHigh_ping_adjust_bitrate_trigger_continue_not_high_ping_count(int i) {
        this.high_ping_adjust_bitrate_trigger_continue_not_high_ping_count = i;
    }

    public final void setHigh_ping_limit_bitrate_allow_range(float f) {
        this.high_ping_limit_bitrate_allow_range = f;
    }

    public final void setPing_confidence(float f) {
        this.ping_confidence = f;
    }

    public final void setPing_value(int i) {
        this.ping_value = i;
    }

    public MobileHighPingAdjustBitrateConfig(int i, int i2, int i3, int i4, float f, float f2, float f3) {
        this.high_ping_adjust_bitrate_scope = i;
        this.high_ping_adjust_bitrate_trigger_continue_high_ping_count = i2;
        this.high_ping_adjust_bitrate_trigger_continue_not_high_ping_count = i3;
        this.ping_value = i4;
        this.ping_confidence = f;
        this.high_ping_adjust_bitrate_decline_range = f2;
        this.high_ping_limit_bitrate_allow_range = f3;
    }
}
