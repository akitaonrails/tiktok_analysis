package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_auto_invite_jsbridge")
public final class LiveCoHostAutoInviteJSBridgeSetting {
    public static final LiveCoHostAutoInviteJSBridgeSetting INSTANCE = new LiveCoHostAutoInviteJSBridgeSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_auto_invite_jsbridge", DEFAULT);
    }
}
