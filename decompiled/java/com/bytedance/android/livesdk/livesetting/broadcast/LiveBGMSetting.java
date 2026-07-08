package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_upgrade_bgm")
public final class LiveBGMSetting {
    public static final int DEFAULT = 1;
    public static final LiveBGMSetting INSTANCE = new LiveBGMSetting();

    public final boolean inLiveBGMUpgrade() {
        return SettingsManager.INSTANCE.getIntValue("live_upgrade_bgm", DEFAULT) != 1;
    }

    public final boolean inLiveBGMUpgradeV1() {
        return SettingsManager.INSTANCE.getIntValue("live_upgrade_bgm", DEFAULT) == 2;
    }

    public final boolean inLiveBGMUpgradeV2() {
        return SettingsManager.INSTANCE.getIntValue("live_upgrade_bgm", DEFAULT) == 4;
    }

    public final boolean inLiveBGMUpgradeV3() {
        return SettingsManager.INSTANCE.getIntValue("live_upgrade_bgm", DEFAULT) == 3;
    }
}
