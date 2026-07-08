package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "live_all_suspend_api_support_pb")
public final class LiveAllSuspendApiSupportPbSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAllSuspendApiSupportPbSetting INSTANCE = new LiveAllSuspendApiSupportPbSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_all_suspend_api_support_pb", DEFAULT);
    }
}
