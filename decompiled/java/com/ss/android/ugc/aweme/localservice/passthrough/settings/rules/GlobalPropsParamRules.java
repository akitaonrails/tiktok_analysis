package com.ss.android.ugc.aweme.localservice.passthrough.settings.rules;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GlobalPropsParamRules {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("rules")
    public final List<GlobalPropsParamsConfigRule> rules;

    public GlobalPropsParamRules() {
        this(false, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalPropsParamRules)) {
            return false;
        }
        GlobalPropsParamRules globalPropsParamRules = (GlobalPropsParamRules) obj;
        return this.enable == globalPropsParamRules.enable && Intrinsics.LJFF(this.rules, globalPropsParamRules.rules);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + this.rules.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalPropsParamRules(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", rules=");
        sbLIZ.append(this.rules);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GlobalPropsParamRules(boolean z, List<GlobalPropsParamsConfigRule> list) {
        this.enable = z;
        this.rules = list;
    }

    public GlobalPropsParamRules(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
