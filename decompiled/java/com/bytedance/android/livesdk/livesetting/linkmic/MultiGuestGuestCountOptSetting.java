package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_guest_count_opt")
public final class MultiGuestGuestCountOptSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestGuestCountOptSetting INSTANCE = new MultiGuestGuestCountOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_guest_count_opt", DEFAULT);
    }
}
