package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_allow_invite_with_apply")
public final class LiveCoHostAllowInviteWithApplySetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoHostAllowInviteWithApplySetting INSTANCE = new LiveCoHostAllowInviteWithApplySetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_allow_invite_with_apply", DEFAULT);
    }
}
