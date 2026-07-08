package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "mg_moderator_manage_invite_capability_fusion")
public final class LinkMicModeratorInviteCapabilitySetting {
    public static final LinkMicModeratorInviteCapabilitySetting INSTANCE = new LinkMicModeratorInviteCapabilitySetting();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("mg_moderator_manage_invite_capability_fusion", DEFAULT);
    }
}
