package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_panel_data_tracking_for_fan_dialog")
public final class GiftPanelDataTrackingForFanDialogSettings {
    public static final GiftPanelDataTrackingForFanDialogSettings INSTANCE = new GiftPanelDataTrackingForFanDialogSettings();
    public static final boolean DEFAULT = true;

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("gift_panel_data_tracking_for_fan_dialog", DEFAULT);
    }
}
