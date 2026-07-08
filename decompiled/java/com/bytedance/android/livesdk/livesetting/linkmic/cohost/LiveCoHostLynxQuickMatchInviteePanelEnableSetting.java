package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_lynx_quickmatch_invitee_panel_enable")
public final class LiveCoHostLynxQuickMatchInviteePanelEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoHostLynxQuickMatchInviteePanelEnableSetting INSTANCE = new LiveCoHostLynxQuickMatchInviteePanelEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_lynx_quickmatch_invitee_panel_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
