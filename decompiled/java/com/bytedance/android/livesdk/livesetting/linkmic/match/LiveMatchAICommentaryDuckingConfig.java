package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveMatchAICommentaryDuckingConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("attack_time_s")
    public float attack_time_s;

    @C09CT("decode_output_audio_duration_ms_per_time")
    public float decode_output_audio_duration_ms_per_time;

    @C09CT("gain_db")
    public float gain_db;

    @C09CT("hold_time_s")
    public float hold_time_s;

    @C09CT("input_volume_scale")
    public float input_volume_scale;

    @C09CT("max_buffer_audio_time_ms")
    public float max_buffer_audio_time_ms;

    @C09CT("release_time_s")
    public float release_time_s;

    @C09CT("rms_smooth_time_s")
    public float rms_smooth_time_s;

    @C09CT("speech_thres_dbfs")
    public float speech_thres_dbfs;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveMatchAICommentaryDuckingConfig_OptTypeAdapter();
    }

    public LiveMatchAICommentaryDuckingConfig() {
        this(-25.0f, -10.0f, 0.01f, 1.0f, 0.001f, 1.5f, 10000.0f, 0.2f, 200.0f);
    }

    public LiveMatchAICommentaryDuckingConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.speech_thres_dbfs = f;
        this.gain_db = f2;
        this.rms_smooth_time_s = f3;
        this.hold_time_s = f4;
        this.attack_time_s = f5;
        this.release_time_s = f6;
        this.max_buffer_audio_time_ms = f7;
        this.input_volume_scale = f8;
        this.decode_output_audio_duration_ms_per_time = f9;
    }
}
