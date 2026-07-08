package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "schema_activity_black_list")
public final class SchemaActivityBlackListSetting {
    public static final SchemaActivityBlackListSetting INSTANCE = new SchemaActivityBlackListSetting();
    public static final String[] DEFAULT = {"DeepLinkActivityV2", "FastbotActivity", "DeeplinkAuthorizedActivity", "KidsDeepLinkHandlerActivity"};

    public final String[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String[] strArr = DEFAULT;
        String[] stringArrayValue = settingsManager.getStringArrayValue("schema_activity_black_list", strArr);
        return stringArrayValue.length != 0 ? stringArrayValue : strArr;
    }
}
