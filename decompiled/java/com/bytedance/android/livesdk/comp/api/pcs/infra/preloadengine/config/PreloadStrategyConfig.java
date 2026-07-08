package com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PreloadStrategyConfig {
    public static final TypeAdapter ADAPTER = new PreloadStrategyConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("disabled")
    public Boolean disable;

    @C09CT("is_sync")
    public Boolean isSync;

    @C09CT("precheck_key")
    public String preCheckKey;

    @C09CT("preload_action")
    public PreloadActionConfig preloadAction;

    @C09CT("report_sampling_rate")
    public int reportSamplingRate;

    @C09CT("skip_strategy")
    public Boolean skipStrategy;

    @C09CT("strategy_config")
    public String strategyConfig;

    @C09CT("strategy_key")
    public String strategyKey;

    public PreloadStrategyConfig() {
        this("", "", Boolean.FALSE, Boolean.FALSE, "", Boolean.FALSE, null, 100);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("strategy_key=");
        sbLIZ.append(this.strategyKey);
        sbLIZ.append(" action=");
        sbLIZ.append(this.preloadAction);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreloadStrategyConfig(String str, String str2, Boolean bool, Boolean bool2, String str3, Boolean bool3, PreloadActionConfig preloadActionConfig, int i) {
        this.strategyKey = str;
        this.strategyConfig = str2;
        this.isSync = bool;
        this.disable = bool2;
        this.preCheckKey = str3;
        this.skipStrategy = bool3;
        this.preloadAction = preloadActionConfig;
        this.reportSamplingRate = i;
    }
}
