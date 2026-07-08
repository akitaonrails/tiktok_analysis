package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_icon_resource_opt")
public final class MultiGuestIconResourceOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestIconResourceOptSetting INSTANCE = new MultiGuestIconResourceOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_icon_resource_opt", DEFAULT);
    }
}
