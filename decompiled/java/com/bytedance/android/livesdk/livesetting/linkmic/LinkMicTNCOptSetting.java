package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_optimize_for_tnc_request")
public final class LinkMicTNCOptSetting {
    public static final LinkMicTNCOptSetting INSTANCE = new LinkMicTNCOptSetting();
    public static final TNCRequestConf DEFAULT = new TNCRequestConf(false, 200);

    public final TNCRequestConf getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        TNCRequestConf tNCRequestConf = DEFAULT;
        TNCRequestConf tNCRequestConf2 = (TNCRequestConf) settingsManager.getValueSafely("linkmic_optimize_for_tnc_request", tNCRequestConf);
        return tNCRequestConf2 != null ? tNCRequestConf2 : tNCRequestConf;
    }
}
