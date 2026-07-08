package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("end_live_schema")
public final class OptEndLiveSchema {
    public static final String DEFAULT = "";
    public static final OptEndLiveSchema INSTANCE = new OptEndLiveSchema();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("end_live_schema", DEFAULT);
    }
}
