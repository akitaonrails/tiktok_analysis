package com.bytedance.android.livesdk.media.ttlhadaptive.engine;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class StrategyNodeConfig {

    @C09CT("b_data")
    public String b_data;

    @C09CT("enable_skipped_if_nil")
    public int enableSkippedIfNil = 1;

    @C09CT("name")
    public String name;

    @C09CT("paths")
    public List<String> paths;

    @C09CT("strategy_key")
    public String strategyKey;

    @C09CT("type")
    public int type;

    @C09CT("version_label")
    public String versionLabel;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyNodeConfig{name='");
        sbLIZ.append(this.name);
        sbLIZ.append('\'');
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", paths=");
        sbLIZ.append(this.paths);
        sbLIZ.append(", versionLabel='");
        sbLIZ.append(this.versionLabel);
        sbLIZ.append('\'');
        sbLIZ.append(", strategyKey='");
        sbLIZ.append(this.strategyKey);
        sbLIZ.append('\'');
        sbLIZ.append(", enableSkippedIfNil='");
        sbLIZ.append(this.enableSkippedIfNil);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
