package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_chxmg_live_studio_audience_shield_mask")
public final class LinkMicChxmgLiveStudioAudienceShieldMask {
    public static final int DEFAULT = 1;
    public static final LinkMicChxmgLiveStudioAudienceShieldMask INSTANCE = new LinkMicChxmgLiveStudioAudienceShieldMask();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_chxmg_live_studio_audience_shield_mask", DEFAULT);
    }
}
