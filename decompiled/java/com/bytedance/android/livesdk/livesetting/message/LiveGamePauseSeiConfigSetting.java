package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_game_pause_sei_config")
public final class LiveGamePauseSeiConfigSetting {
    public static final LiveGamePauseSeiConfigSetting INSTANCE = new LiveGamePauseSeiConfigSetting();
    public static final LiveGamePauseSeiModel DEFAULT = new LiveGamePauseSeiModel(false, false, 1000, false);

    public final LiveGamePauseSeiModel getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveGamePauseSeiModel liveGamePauseSeiModel = DEFAULT;
        LiveGamePauseSeiModel liveGamePauseSeiModel2 = (LiveGamePauseSeiModel) settingsManager.getValueSafely("live_game_pause_sei_config", liveGamePauseSeiModel);
        return liveGamePauseSeiModel2 != null ? liveGamePauseSeiModel2 : liveGamePauseSeiModel;
    }
}
