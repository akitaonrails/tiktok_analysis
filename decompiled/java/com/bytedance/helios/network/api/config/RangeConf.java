package com.bytedance.helios.network.api.config;

import X.C08CX;
import X.C09CT;
import X.C2188811AlT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class RangeConf {

    @C09CT("domains")
    public final DomainRange domains;

    @C09CT("paths")
    public final PathRange paths;

    @C09CT("schemes")
    public final Set<String> schemes;

    @C09CT("targets")
    public final Set<Integer> targets;

    public RangeConf() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RangeConf)) {
            return false;
        }
        RangeConf rangeConf = (RangeConf) obj;
        return Intrinsics.LJFF(this.targets, rangeConf.targets) && Intrinsics.LJFF(this.schemes, rangeConf.schemes) && Intrinsics.LJFF(this.domains, rangeConf.domains) && Intrinsics.LJFF(this.paths, rangeConf.paths);
    }

    public final int hashCode() {
        return (((((this.targets.hashCode() * 31) + this.schemes.hashCode()) * 31) + this.domains.hashCode()) * 31) + this.paths.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RangeConf(targets=");
        sbLIZ.append(this.targets);
        sbLIZ.append(", schemes=");
        sbLIZ.append(this.schemes);
        sbLIZ.append(", domains=");
        sbLIZ.append(this.domains);
        sbLIZ.append(", paths=");
        sbLIZ.append(this.paths);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RangeConf(Set<Integer> set, Set<String> set2, DomainRange domainRange, PathRange pathRange) {
        this.targets = set;
        this.schemes = set2;
        this.domains = domainRange;
        this.paths = pathRange;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x012f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.network.api.config.RangeConf.LIZ(int, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public RangeConf(Set set, Set set2, DomainRange domainRange, PathRange pathRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2, (i & 4) != 0 ? new DomainRange(null, null, null, null, null, 31, null) : domainRange, (i & 8) != 0 ? new PathRange(null, null, null, null, 15, null) : pathRange);
    }
}
