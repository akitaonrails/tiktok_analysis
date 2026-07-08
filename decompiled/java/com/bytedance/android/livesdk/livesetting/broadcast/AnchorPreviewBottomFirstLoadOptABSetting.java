package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_preview_bottom_first_load_opt")
public final class AnchorPreviewBottomFirstLoadOptABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorPreviewBottomFirstLoadOptABSetting INSTANCE = new AnchorPreviewBottomFirstLoadOptABSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_preview_bottom_first_load_opt", DEFAULT) == 1;
    }
}
