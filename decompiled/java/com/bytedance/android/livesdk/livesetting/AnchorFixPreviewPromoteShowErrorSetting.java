package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_fix_preview_promote_show_error")
public final class AnchorFixPreviewPromoteShowErrorSetting {
    public static final int DEFAULT = 1;
    public static final AnchorFixPreviewPromoteShowErrorSetting INSTANCE = new AnchorFixPreviewPromoteShowErrorSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_fix_preview_promote_show_error", DEFAULT) == 1;
    }
}
