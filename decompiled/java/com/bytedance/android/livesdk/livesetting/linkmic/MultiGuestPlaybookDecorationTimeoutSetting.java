package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "playbook_decoration_time_out_duration")
public final class MultiGuestPlaybookDecorationTimeoutSetting {
    public static final long DEFAULT = 5000;
    public static final MultiGuestPlaybookDecorationTimeoutSetting INSTANCE = new MultiGuestPlaybookDecorationTimeoutSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("playbook_decoration_time_out_duration", DEFAULT);
    }
}
