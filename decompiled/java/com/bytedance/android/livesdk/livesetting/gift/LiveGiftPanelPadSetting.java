package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("pad_gift_panel")
public final class LiveGiftPanelPadSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGiftPanelPadSetting INSTANCE = new LiveGiftPanelPadSetting();

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("pad_gift_panel", DEFAULT);
    }
}
