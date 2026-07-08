package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_interact_battle_open_timeout")
public final class LiveInteractBattleOpenTimeoutSetting {
    public static final long DEFAULT = 30;
    public static final LiveInteractBattleOpenTimeoutSetting INSTANCE = new LiveInteractBattleOpenTimeoutSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_interact_battle_open_timeout", DEFAULT);
    }
}
