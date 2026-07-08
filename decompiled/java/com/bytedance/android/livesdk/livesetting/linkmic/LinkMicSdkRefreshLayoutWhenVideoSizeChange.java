package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_refresh_layout_when_video_size_change")
public final class LinkMicSdkRefreshLayoutWhenVideoSizeChange {
    public static final boolean DEFAULT = true;
    public static final LinkMicSdkRefreshLayoutWhenVideoSizeChange INSTANCE = new LinkMicSdkRefreshLayoutWhenVideoSizeChange();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_refresh_layout_when_video_size_change", DEFAULT);
    }
}
