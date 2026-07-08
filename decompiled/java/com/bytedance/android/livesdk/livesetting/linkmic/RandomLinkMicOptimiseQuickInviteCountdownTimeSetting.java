package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("quick_pair_invite_timeout")
public final class RandomLinkMicOptimiseQuickInviteCountdownTimeSetting {
    public static final RandomLinkMicOptimiseQuickInviteCountdownTimeSetting INSTANCE = new RandomLinkMicOptimiseQuickInviteCountdownTimeSetting();
    public static final int DEFAULT = 15;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("quick_pair_invite_timeout", DEFAULT);
    }
}
