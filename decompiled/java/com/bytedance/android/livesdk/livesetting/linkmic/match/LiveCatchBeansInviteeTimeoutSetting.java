package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_interact_catch_beans_invitee_timeout")
public final class LiveCatchBeansInviteeTimeoutSetting {
    public static final LiveCatchBeansInviteeTimeoutSetting INSTANCE = new LiveCatchBeansInviteeTimeoutSetting();
    public static final long DEFAULT = 30;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_interact_catch_beans_invitee_timeout", DEFAULT);
    }

    public final long getDEFAULT() {
        return DEFAULT;
    }
}
