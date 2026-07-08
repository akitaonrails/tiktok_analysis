package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C20441214yg;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.media.ttlhadaptive.gear.config.TTLHGearAdaptiveConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@SettingsKey("ttlive_game_android_gear_adaptive_config")
public final class TTLHAndroidGameGearAdaptiveConfig {
    public static boolean enableGameGearAdaptive;
    public static TTLHGearAdaptiveConfig gearSelectConfig;
    public static final TTLHAndroidGameGearAdaptiveConfig INSTANCE = new TTLHAndroidGameGearAdaptiveConfig();
    public static final String DEFAULT = "{}";

    public final boolean enableGameGearAdaptive() {
        if (enableGameGearAdaptive) {
            return true;
        }
        parseGearAdaptiveConfig();
        return enableGameGearAdaptive;
    }

    public final TTLHGearAdaptiveConfig getGearSelectConfig() {
        TTLHGearAdaptiveConfig tTLHGearAdaptiveConfig = gearSelectConfig;
        if (tTLHGearAdaptiveConfig != null) {
            return tTLHGearAdaptiveConfig;
        }
        parseGearAdaptiveConfig();
        return gearSelectConfig;
    }

    public final String value() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_game_android_gear_adaptive_config", DEFAULT);
    }

    private final void parseGearAdaptiveConfig() {
        String strJ3;
        try {
            JSONObject jSONObject = new JSONObject(value());
            enableGameGearAdaptive = JSONObjectProtectorUtils.getBoolean(jSONObject, "enable_game_gear_adaptive");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ttlh_gear_adaptive_config");
            if (jSONObjectOptJSONObject == null || (strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject)) == null) {
                strJ3 = "";
            }
            gearSelectConfig = (TTLHGearAdaptiveConfig) GsonProtectorUtils.fromJson(new Gson(), strJ3, TTLHGearAdaptiveConfig.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enableGameGearAdaptive parse exception: ");
            sbLIZ.append(e);
            C20441214yg.LJ("TTLHAndroidGameGearAdaptiveConfig", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
