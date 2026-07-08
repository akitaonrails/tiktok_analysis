package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_cohost_split_dsl_params")
public final class CoHostRtcAllowedSetting {
    public static final boolean DEFAULT = false;
    public static final CoHostRtcAllowedSetting INSTANCE = new CoHostRtcAllowedSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_cohost_split_dsl_params", DEFAULT);
    }
}
