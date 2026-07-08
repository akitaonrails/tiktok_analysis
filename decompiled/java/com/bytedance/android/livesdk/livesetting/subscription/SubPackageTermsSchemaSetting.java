package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_user_pay_terms")
public final class SubPackageTermsSchemaSetting {
    public static final SubPackageTermsSchemaSetting INSTANCE = new SubPackageTermsSchemaSetting();
    public static final HashMap<String, String> DEFAULT = new HashMap<>();

    public final Map<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        HashMap<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("live_subscription_user_pay_terms", map);
        return map2 != null ? map2 : map;
    }

    public final String getSchema(String str) {
        String str2 = getValue().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
