package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_lynx_match_invitee_timeout_duration_setting")
public final class LiveLynxMatchInviteeTimeOutDurationSetting {
    public static final LiveLynxMatchInviteeTimeOutDurationSetting INSTANCE = new LiveLynxMatchInviteeTimeOutDurationSetting();
    public static final long DEFAULT = 2000;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_lynx_match_invitee_timeout_duration_setting", DEFAULT);
    }

    public final long getDEFAULT() {
        return DEFAULT;
    }
}
