package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ModifyConfig {

    @C09CT("modify_conf")
    public final ModifyConf modifyConf;

    @C09CT("name")
    public final String name;

    @C09CT("range_conf")
    public final RangeConf rangeConf;

    public ModifyConfig() {
        this("", new RangeConf(null, null, null, null, 15, null), new ModifyConf(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModifyConfig)) {
            return false;
        }
        ModifyConfig modifyConfig = (ModifyConfig) obj;
        return Intrinsics.LJFF(this.name, modifyConfig.name) && Intrinsics.LJFF(this.rangeConf, modifyConfig.rangeConf) && Intrinsics.LJFF(this.modifyConf, modifyConfig.modifyConf);
    }

    public final int hashCode() {
        return (((this.name.hashCode() * 31) + this.rangeConf.hashCode()) * 31) + this.modifyConf.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModifyConfig(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", rangeConf=");
        sbLIZ.append(this.rangeConf);
        sbLIZ.append(", modifyConf=");
        sbLIZ.append(this.modifyConf);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ModifyConfig(String str, RangeConf rangeConf, ModifyConf modifyConf) {
        this.name = str;
        this.rangeConf = rangeConf;
        this.modifyConf = modifyConf;
    }
}
