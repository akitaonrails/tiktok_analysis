package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_cleaner_record_forbid")
public final class LiveHostCleanerRecordForbid {
    public static final LiveHostCleanerRecordForbid INSTANCE = new LiveHostCleanerRecordForbid();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_broadcast_cleaner_record_forbid", DEFAULT);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final boolean getValue() {
        return value;
    }
}
