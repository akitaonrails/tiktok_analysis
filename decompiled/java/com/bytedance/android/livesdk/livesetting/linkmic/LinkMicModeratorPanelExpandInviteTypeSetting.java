package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "mg_moderator_manage_panel_expand_invite_type")
public final class LinkMicModeratorPanelExpandInviteTypeSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicModeratorPanelExpandInviteTypeSetting INSTANCE = new LinkMicModeratorPanelExpandInviteTypeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("mg_moderator_manage_panel_expand_invite_type", DEFAULT);
    }
}
