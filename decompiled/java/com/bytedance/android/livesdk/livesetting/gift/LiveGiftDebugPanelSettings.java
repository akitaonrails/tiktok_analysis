package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_debug_panel_enable")
public final class LiveGiftDebugPanelSettings {
    public static final boolean DEFAULT = true;
    public static final LiveGiftDebugPanelSettings INSTANCE = new LiveGiftDebugPanelSettings();

    public final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_debug_panel_enable", DEFAULT);
    }
}
