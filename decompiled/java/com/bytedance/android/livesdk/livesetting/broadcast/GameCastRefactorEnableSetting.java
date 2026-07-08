package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "game_cast_refactor_enable")
public final class GameCastRefactorEnableSetting {
    public static final boolean DEFAULT = false;
    public static final boolean GROUP_EXPERIMENT = true;
    public static final GameCastRefactorEnableSetting INSTANCE = new GameCastRefactorEnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("game_cast_refactor_enable", DEFAULT);
    }
}
