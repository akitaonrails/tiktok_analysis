package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_conflict_enable_for_invite_setting")
public final class LiveCoHostConflictEnableForInviteSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCoHostConflictEnableForInviteSetting INSTANCE = new LiveCoHostConflictEnableForInviteSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_conflict_enable_for_invite_setting", DEFAULT);
    }
}
