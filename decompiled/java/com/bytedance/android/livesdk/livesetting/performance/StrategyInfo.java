package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class StrategyInfo {
    public static final TypeAdapter ADAPTER = new StrategyInfo_OptTypeAdapter(NormalGson.singleton());

    @C09CT("downgrade_metrics_score")
    public List<Metrics2BizMapping> downgradeMetricsStrategy;

    @C09CT("upgrade_metrics_score")
    public List<Metrics2BizMapping> upgradeMetricsStrategy;

    public StrategyInfo() {
        C13BV c13bv = C13BV.INSTANCE;
        this.upgradeMetricsStrategy = c13bv;
        this.downgradeMetricsStrategy = c13bv;
    }
}
