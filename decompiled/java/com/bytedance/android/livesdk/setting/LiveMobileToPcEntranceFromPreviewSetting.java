package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_mobile_to_pc_entrance_from_preview")
public final class LiveMobileToPcEntranceFromPreviewSetting {
    public static final LiveMobileToPcEntranceFromPreviewSetting INSTANCE = new LiveMobileToPcEntranceFromPreviewSetting();
    public static final String[] DEFAULT = {"homepage_hot-live_cell", "homepage_follow-live_cell", "homepage_friends-live_cell"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_mobile_to_pc_entrance_from_preview", DEFAULT);
    }
}
