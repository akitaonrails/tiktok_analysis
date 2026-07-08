package com.bytedance.android.livesdk.performancetune.p000switch;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_ptf_setting_exp")
public final class LivePTFSettingExp {
    public static final boolean DEFAULT = false;
    public static final LivePTFSettingExp INSTANCE = new LivePTFSettingExp();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_ptf_setting_exp", DEFAULT);
    }
}
