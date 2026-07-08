package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_gift_stable_mode_setting")
public final class LiveGiftStableModeSetting {
    public static final LiveGiftStableModeSetting INSTANCE = new LiveGiftStableModeSetting();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_stable_mode_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
