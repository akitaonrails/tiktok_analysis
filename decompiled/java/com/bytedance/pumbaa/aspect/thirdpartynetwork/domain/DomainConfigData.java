package com.bytedance.pumbaa.aspect.thirdpartynetwork.domain;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DomainConfigData {

    @C09CT("records")
    public final List<DomainEntryJson> records;

    @C09CT("version")
    public final int version;

    public DomainConfigData() {
        this(0, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DomainConfigData)) {
            return false;
        }
        DomainConfigData domainConfigData = (DomainConfigData) obj;
        return this.version == domainConfigData.version && Intrinsics.LJFF(this.records, domainConfigData.records);
    }

    public final int hashCode() {
        return (this.version * 31) + this.records.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DomainConfigData(version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", records=");
        sbLIZ.append(this.records);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DomainConfigData(int i, List<DomainEntryJson> list) {
        this.version = i;
        this.records = list;
    }

    public DomainConfigData(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
