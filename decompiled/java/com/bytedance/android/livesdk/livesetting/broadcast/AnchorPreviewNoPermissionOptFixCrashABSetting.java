package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_preview_no_permission_opt_fix_crash")
public final class AnchorPreviewNoPermissionOptFixCrashABSetting {
    public static final int DEFAULT = 1;
    public static final AnchorPreviewNoPermissionOptFixCrashABSetting INSTANCE = new AnchorPreviewNoPermissionOptFixCrashABSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_preview_no_permission_opt_fix_crash", DEFAULT) == 1;
    }
}
