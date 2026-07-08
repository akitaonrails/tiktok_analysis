package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_preview_client_lock_opt")
public final class MultiGuestPreviewClientLockOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestPreviewClientLockOptSetting INSTANCE = new MultiGuestPreviewClientLockOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_preview_client_lock_opt", DEFAULT);
    }
}
