package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_opt_ntp_setting")
public final class LiveMatchOptNtpSettings {
    public static final LiveMatchOptNtpSettings INSTANCE = new LiveMatchOptNtpSettings();
    public static final LiveMatchOptNtpParams DEFAULT = new LiveMatchOptNtpParams(1, 21600000);

    private final LiveMatchOptNtpParams getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchOptNtpParams liveMatchOptNtpParams = DEFAULT;
        LiveMatchOptNtpParams liveMatchOptNtpParams2 = (LiveMatchOptNtpParams) settingsManager.getValueSafely("live_match_opt_ntp_setting", liveMatchOptNtpParams);
        return liveMatchOptNtpParams2 != null ? liveMatchOptNtpParams2 : liveMatchOptNtpParams;
    }

    public final boolean enable() {
        return getValue().enable == 1;
    }

    public final long maxUpdateNetInterval() {
        return getValue().maxUpdateNetInterval;
    }

    public final LiveMatchOptNtpParams getDEFAULT() {
        return DEFAULT;
    }
}
