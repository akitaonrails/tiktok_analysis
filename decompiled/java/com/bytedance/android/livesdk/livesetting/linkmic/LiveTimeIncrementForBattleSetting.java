package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_time_increment_for_battle")
public final class LiveTimeIncrementForBattleSetting {
    public static final long DEFAULT = 2;
    public static final LiveTimeIncrementForBattleSetting INSTANCE = new LiveTimeIncrementForBattleSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_time_increment_for_battle", DEFAULT);
    }
}
