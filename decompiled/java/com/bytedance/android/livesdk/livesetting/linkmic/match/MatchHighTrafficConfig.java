package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchHighTrafficConfig {
    public static final TypeAdapter ADAPTER = new MatchHighTrafficConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("score_message_critical_interval")
    public long armies_message_critical_interval;

    @C09CT("score_message_serious_interval")
    public long armies_message_serious_interval;

    @C09CT("battle_start_animation_device_score_boundary")
    public float battle_start_animation_device_score_boundary;

    @C09CT("enable_cpu_boost_in_match")
    public boolean cpu_boost;

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("enable_extra_buffer_in_match")
    public boolean extraBuffer;

    @C09CT("fps_level_critical_boundary")
    public float fps_level_critical_boundary;

    @C09CT("fps_level_serious_boundary")
    public float fps_level_serious_boundary;

    @C09CT("hammer_critical_interval")
    public long hammer_critical_interval;

    @C09CT("hammer_normal_interval")
    public long hammer_normal_interval;

    @C09CT("hammer_serious_interval")
    public long hammer_serious_interval;

    @C09CT("power_up_request_layout_enabled")
    public boolean is_power_up_request_layout_enabled;

    @C09CT("score_message_frequency_control")
    public boolean score_message_frequececy_control;

    @C09CT("score_system_level_critical_boundary")
    public float score_system_critical_boundary;

    @C09CT("score_system_level_serious_boundary")
    public float score_system_serious_boundary;

    @C09CT("temperature_level_critical_boundary")
    public float temperature_level_critical_boundary;

    @C09CT("temperature_level_serious_boundary")
    public float temperature_level_serious_boundary;

    @C09CT("trigger_method")
    public int trigger_method;

    public MatchHighTrafficConfig() {
        this(false, true, 0, true, false, false, 300L, 500L, 450L, 1350L, 225L, 64.5f, 56.0f, 6.0f, 40.0f, 30.0f, 38.0f, 40.0f);
    }

    public MatchHighTrafficConfig(boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, long j, long j2, long j3, long j4, long j5, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.enabled = z;
        this.is_power_up_request_layout_enabled = z2;
        this.trigger_method = i;
        this.score_message_frequececy_control = z3;
        this.extraBuffer = z4;
        this.cpu_boost = z5;
        this.armies_message_serious_interval = j;
        this.armies_message_critical_interval = j2;
        this.hammer_serious_interval = j3;
        this.hammer_critical_interval = j4;
        this.hammer_normal_interval = j5;
        this.score_system_serious_boundary = f;
        this.score_system_critical_boundary = f2;
        this.battle_start_animation_device_score_boundary = f3;
        this.fps_level_serious_boundary = f4;
        this.fps_level_critical_boundary = f5;
        this.temperature_level_serious_boundary = f6;
        this.temperature_level_critical_boundary = f7;
    }
}
