package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("mt_live_schema_force_use_deep_link_list_android")
public final class LiveSchemaForceUseDeepLinkSetting {
    public static final LiveSchemaForceUseDeepLinkSetting INSTANCE = new LiveSchemaForceUseDeepLinkSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("mt_live_schema_force_use_deep_link_list_android", DEFAULT);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
