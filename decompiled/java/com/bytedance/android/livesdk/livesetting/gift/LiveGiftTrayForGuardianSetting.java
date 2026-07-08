package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_tray_for_guardian")
public final class LiveGiftTrayForGuardianSetting {
    public static final LiveGiftTrayForGuardianSetting INSTANCE = new LiveGiftTrayForGuardianSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_tray_for_guardian", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
