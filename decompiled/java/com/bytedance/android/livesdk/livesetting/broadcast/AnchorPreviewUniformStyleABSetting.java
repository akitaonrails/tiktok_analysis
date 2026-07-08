package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_preview_uniform_style")
public final class AnchorPreviewUniformStyleABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorPreviewUniformStyleABSetting INSTANCE = new AnchorPreviewUniformStyleABSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_preview_uniform_style", DEFAULT) == 1;
    }
}
