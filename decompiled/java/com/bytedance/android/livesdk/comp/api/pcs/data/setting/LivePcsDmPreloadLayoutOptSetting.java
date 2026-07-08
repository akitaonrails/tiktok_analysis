package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_dm_preload_layout_opt")
public final class LivePcsDmPreloadLayoutOptSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsDmPreloadLayoutOptSetting INSTANCE = new LivePcsDmPreloadLayoutOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_dm_preload_layout_opt", DEFAULT);
    }
}
