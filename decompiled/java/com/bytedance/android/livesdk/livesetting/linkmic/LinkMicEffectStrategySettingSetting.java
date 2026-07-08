package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_effect_performance_downgrading_setting")
public final class LinkMicEffectStrategySettingSetting {
    public static final String DEFAULT = "";
    public static final LinkMicEffectStrategySettingSetting INSTANCE = new LinkMicEffectStrategySettingSetting();
    public static JSONObject config;

    public final JSONObject getStrategy() {
        JSONObject jSONObject;
        if (config == null) {
            try {
                jSONObject = new JSONObject(SettingsManager.INSTANCE.getStringValue("linkmic_sdk_effect_performance_downgrading_setting", DEFAULT));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                jSONObject = null;
            }
            config = jSONObject;
        }
        return config;
    }
}
