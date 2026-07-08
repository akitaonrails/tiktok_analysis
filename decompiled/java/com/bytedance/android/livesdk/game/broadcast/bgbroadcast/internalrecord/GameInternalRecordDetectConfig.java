package com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class GameInternalRecordDetectConfig {
    public static final int $stable = 8;
    public static final TypeAdapter ADAPTER = new GameInternalRecordDetectConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("excluded_game_names")
    public String[] excludedGameNames;

    @C09CT("pause_gradient_ms")
    public long[] pauseGradientMs;

    @C09CT("silent_duration_ms")
    public long silentDurationMs;

    public GameInternalRecordDetectConfig() {
        this(30000L, new long[]{60000, 120000, 180000, 240000, 300000}, new String[]{""});
    }

    public final String[] getExcludedGameNames() {
        return this.excludedGameNames;
    }

    public final long[] getPauseGradientMs() {
        return this.pauseGradientMs;
    }

    public final long getSilentDurationMs() {
        return this.silentDurationMs;
    }

    public final void setExcludedGameNames(String[] strArr) {
        this.excludedGameNames = strArr;
    }

    public final void setPauseGradientMs(long[] jArr) {
        this.pauseGradientMs = jArr;
    }

    public final void setSilentDurationMs(long j) {
        this.silentDurationMs = j;
    }

    public GameInternalRecordDetectConfig(long j, long[] jArr, String[] strArr) {
        this.silentDurationMs = j;
        this.pauseGradientMs = jArr;
        this.excludedGameNames = strArr;
    }
}
