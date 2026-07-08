package com.ss.android.ugc.aweme.wavepublish.utils.mapper;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StrategyConfig {

    @C09CT("name")
    public final String name;

    @C09CT("params")
    public final Map<String, Double> params;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyConfig)) {
            return false;
        }
        StrategyConfig strategyConfig = (StrategyConfig) obj;
        return Intrinsics.LJFF(this.name, strategyConfig.name) && Intrinsics.LJFF(this.params, strategyConfig.params);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.params.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyConfig(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StrategyConfig() {
        this("catch", C2097608Jq.LJ());
    }

    public StrategyConfig(String str, Map<String, Double> map) {
        this.name = str;
        this.params = map;
    }
}
