package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_assert_layout")
public final class MultiGuestAssertLayoutSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestAssertLayoutSetting INSTANCE = new MultiGuestAssertLayoutSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_assert_layout", DEFAULT);
    }
}
