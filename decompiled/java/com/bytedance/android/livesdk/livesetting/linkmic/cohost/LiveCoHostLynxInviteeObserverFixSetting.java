package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_lynx_invitee_observer_fix_enable")
public final class LiveCoHostLynxInviteeObserverFixSetting {
    public static final LiveCoHostLynxInviteeObserverFixSetting INSTANCE = new LiveCoHostLynxInviteeObserverFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_lynx_invitee_observer_fix_enable", DEFAULT);
    }

    public final boolean isEnabled() {
        return getValue();
    }
}
