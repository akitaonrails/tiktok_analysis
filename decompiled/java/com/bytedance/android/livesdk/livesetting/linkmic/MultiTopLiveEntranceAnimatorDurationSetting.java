package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_entrance_animator_duration")
public final class MultiTopLiveEntranceAnimatorDurationSetting {
    public static final long DEFAULT = 800;
    public static final MultiTopLiveEntranceAnimatorDurationSetting INSTANCE = new MultiTopLiveEntranceAnimatorDurationSetting();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("multi_top_live_entrance_animator_duration", DEFAULT);
    }
}
