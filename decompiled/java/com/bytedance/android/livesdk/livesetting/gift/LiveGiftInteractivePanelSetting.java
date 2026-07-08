package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_interactive_gift_panel_enable")
public final class LiveGiftInteractivePanelSetting {
    public static final boolean DEFAULT = true;
    public static final LiveGiftInteractivePanelSetting INSTANCE = new LiveGiftInteractivePanelSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_interactive_gift_panel_enable", DEFAULT);
    }
}
