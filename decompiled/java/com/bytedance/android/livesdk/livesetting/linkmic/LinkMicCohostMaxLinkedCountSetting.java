package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_cohost_max_linked_count")
public final class LinkMicCohostMaxLinkedCountSetting {
    public static final int DEFAULT = 4;
    public static final LinkMicCohostMaxLinkedCountSetting INSTANCE = new LinkMicCohostMaxLinkedCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_cohost_max_linked_count", DEFAULT);
    }
}
