package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "game_live_render_cutting_setting")
public final class GameLiveRenderCuttingSetting {
    public static final GameLiveRenderCuttingSetting INSTANCE = new GameLiveRenderCuttingSetting();
    public static final GameLiveRenderCuttingSettingData[] DEFAULT = new GameLiveRenderCuttingSettingData[0];

    public final GameLiveRenderCuttingSettingData[] getValue() {
        GameLiveRenderCuttingSettingData[] gameLiveRenderCuttingSettingDataArr = (GameLiveRenderCuttingSettingData[]) SettingsManager.INSTANCE.getValueSafely(GameLiveRenderCuttingSetting.class);
        return gameLiveRenderCuttingSettingDataArr == null ? DEFAULT : gameLiveRenderCuttingSettingDataArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.livesetting.game.GameLiveRenderCuttingSettingData getTargetCuttingData(java.lang.Integer r17, java.lang.Integer r18, java.lang.Integer r19, java.lang.Long r20) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.game.GameLiveRenderCuttingSetting.getTargetCuttingData(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long):com.bytedance.android.livesdk.livesetting.game.GameLiveRenderCuttingSettingData");
    }
}
