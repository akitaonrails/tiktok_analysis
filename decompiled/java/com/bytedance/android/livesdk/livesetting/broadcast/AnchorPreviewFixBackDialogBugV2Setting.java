package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_preview_fix_back_dialog_bug_v2")
public final class AnchorPreviewFixBackDialogBugV2Setting {
    public static final int DEFAULT = 1;
    public static final AnchorPreviewFixBackDialogBugV2Setting INSTANCE = new AnchorPreviewFixBackDialogBugV2Setting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_preview_fix_back_dialog_bug_v2", DEFAULT) == 1;
    }
}
