package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_audience_mute_alert_audience_role")
public final class LiveUserInfoMuteUIAudienceOpt {
    public static final boolean DEFAULT = false;
    public static final LiveUserInfoMuteUIAudienceOpt INSTANCE = new LiveUserInfoMuteUIAudienceOpt();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_audience_mute_alert_audience_role", DEFAULT);
    }
}
