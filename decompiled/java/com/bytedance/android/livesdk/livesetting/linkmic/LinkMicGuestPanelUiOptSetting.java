package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("link_mic_guest_panel_ui_opt")
public final class LinkMicGuestPanelUiOptSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicGuestPanelUiOptSetting INSTANCE = new LinkMicGuestPanelUiOptSetting();

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_guest_panel_ui_opt", DEFAULT);
    }
}
