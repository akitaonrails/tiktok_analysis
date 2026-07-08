package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_join_rtc_failed_not_add_token")
public final class LinkMicJoinRtcFailedNotAddToken {
    public static final boolean DEFAULT = true;
    public static final LinkMicJoinRtcFailedNotAddToken INSTANCE = new LinkMicJoinRtcFailedNotAddToken();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_join_rtc_failed_not_add_token", DEFAULT);
    }
}
