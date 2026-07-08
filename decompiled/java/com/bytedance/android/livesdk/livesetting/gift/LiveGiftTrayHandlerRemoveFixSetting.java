package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_gift_tray_gift_handler_Remove_fix")
public final class LiveGiftTrayHandlerRemoveFixSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGiftTrayHandlerRemoveFixSetting INSTANCE = new LiveGiftTrayHandlerRemoveFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_tray_gift_handler_Remove_fix", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
