package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_invite_panel_fallback_fix")
public final class CohostInvitePanelFallbackFixSetting {
    public static final boolean DEFAULT = true;
    public static final CohostInvitePanelFallbackFixSetting INSTANCE = new CohostInvitePanelFallbackFixSetting();

    public static final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_invite_panel_fallback_fix", DEFAULT);
    }
}
