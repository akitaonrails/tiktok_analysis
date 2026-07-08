package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_fix_preview_all_button_disappear")
public final class AnchorFixPreviewAllButtonDisappearABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorFixPreviewAllButtonDisappearABSetting INSTANCE = new AnchorFixPreviewAllButtonDisappearABSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_fix_preview_all_button_disappear", DEFAULT) == 1;
    }
}
