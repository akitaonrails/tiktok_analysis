package com.bytedance.android.livesdk.livesetting.subscription;

import X.C510400Jzy;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("subscription_all_api_monitor_sampling_dic")
public final class ApiMonitorSamplingRateDic {
    public static final double defaultRatio = 0.0d;
    public static C510400Jzy ratioMap;
    public static final ApiMonitorSamplingRateDic INSTANCE = new ApiMonitorSamplingRateDic();
    public static final String DEFAULT = "";

    public final JSONObject getJsonValue() {
        return new JSONObject(SettingsManager.INSTANCE.getStringValue("subscription_all_api_monitor_sampling_dic", DEFAULT));
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }

    public final double getValue(String str) {
        if (ratioMap == null) {
            ratioMap = new C510400Jzy(SettingsManager.INSTANCE.getStringValue("subscription_all_api_monitor_sampling_dic", DEFAULT));
        }
        C510400Jzy c510400Jzy = ratioMap;
        if (c510400Jzy == null) {
            return defaultRatio;
        }
        if (str.length() == 0) {
            return c510400Jzy.LIZIZ;
        }
        return c510400Jzy.LIZ.optDouble(str, defaultRatio);
    }
}
