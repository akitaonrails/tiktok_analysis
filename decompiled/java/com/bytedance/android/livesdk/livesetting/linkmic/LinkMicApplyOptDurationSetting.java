package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_apply_opt_duration")
public final class LinkMicApplyOptDurationSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicApplyOptDurationSetting INSTANCE = new LinkMicApplyOptDurationSetting();

    public final int duration() {
        return SettingsManager.INSTANCE.getIntValue("link_mic_apply_opt_duration", DEFAULT);
    }

    public final boolean enable() {
        return duration() > 0;
    }
}
