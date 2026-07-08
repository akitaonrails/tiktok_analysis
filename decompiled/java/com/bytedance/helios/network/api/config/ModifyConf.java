package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ModifyConf {

    @C09CT("domain")
    public final Map<String, String> domain;

    @C09CT("path")
    public final Map<String, String> path;

    @C09CT("scheme")
    public final Map<String, String> scheme;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModifyConf)) {
            return false;
        }
        ModifyConf modifyConf = (ModifyConf) obj;
        return Intrinsics.LJFF(this.scheme, modifyConf.scheme) && Intrinsics.LJFF(this.domain, modifyConf.domain) && Intrinsics.LJFF(this.path, modifyConf.path);
    }

    public final int hashCode() {
        return (((this.scheme.hashCode() * 31) + this.domain.hashCode()) * 31) + this.path.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModifyConf(scheme=");
        sbLIZ.append(this.scheme);
        sbLIZ.append(", domain=");
        sbLIZ.append(this.domain);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ModifyConf() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public ModifyConf(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        this.scheme = map;
        this.domain = map2;
        this.path = map3;
    }
}
