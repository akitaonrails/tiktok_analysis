package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchAICommentaryVoiceVisualisationConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("big_scale")
    public float bigScale;

    @C09CT("entrance_hold_at_big_delay_ms")
    public int entranceHoldAtBigDelayMs;

    @C09CT("entrance_scale_down_duration_ms")
    public int entranceScaleDownDurationMs;

    @C09CT("entrance_scale_up_duration_ms")
    public int entranceScaleUpDurationMs;

    @C09CT("scale_anim_duration_ms")
    public int scaleAnimDurationMs;

    @C09CT("small_scale")
    public float smallScale;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveMatchAICommentaryVoiceVisualisationConfig_OptTypeAdapter();
    }

    public LiveMatchAICommentaryVoiceVisualisationConfig() {
        this(1.0f, 1.2f, 450, 450, 750, 500);
    }

    public LiveMatchAICommentaryVoiceVisualisationConfig(float f, float f2, int i, int i2, int i3, int i4) {
        this.smallScale = f;
        this.bigScale = f2;
        this.scaleAnimDurationMs = i;
        this.entranceScaleUpDurationMs = i2;
        this.entranceHoldAtBigDelayMs = i3;
        this.entranceScaleDownDurationMs = i4;
    }
}
