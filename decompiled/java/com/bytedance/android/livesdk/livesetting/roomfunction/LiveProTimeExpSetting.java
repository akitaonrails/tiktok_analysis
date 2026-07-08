package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pro_time_exp")
public final class LiveProTimeExpSetting {
    public static final int DEFAULT = 0;
    public static final LiveProTimeExpSetting INSTANCE = new LiveProTimeExpSetting();
    public static final int V2 = 1;
    public static final int V3 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pro_time_exp", DEFAULT);
    }
}
