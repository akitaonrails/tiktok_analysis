package com.ss.android.ugc.aweme.experiment.consumption;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class PerformanceParamsWithRequestConfig {

    @C09CT("enable_battery_pct")
    public final boolean enable_battery_pct;

    @C09CT("enable_battery_temperature")
    public final boolean enable_battery_temperature;

    @C09CT("enable_block_count")
    public final boolean enable_block_count;

    @C09CT("enable_block_duration")
    public final boolean enable_block_duration;

    @C09CT("enable_cpu_usage")
    public final boolean enable_cpu_usage;

    @C09CT("enable_data_save_mode")
    public final boolean enable_data_save_mode;

    @C09CT("enable_first_frame_duration")
    public final boolean enable_first_frame_duration;

    @C09CT("enable_gpu_usage")
    public final boolean enable_gpu_usage;

    @C09CT("enable_har_predict")
    public final boolean enable_har_predict;

    @C09CT("enable_is_bytevc1")
    public final boolean enable_is_bytevc1;

    @C09CT("enable_is_charge")
    public final boolean enable_is_charge;

    @C09CT("enable_low_power_mode")
    public final boolean enable_low_power_mode;

    @C09CT("enable_mem_avail")
    public final boolean enable_mem_avail;

    @C09CT("enable_net_connect_type")
    public final boolean enable_net_connect_type;

    @C09CT("enable_play_time_predict")
    public final boolean enable_play_time_predict;

    @C09CT("enable_start_playing_timestamp")
    public final boolean enable_start_playing_timestamp;

    @C09CT("enable_stream_music_volume")
    public final boolean enable_stream_music_volume;

    @C09CT("enable_video_bitrate")
    public final boolean enable_video_bitrate;

    @C09CT("enable_video_resolution")
    public final boolean enable_video_resolution;

    public PerformanceParamsWithRequestConfig() {
        this(true, true, true, true, true, true, true, true, false, true, true, false, true, true, true, true, true, true, true);
    }

    public PerformanceParamsWithRequestConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.enable_stream_music_volume = z;
        this.enable_battery_pct = z2;
        this.enable_is_charge = z3;
        this.enable_data_save_mode = z4;
        this.enable_low_power_mode = z5;
        this.enable_net_connect_type = z6;
        this.enable_mem_avail = z7;
        this.enable_cpu_usage = z8;
        this.enable_gpu_usage = z9;
        this.enable_battery_temperature = z10;
        this.enable_har_predict = z11;
        this.enable_play_time_predict = z12;
        this.enable_start_playing_timestamp = z13;
        this.enable_first_frame_duration = z14;
        this.enable_block_count = z15;
        this.enable_block_duration = z16;
        this.enable_video_bitrate = z17;
        this.enable_video_resolution = z18;
        this.enable_is_bytevc1 = z19;
    }
}
