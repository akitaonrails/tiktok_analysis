package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchMiddleAIConfigModel {

    @C09CT("ai_page_preload_delay_time_millis")
    public final int aiPagePreloadDelayTimeMillis;

    @C09CT("enable")
    public final int enable;

    @C09CT("enable_float_entrance")
    public final int enableFloatEntrance;

    @C09CT("gs_cache_enable")
    public final int gsCacheEnable;

    @C09CT("simple_tab_enable")
    public final int simpleTabEnable;

    @C09CT("voice_input_enable")
    public final int voiceInputEnable;

    @C09CT("voice_input_noise_floor")
    public final float voiceInputNoiseFloor;

    @C09CT("voice_input_voice_ceiling")
    public final float voiceInputVoiceCeiling;

    @C09CT("voice_input_voice_smooth_factor")
    public final float voiceInputVoiceSmoothFactor;

    public EcSearchMiddleAIConfigModel() {
        this(0, 0, 0, 0, -1, 0, 0.05f, 0.5f, 0.1f);
    }

    public EcSearchMiddleAIConfigModel(int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3) {
        this.enable = i;
        this.simpleTabEnable = i2;
        this.enableFloatEntrance = i3;
        this.gsCacheEnable = i4;
        this.aiPagePreloadDelayTimeMillis = i5;
        this.voiceInputEnable = i6;
        this.voiceInputNoiseFloor = f;
        this.voiceInputVoiceCeiling = f2;
        this.voiceInputVoiceSmoothFactor = f3;
    }
}
