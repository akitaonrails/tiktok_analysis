package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_sync_custom_setting_delay_ms")
public final class LiveGiftSyncCustomSettingDelay {
    public static final int DEFAULT = 1000;
    public static final LiveGiftSyncCustomSettingDelay INSTANCE = new LiveGiftSyncCustomSettingDelay();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_sync_custom_setting_delay_ms", DEFAULT);
    }
}
