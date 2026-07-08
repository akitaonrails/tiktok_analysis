package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_render_cutting_setting_v2")
public final class GameLiveRenderCuttingSettingV2 {
    public static final GameLiveRenderCuttingSettingV2 INSTANCE = new GameLiveRenderCuttingSettingV2();
    public static final GameLiveRenderCuttingSettingData[] DEFAULT = new GameLiveRenderCuttingSettingData[0];

    public final GameLiveRenderCuttingSettingData[] getValue() {
        GameLiveRenderCuttingSettingData[] gameLiveRenderCuttingSettingDataArr = (GameLiveRenderCuttingSettingData[]) SettingsManager.INSTANCE.getValueSafely(GameLiveRenderCuttingSettingV2.class);
        return gameLiveRenderCuttingSettingDataArr == null ? DEFAULT : gameLiveRenderCuttingSettingDataArr;
    }
}
