package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("become_active_anr_fix_setting")
public final class BecomeActiveAnrFixSetting {
    public static final boolean DEFAULT = true;
    public static final BecomeActiveAnrFixSetting INSTANCE = new BecomeActiveAnrFixSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("become_active_anr_fix_setting", DEFAULT);
    }
}
