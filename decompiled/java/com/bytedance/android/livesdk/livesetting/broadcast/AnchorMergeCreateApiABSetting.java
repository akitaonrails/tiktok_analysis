package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_merge_create_api")
public final class AnchorMergeCreateApiABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorMergeCreateApiABSetting INSTANCE = new AnchorMergeCreateApiABSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_merge_create_api", DEFAULT) == 1;
    }
}
