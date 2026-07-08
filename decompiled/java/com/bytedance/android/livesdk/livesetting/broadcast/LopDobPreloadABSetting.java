package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = true, value = "lop_pns_fe_preload_ab")
public final class LopDobPreloadABSetting {
    public static final int DEFAULT = 0;
    public static final LopDobPreloadABSetting INSTANCE = new LopDobPreloadABSetting();

    public final boolean isLibOne() {
        return SettingsManager.INSTANCE.getIntValue("lop_pns_fe_preload_ab", DEFAULT) == 1;
    }

    public final boolean isLibTwo() {
        return SettingsManager.INSTANCE.getIntValue("lop_pns_fe_preload_ab", DEFAULT) == 2;
    }
}
