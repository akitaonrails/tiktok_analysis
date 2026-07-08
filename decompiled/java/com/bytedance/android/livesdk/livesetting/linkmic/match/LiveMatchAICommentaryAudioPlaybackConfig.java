package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveMatchAICommentaryAudioPlaybackConfig {
    public static final TypeAdapter ADAPTER = new LiveMatchAICommentaryAudioPlaybackConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("play_timeout_enable")
    public boolean play_timeout_enable;

    @C09CT("play_timeout_extra_time_ms")
    public float play_timeout_extra_time_ms;

    public LiveMatchAICommentaryAudioPlaybackConfig() {
        this(true, 3000.0f);
    }

    public LiveMatchAICommentaryAudioPlaybackConfig(boolean z, float f) {
        this.play_timeout_enable = z;
        this.play_timeout_extra_time_ms = f;
    }
}
