package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_individual_match_start_component_crash_setting")
public final class LiveIndividualMatchStartComponentCrashSetting {
    public static final boolean DEFAULT = false;
    public static final LiveIndividualMatchStartComponentCrashSetting INSTANCE = new LiveIndividualMatchStartComponentCrashSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_individual_match_start_component_crash_setting", DEFAULT);
    }
}
