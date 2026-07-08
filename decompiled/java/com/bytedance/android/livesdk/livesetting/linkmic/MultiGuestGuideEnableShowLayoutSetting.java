package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_guide_enable_show_layout")
public final class MultiGuestGuideEnableShowLayoutSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestGuideEnableShowLayoutSetting INSTANCE = new MultiGuestGuideEnableShowLayoutSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_guide_enable_show_layout", DEFAULT);
    }
}
