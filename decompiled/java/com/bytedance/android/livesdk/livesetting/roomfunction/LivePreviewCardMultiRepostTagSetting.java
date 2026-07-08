package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_preview_multi_repost_tag")
public final class LivePreviewCardMultiRepostTagSetting {
    public static final boolean DEFAULT = false;
    public static final LivePreviewCardMultiRepostTagSetting INSTANCE = new LivePreviewCardMultiRepostTagSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_preview_multi_repost_tag", DEFAULT);
    }
}
