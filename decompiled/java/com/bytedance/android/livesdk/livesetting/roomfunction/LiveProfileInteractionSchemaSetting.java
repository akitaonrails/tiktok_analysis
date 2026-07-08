package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_audience_interact_detail_preview_schema")
public final class LiveProfileInteractionSchemaSetting {
    public static final String DEFAULT = "";
    public static final LiveProfileInteractionSchemaSetting INSTANCE = new LiveProfileInteractionSchemaSetting();

    public final String get() {
        return SettingsManager.INSTANCE.getStringValue("live_audience_interact_detail_preview_schema", DEFAULT);
    }
}
