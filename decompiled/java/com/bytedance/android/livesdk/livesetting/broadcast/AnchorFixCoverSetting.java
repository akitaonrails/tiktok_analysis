package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_fix_cover")
public final class AnchorFixCoverSetting {
    public static final int DEFAULT = 1;
    public static final AnchorFixCoverSetting INSTANCE = new AnchorFixCoverSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_fix_cover", DEFAULT) == 1;
    }
}
