package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class FuseConfig {

    @C09CT("fuse_conf")
    public final FuseConf fuseConf;

    @C09CT("name")
    public final String name;

    @C09CT("range_conf")
    public final RangeConf rangeConf;

    public FuseConfig() {
        this("", new RangeConf(null, null, null, null, 15, null), new FuseConf(410, "this api is not allow"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FuseConfig)) {
            return false;
        }
        FuseConfig fuseConfig = (FuseConfig) obj;
        return Intrinsics.LJFF(this.name, fuseConfig.name) && Intrinsics.LJFF(this.rangeConf, fuseConfig.rangeConf) && Intrinsics.LJFF(this.fuseConf, fuseConfig.fuseConf);
    }

    public final int hashCode() {
        return (((this.name.hashCode() * 31) + this.rangeConf.hashCode()) * 31) + this.fuseConf.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FuseConfig(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", rangeConf=");
        sbLIZ.append(this.rangeConf);
        sbLIZ.append(", fuseConf=");
        sbLIZ.append(this.fuseConf);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FuseConfig(String str, RangeConf rangeConf, FuseConf fuseConf) {
        this.name = str;
        this.rangeConf = rangeConf;
        this.fuseConf = fuseConf;
    }
}
