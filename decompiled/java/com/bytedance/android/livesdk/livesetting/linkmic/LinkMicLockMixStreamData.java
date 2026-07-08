package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_lock_mix_stream_data")
public final class LinkMicLockMixStreamData {
    public static final boolean DEFAULT = true;
    public static final LinkMicLockMixStreamData INSTANCE = new LinkMicLockMixStreamData();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_lock_mix_stream_data", DEFAULT);
    }
}
