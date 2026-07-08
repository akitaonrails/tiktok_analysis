package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_auto_permit_remove_preview_panel")
public final class MultiGuestAutoPermitPreviewPanelSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestAutoPermitPreviewPanelSetting INSTANCE = new MultiGuestAutoPermitPreviewPanelSetting();
    public static final boolean REMOVE_PREVIEW = true;

    public final boolean removePreviewPanel() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_auto_permit_remove_preview_panel", DEFAULT);
    }
}
