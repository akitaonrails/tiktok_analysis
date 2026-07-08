package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_cleaner_record_max_size")
public final class LiveHostCleanerRecordMaxSize {
    public static final LiveHostCleanerRecordMaxSize INSTANCE = new LiveHostCleanerRecordMaxSize();
    public static final int DEFAULT = 100;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_broadcast_cleaner_record_max_size", 100);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final int getValue() {
        return value;
    }
}
