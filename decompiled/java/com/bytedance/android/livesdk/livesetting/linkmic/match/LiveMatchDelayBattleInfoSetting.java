package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("delay_get_battle_info")
public final class LiveMatchDelayBattleInfoSetting {
    public static final long DEFAULT = 0;
    public static final LiveMatchDelayBattleInfoSetting INSTANCE = new LiveMatchDelayBattleInfoSetting();

    public final long getDelayDuration() {
        return SettingsManager.INSTANCE.getLongValue("delay_get_battle_info", DEFAULT);
    }
}
