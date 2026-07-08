package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_live_center_fix")
public final class MultiGuestLiveCenterFixSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestLiveCenterFixSetting INSTANCE = new MultiGuestLiveCenterFixSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_live_center_fix", DEFAULT);
    }
}
