package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_slow_method_opt")
public final class MultiGuestSlowMethodOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestSlowMethodOptSetting INSTANCE = new MultiGuestSlowMethodOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_slow_method_opt", DEFAULT);
    }
}
