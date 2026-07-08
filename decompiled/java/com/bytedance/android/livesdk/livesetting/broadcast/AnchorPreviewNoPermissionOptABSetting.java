package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_preview_no_permission_opt")
public final class AnchorPreviewNoPermissionOptABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorPreviewNoPermissionOptABSetting INSTANCE = new AnchorPreviewNoPermissionOptABSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_preview_no_permission_opt", DEFAULT) == 1;
    }
}
