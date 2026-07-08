package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_promote_schema_preload_list")
public final class LivePromoteSchemaPreloadListSetting {
    public static final LivePromoteSchemaPreloadListSetting INSTANCE = new LivePromoteSchemaPreloadListSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_promote_schema_preload_list", DEFAULT);
    }
}
