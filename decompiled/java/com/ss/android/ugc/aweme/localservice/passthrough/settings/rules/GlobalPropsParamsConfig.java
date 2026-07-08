package com.ss.android.ugc.aweme.localservice.passthrough.settings.rules;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GlobalPropsParamsConfig {

    @C09CT("global_props_params")
    public final GlobalPropsParamRules globalPropsRules;

    public GlobalPropsParamsConfig() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GlobalPropsParamsConfig) && Intrinsics.LJFF(this.globalPropsRules, ((GlobalPropsParamsConfig) obj).globalPropsRules);
    }

    public final int hashCode() {
        GlobalPropsParamRules globalPropsParamRules = this.globalPropsRules;
        if (globalPropsParamRules == null) {
            return 0;
        }
        return globalPropsParamRules.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalPropsParamsConfig(globalPropsRules=");
        sbLIZ.append(this.globalPropsRules);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GlobalPropsParamsConfig(GlobalPropsParamRules globalPropsParamRules) {
        this.globalPropsRules = globalPropsParamRules;
    }
}
