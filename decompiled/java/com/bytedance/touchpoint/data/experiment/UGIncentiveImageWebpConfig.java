package com.bytedance.touchpoint.data.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UGIncentiveImageWebpConfig {

    @C09CT("hosts")
    public final List<String> hosts;

    @C09CT("pattern_regex")
    public final String patternRegex;

    public UGIncentiveImageWebpConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UGIncentiveImageWebpConfig)) {
            return false;
        }
        UGIncentiveImageWebpConfig uGIncentiveImageWebpConfig = (UGIncentiveImageWebpConfig) obj;
        return Intrinsics.LJFF(this.hosts, uGIncentiveImageWebpConfig.hosts) && Intrinsics.LJFF(this.patternRegex, uGIncentiveImageWebpConfig.patternRegex);
    }

    public final int hashCode() {
        List<String> list = this.hosts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.patternRegex;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UGIncentiveImageWebpConfig(hosts=");
        sbLIZ.append(this.hosts);
        sbLIZ.append(", patternRegex=");
        sbLIZ.append(this.patternRegex);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UGIncentiveImageWebpConfig(List<String> list, String str) {
        this.hosts = list;
        this.patternRegex = str;
    }
}
