package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GameAudioInferConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("live_game_sound_effect_interval_ignore_result_ms")
    public long intervalIgnoreResultMs;

    @C09CT("live_game_sound_effect_model_download_timer")
    public long modelDownLoadTimer;

    @C09CT("live_game_sound_effect_ring_buffer_max_cache_num")
    public int ringBufferMaxCacheNum;

    static {
        NormalGson.singleton();
        ADAPTER = new GameAudioInferConfig_OptTypeAdapter();
    }

    public GameAudioInferConfig() {
        this(120000L, 3, 5L);
    }

    public GameAudioInferConfig(long j, int i, long j2) {
        this.intervalIgnoreResultMs = j;
        this.ringBufferMaxCacheNum = i;
        this.modelDownLoadTimer = j2;
    }
}
