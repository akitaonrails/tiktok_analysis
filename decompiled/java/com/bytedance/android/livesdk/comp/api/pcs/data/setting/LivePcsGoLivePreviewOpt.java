package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_go_live_preview_opt")
public final class LivePcsGoLivePreviewOpt {
    public static final int DEFAULT = 0;
    public static final LivePcsGoLivePreviewOpt INSTANCE = new LivePcsGoLivePreviewOpt();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_go_live_preview_opt", DEFAULT);
    }

    public final boolean isEnabled() {
        return getValue() == 1;
    }
}
