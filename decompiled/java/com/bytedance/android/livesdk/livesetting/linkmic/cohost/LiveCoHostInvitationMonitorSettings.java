package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_enable_cohost_invitation_monitor")
public final class LiveCoHostInvitationMonitorSettings {
    public static final int DEFAULT = 3;
    public static final LiveCoHostInvitationMonitorSettings INSTANCE = new LiveCoHostInvitationMonitorSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_enable_cohost_invitation_monitor", DEFAULT) > 0;
    }

    public final boolean isEnableWithBind() {
        return (SettingsManager.INSTANCE.getIntValue("live_enable_cohost_invitation_monitor", DEFAULT) & 1) == 1;
    }

    public final boolean isEnableWithInflate() {
        return (SettingsManager.INSTANCE.getIntValue("live_enable_cohost_invitation_monitor", DEFAULT) & 2) == 2;
    }
}
