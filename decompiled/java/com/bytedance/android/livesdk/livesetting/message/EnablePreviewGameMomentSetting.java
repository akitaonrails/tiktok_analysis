package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "enable_preview_game_moment")
public final class EnablePreviewGameMomentSetting {
    public static final boolean DEFAULT = true;
    public static final EnablePreviewGameMomentSetting INSTANCE = new EnablePreviewGameMomentSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_preview_game_moment", DEFAULT);
    }
}
