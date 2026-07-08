package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("quick_cohost_enter_from_update_setting")
public final class QuickCohostEnterFromUpdateSettings {
    public static final boolean DEFAULT = true;
    public static final QuickCohostEnterFromUpdateSettings INSTANCE = new QuickCohostEnterFromUpdateSettings();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("quick_cohost_enter_from_update_setting", DEFAULT);
    }
}
