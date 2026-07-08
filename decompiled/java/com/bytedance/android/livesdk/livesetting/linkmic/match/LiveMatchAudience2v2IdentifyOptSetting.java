package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_enable_2v2_change_poc_identify_opt")
public final class LiveMatchAudience2v2IdentifyOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchAudience2v2IdentifyOptSetting INSTANCE = new LiveMatchAudience2v2IdentifyOptSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_2v2_change_poc_identify_opt", DEFAULT);
    }
}
