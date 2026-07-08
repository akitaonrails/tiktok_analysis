package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_audience_permit_bg_sync_status")
public final class LinkMicAudiencePermitBgSyncStatus {
    public static final boolean DEFAULT = false;
    public static final LinkMicAudiencePermitBgSyncStatus INSTANCE = new LinkMicAudiencePermitBgSyncStatus();

    public final boolean isOn() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_audience_permit_bg_sync_status", DEFAULT);
    }
}
