package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_guide_enable_layout_setting")
public final class MultiGuestGuideEnableLayoutSettingSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestGuideEnableLayoutSettingSetting INSTANCE = new MultiGuestGuideEnableLayoutSettingSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_guide_enable_layout_setting", DEFAULT);
    }
}
