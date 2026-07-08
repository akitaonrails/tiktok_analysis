package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_group_go_live_opt")
public final class LinkMicGroupGoLiveOptSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicGroupGoLiveOptSetting INSTANCE = new LinkMicGroupGoLiveOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("link_mic_group_go_live_opt", DEFAULT);
    }

    public final boolean needPreview() {
        return getValue() == 1;
    }
}
