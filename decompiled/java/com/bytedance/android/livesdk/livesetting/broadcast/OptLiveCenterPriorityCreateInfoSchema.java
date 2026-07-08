package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_center_priority_createinfo_schema")
public final class OptLiveCenterPriorityCreateInfoSchema {
    public static final boolean DEFAULT = true;
    public static final OptLiveCenterPriorityCreateInfoSchema INSTANCE = new OptLiveCenterPriorityCreateInfoSchema();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_center_priority_createinfo_schema", DEFAULT);
    }
}
