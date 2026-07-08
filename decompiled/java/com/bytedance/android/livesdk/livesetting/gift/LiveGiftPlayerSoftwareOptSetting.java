package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_player_software_opt")
public final class LiveGiftPlayerSoftwareOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveGiftPlayerSoftwareOptSetting INSTANCE = new LiveGiftPlayerSoftwareOptSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("gift_player_software_opt", DEFAULT);
    }
}
