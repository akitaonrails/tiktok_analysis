package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_audience_permit_bg_timeout")
public final class LinkMicAudiencePermitBgTimeoutSetting {
    public static final int DEFAULT = 30;
    public static final LinkMicAudiencePermitBgTimeoutSetting INSTANCE = new LinkMicAudiencePermitBgTimeoutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("link_mic_audience_permit_bg_timeout", DEFAULT);
    }
}
