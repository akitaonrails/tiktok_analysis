package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_smb_industry_verification_url")
public final class PcsIndustryVerificationSchemaSetting {
    public static final String DEFAULT = "";
    public static final PcsIndustryVerificationSchemaSetting INSTANCE = new PcsIndustryVerificationSchemaSetting();
    public static JSONObject schemaMap;

    private final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_smb_industry_verification_url", DEFAULT);
    }

    private final void initConfig() {
        if (schemaMap == null) {
            JSONObject jSONObject = null;
            try {
                String value = getValue();
                if (value.length() > 0) {
                    jSONObject = new JSONObject(value);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse json error: ");
                sbLIZ.append(getValue());
                C20441214yg.LJFF("PcsIndustryVerificationSchema", C2188811AlT.LIZIZ(sbLIZ), e);
            }
            schemaMap = jSONObject;
        }
    }

    public final String getSchema(String str) {
        initConfig();
        JSONObject jSONObject = schemaMap;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString(str, null);
    }
}
