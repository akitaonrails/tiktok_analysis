package com.bytedance.android.livesdk.media.ttlhadaptive;

import X.C09CT;
import X.C2188811AlT;
import android.content.Context;
import com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategyNodeConfig;
import com.bytedance.android.livesdk.media.ttlhadaptive.engine.StrategySettingConfig;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHAdaptiveConfig {
    public Context LIZ;
    public IStarShipStrategy LIZIZ;

    @C09CT("strategies_dependency_graph")
    public Map<String, StrategyNodeConfig> strategyGraph;

    @C09CT("adaptive_base_config")
    public StrategySettingConfig strategySettingConfig;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHAdaptiveConfig{strategySettingConfig=");
        sbLIZ.append(this.strategySettingConfig);
        sbLIZ.append(", strategyGraph=");
        sbLIZ.append(this.strategyGraph);
        sbLIZ.append(", appCtx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
