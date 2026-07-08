package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_file_monitor_sample")
public final class LiveFileMonitorSampleSetting {
    public static final LiveFileMonitorSampleSetting INSTANCE = new LiveFileMonitorSampleSetting();
    public static final JSONObject DEFAULT = new JSONObject();

    private final JSONObject getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        JSONObject jSONObject = DEFAULT;
        JSONObject jSONObject2 = (JSONObject) settingsManager.getValueSafely("live_file_monitor_sample", jSONObject);
        return jSONObject2 != null ? jSONObject2 : jSONObject;
    }

    public final int getSampleRate(String str) {
        JSONObject settingValue = getSettingValue();
        if (settingValue == null) {
            return -1;
        }
        return settingValue.optInt(str, -1);
    }
}
