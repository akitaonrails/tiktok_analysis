package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_spot_id_continuous_bugfix")
public final class CoHostSpotIdContinuousBugfix {
    public static final boolean DEFAULT = true;
    public static final CoHostSpotIdContinuousBugfix INSTANCE = new CoHostSpotIdContinuousBugfix();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_spot_id_continuous_bugfix", DEFAULT);
    }
}
