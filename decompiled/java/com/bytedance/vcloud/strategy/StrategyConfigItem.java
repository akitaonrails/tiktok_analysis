package com.bytedance.vcloud.strategy;

import X.C2188811AlT;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class StrategyConfigItem {
    public static int LIVE_BANDWIDTH_ESTIMATOR_STRATEGY = 27;
    public static int LIVE_PROBE_STARTUP_BITRATE = 21;
    public boolean mEnable;
    public String mName;
    public JSONObject mStrategyInputParams;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyItem{name='");
        sbLIZ.append(this.mName);
        sbLIZ.append('\'');
        sbLIZ.append(", enable=");
        sbLIZ.append(this.mEnable);
        sbLIZ.append(", StrategyInputParams=");
        sbLIZ.append(this.mStrategyInputParams);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean isEnabled() {
        return this.mEnable;
    }

    public static StrategyConfigItem from(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        StrategyConfigItem strategyConfigItem = new StrategyConfigItem();
        strategyConfigItem.mName = jSONObject.optString("Name");
        boolean z = false;
        if (jSONObject.optInt("Enable", 0) == 1) {
            z = true;
        }
        strategyConfigItem.mEnable = z;
        strategyConfigItem.mStrategyInputParams = jSONObject.optJSONObject("StrategyInputParams");
        return strategyConfigItem;
    }
}
