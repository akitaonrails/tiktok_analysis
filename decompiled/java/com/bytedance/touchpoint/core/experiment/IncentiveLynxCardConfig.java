package com.bytedance.touchpoint.core.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class IncentiveLynxCardConfig {

    @C09CT("enable_opt_err")
    public final boolean enableOptErr;

    @C09CT("enable_opt_lynx_card")
    public final boolean enableOptLynxFB;

    @C09CT("whitelist_for_ignore_error_code")
    public final List<Integer> incentiveLynxCardConfig;

    public IncentiveLynxCardConfig() {
        this(false, false, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncentiveLynxCardConfig)) {
            return false;
        }
        IncentiveLynxCardConfig incentiveLynxCardConfig = (IncentiveLynxCardConfig) obj;
        return this.enableOptErr == incentiveLynxCardConfig.enableOptErr && this.enableOptLynxFB == incentiveLynxCardConfig.enableOptLynxFB && Intrinsics.LJFF(this.incentiveLynxCardConfig, incentiveLynxCardConfig.incentiveLynxCardConfig);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.enableOptErr) * 31) + C786410Ut5.Z2(this.enableOptLynxFB)) * 31) + this.incentiveLynxCardConfig.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IncentiveLynxCardConfig(enableOptErr=");
        sbLIZ.append(this.enableOptErr);
        sbLIZ.append(", enableOptLynxFB=");
        sbLIZ.append(this.enableOptLynxFB);
        sbLIZ.append(", incentiveLynxCardConfig=");
        sbLIZ.append(this.incentiveLynxCardConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IncentiveLynxCardConfig(boolean z, boolean z2, List<Integer> list) {
        this.enableOptErr = z;
        this.enableOptLynxFB = z2;
        this.incentiveLynxCardConfig = list;
    }

    public IncentiveLynxCardConfig(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? Collections.singletonList(301) : list);
    }
}
