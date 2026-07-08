package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "enable_ec_lcc")
public final class EnableEcLccSetting {
    public static final boolean DEFAULT = false;
    public static final EnableEcLccSetting INSTANCE = new EnableEcLccSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_ec_lcc", DEFAULT);
    }
}
