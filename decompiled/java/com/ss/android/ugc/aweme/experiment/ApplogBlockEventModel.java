package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ApplogBlockEventModel {

    @C09CT("block_config")
    public final Map<String, List<String>> blockConfig;

    @C09CT("enable")
    public final boolean enable;

    public ApplogBlockEventModel() {
        this(false, C2097608Jq.LJ());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplogBlockEventModel)) {
            return false;
        }
        ApplogBlockEventModel applogBlockEventModel = (ApplogBlockEventModel) obj;
        return this.enable == applogBlockEventModel.enable && Intrinsics.LJFF(this.blockConfig, applogBlockEventModel.blockConfig);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + this.blockConfig.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplogBlockEventModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", blockConfig=");
        sbLIZ.append(this.blockConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApplogBlockEventModel(boolean z, Map<String, ? extends List<String>> map) {
        this.enable = z;
        this.blockConfig = map;
    }
}
