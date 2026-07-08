package com.bytedance.android.livesdk.game.broadcast.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class MobileGameBroadcastFeedbackConfig {
    public static final int $stable = 8;
    public static final TypeAdapter ADAPTER;

    @C09CT("battery_temp_android")
    public int battery_temp_android;

    @C09CT("battery_temp_lasting")
    public int battery_temp_lasting;

    @C09CT("livecore_data_sample_interval")
    public int livecore_data_sample_interval;

    @C09CT("ping_high_proportion")
    public float ping_high_proportion;

    @C09CT("ping_number")
    public int ping_number;

    @C09CT("ping_value")
    public int ping_value;

    @C09CT("power_low")
    public int power_low;

    @C09CT("power_low_proportion")
    public float power_low_proportion;

    @C09CT("power_save_mode_proportion")
    public float power_save_mode_proportion;

    @C09CT("real_bitrate_less_min_lasting")
    public int real_bitrate_less_min_lasting;

    @C09CT("real_bitrate_less_min_proportion")
    public float real_bitrate_less_min_proportion;

    @C09CT("real_fps_lasting")
    public int real_fps_lasting;

    @C09CT("real_fps_proportion")
    public float real_fps_proportion;

    @C09CT("real_fps_size")
    public int real_fps_size;

    @C09CT("rtt_lasting")
    public int rtt_lasting;

    @C09CT("rtt_size")
    public int rtt_size;

    static {
        NormalGson.singleton();
        ADAPTER = new MobileGameBroadcastFeedbackConfig_OptTypeAdapter();
    }

    public MobileGameBroadcastFeedbackConfig() {
        this(45, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 20, 0.7f, 0.9f, 60, 0.4f, 60, 0.4f, 20, 120, 100, 0.3f, 10, 100, 5);
    }

    public final int getBattery_temp_android() {
        return this.battery_temp_android;
    }

    public final int getBattery_temp_lasting() {
        return this.battery_temp_lasting;
    }

    public final int getLivecore_data_sample_interval() {
        return this.livecore_data_sample_interval;
    }

    public final float getPing_high_proportion() {
        return this.ping_high_proportion;
    }

    public final int getPing_number() {
        return this.ping_number;
    }

    public final int getPing_value() {
        return this.ping_value;
    }

    public final int getPower_low() {
        return this.power_low;
    }

    public final float getPower_low_proportion() {
        return this.power_low_proportion;
    }

    public final float getPower_save_mode_proportion() {
        return this.power_save_mode_proportion;
    }

    public final int getReal_bitrate_less_min_lasting() {
        return this.real_bitrate_less_min_lasting;
    }

    public final float getReal_bitrate_less_min_proportion() {
        return this.real_bitrate_less_min_proportion;
    }

    public final int getReal_fps_lasting() {
        return this.real_fps_lasting;
    }

    public final float getReal_fps_proportion() {
        return this.real_fps_proportion;
    }

    public final int getReal_fps_size() {
        return this.real_fps_size;
    }

    public final int getRtt_lasting() {
        return this.rtt_lasting;
    }

    public final int getRtt_size() {
        return this.rtt_size;
    }

    public final void setBattery_temp_android(int i) {
        this.battery_temp_android = i;
    }

    public final void setBattery_temp_lasting(int i) {
        this.battery_temp_lasting = i;
    }

    public final void setLivecore_data_sample_interval(int i) {
        this.livecore_data_sample_interval = i;
    }

    public final void setPing_high_proportion(float f) {
        this.ping_high_proportion = f;
    }

    public final void setPing_number(int i) {
        this.ping_number = i;
    }

    public final void setPing_value(int i) {
        this.ping_value = i;
    }

    public final void setPower_low(int i) {
        this.power_low = i;
    }

    public final void setPower_low_proportion(float f) {
        this.power_low_proportion = f;
    }

    public final void setPower_save_mode_proportion(float f) {
        this.power_save_mode_proportion = f;
    }

    public final void setReal_bitrate_less_min_lasting(int i) {
        this.real_bitrate_less_min_lasting = i;
    }

    public final void setReal_bitrate_less_min_proportion(float f) {
        this.real_bitrate_less_min_proportion = f;
    }

    public final void setReal_fps_lasting(int i) {
        this.real_fps_lasting = i;
    }

    public final void setReal_fps_proportion(float f) {
        this.real_fps_proportion = f;
    }

    public final void setReal_fps_size(int i) {
        this.real_fps_size = i;
    }

    public final void setRtt_lasting(int i) {
        this.rtt_lasting = i;
    }

    public final void setRtt_size(int i) {
        this.rtt_size = i;
    }

    public MobileGameBroadcastFeedbackConfig(int i, int i2, int i3, float f, float f2, int i4, float f3, int i5, float f4, int i6, int i7, int i8, float f5, int i9, int i10, int i11) {
        this.battery_temp_android = i;
        this.battery_temp_lasting = i2;
        this.power_low = i3;
        this.power_low_proportion = f;
        this.power_save_mode_proportion = f2;
        this.real_bitrate_less_min_lasting = i4;
        this.real_bitrate_less_min_proportion = f3;
        this.real_fps_lasting = i5;
        this.real_fps_proportion = f4;
        this.real_fps_size = i6;
        this.rtt_lasting = i7;
        this.rtt_size = i8;
        this.ping_high_proportion = f5;
        this.ping_number = i9;
        this.ping_value = i10;
        this.livecore_data_sample_interval = i11;
    }
}
