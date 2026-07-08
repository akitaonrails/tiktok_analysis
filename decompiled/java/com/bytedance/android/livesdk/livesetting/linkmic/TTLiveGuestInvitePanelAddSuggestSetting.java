package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_guest_invite_panel_add_suggest")
public final class TTLiveGuestInvitePanelAddSuggestSetting {
    public static final boolean DEFAULT = false;
    public static final TTLiveGuestInvitePanelAddSuggestSetting INSTANCE = new TTLiveGuestInvitePanelAddSuggestSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_guest_invite_panel_add_suggest", DEFAULT);
    }
}
