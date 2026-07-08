package com.bytedance.android.livesdk.media.ttlhadaptive.gear.config;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategyNodeConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHGearAdaptiveConfig {

    @C09CT("strategies_data")
    public Map<String, StrategyNodeConfig> strategyData;

    @C09CT("gear_adaptive_base_config")
    public GearStrategySettingConfig strategySettingConfig;

    public final boolean LIZ() {
        GearStrategySettingConfig gearStrategySettingConfig = this.strategySettingConfig;
        return gearStrategySettingConfig != null && gearStrategySettingConfig.enableStarShip == 1;
    }

    public final boolean LIZIZ() {
        GearStrategySettingConfig gearStrategySettingConfig = this.strategySettingConfig;
        return gearStrategySettingConfig != null && gearStrategySettingConfig.enableStarShipEngine == 1;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHAdaptiveConfig{strategySettingConfig=");
        sbLIZ.append(this.strategySettingConfig);
        sbLIZ.append(", strategyGraph=");
        sbLIZ.append(this.strategyData);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
