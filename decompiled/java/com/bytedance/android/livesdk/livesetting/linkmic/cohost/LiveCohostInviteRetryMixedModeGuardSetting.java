package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_invite_retry_mixed_mode_guard")
public final class LiveCohostInviteRetryMixedModeGuardSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostInviteRetryMixedModeGuardSetting INSTANCE = new LiveCohostInviteRetryMixedModeGuardSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_invite_retry_mixed_mode_guard", DEFAULT);
    }
}
