package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_invitee_scheme")
public final class LiveCoHostLynxTwoMatchInviteePanelUrlSetting {
    public static final LiveCoHostLynxTwoMatchInviteePanelUrlSetting INSTANCE = new LiveCoHostLynxTwoMatchInviteePanelUrlSetting();
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=match_invitee_url";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_match_invitee_scheme", DEFAULT);
    }
}
