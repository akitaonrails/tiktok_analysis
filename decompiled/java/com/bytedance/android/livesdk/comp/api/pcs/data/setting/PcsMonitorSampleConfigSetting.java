package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "subscribe_monitor_sample_config")
public final class PcsMonitorSampleConfigSetting {
    public static final String DEFAULT = "";
    public static final PcsMonitorSampleConfigSetting INSTANCE = new PcsMonitorSampleConfigSetting();
    public static JSONObject configMap;

    private final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("subscribe_monitor_sample_config", DEFAULT);
    }

    private final void initConfig() {
        JSONObject jSONObject;
        if (configMap == null) {
            try {
                jSONObject = new JSONObject(getValue());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse json object error ");
                sbLIZ.append(getValue());
                C20441214yg.LJFF("PcsMonitorSampleConfigSetting", C2188811AlT.LIZIZ(sbLIZ), e);
                jSONObject = null;
            }
            configMap = jSONObject;
        }
    }

    public final double getSampleConfig(String str, double d) {
        initConfig();
        JSONObject jSONObject = configMap;
        if (jSONObject != null) {
            return jSONObject.optDouble(str, 1.0d);
        }
        return d;
    }
}
