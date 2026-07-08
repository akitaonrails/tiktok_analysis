package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_preview_camera_remeber_switch")
public final class MultiGuestPreviewCameraMemorySettings {
    public static final boolean DEFAULT = false;
    public static final MultiGuestPreviewCameraMemorySettings INSTANCE = new MultiGuestPreviewCameraMemorySettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_preview_camera_remeber_switch", DEFAULT);
    }
}
