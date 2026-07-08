package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_user_layout_compute_opt")
public final class LiveMainFrameworkUpdateUserLayoutSetting {
    public static final LiveMainFrameworkUpdateUserLayoutSetting INSTANCE = new LiveMainFrameworkUpdateUserLayoutSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_user_layout_compute_opt", true);

    public final boolean enable() {
        return value;
    }
}
