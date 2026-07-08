package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ActionNodeConfig {

    @C09CT("action_name")
    public final String actionName;

    @C09CT("async")
    public final Boolean async;

    @C09CT("extra_inputs")
    public final String extraInputs;

    public ActionNodeConfig() {
        this(Boolean.FALSE, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionNodeConfig)) {
            return false;
        }
        ActionNodeConfig actionNodeConfig = (ActionNodeConfig) obj;
        return Intrinsics.LJFF(this.async, actionNodeConfig.async) && Intrinsics.LJFF(this.actionName, actionNodeConfig.actionName) && Intrinsics.LJFF(this.extraInputs, actionNodeConfig.extraInputs);
    }

    public final int hashCode() {
        Boolean bool = this.async;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.actionName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.extraInputs;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionNodeConfig(async=");
        sbLIZ.append(this.async);
        sbLIZ.append(", actionName=");
        sbLIZ.append(this.actionName);
        sbLIZ.append(", extraInputs=");
        sbLIZ.append(this.extraInputs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ActionNodeConfig(Boolean bool, String str, String str2) {
        this.async = bool;
        this.actionName = str;
        this.extraInputs = str2;
    }
}
