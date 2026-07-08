package com.bytedance.pumbaa.aspect.thirdpartynetwork.domain;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class DomainEntryJson {

    @C09CT("domain_type")
    public final String domainType;

    @C09CT("suffix")
    public final String suffix;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DomainEntryJson)) {
            return false;
        }
        DomainEntryJson domainEntryJson = (DomainEntryJson) obj;
        return Intrinsics.LJFF(this.suffix, domainEntryJson.suffix) && Intrinsics.LJFF(this.domainType, domainEntryJson.domainType);
    }

    public final int hashCode() {
        return (this.suffix.hashCode() * 31) + this.domainType.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DomainEntryJson(suffix=");
        sbLIZ.append(this.suffix);
        sbLIZ.append(", domainType=");
        sbLIZ.append(this.domainType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DomainEntryJson() {
        this("", "");
    }

    public DomainEntryJson(String str, String str2) {
        this.suffix = str;
        this.domainType = str2;
    }
}
