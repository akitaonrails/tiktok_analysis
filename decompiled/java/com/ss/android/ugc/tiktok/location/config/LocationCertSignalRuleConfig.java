package com.ss.android.ugc.tiktok.location.config;

import X.C09CT;
import X.C1153410g7X;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationCertSignalRuleConfig {

    @C09CT("exclude")
    public final List<String> exclude;

    @C09CT("include")
    public final List<String> include;

    public LocationCertSignalRuleConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationCertSignalRuleConfig)) {
            return false;
        }
        LocationCertSignalRuleConfig locationCertSignalRuleConfig = (LocationCertSignalRuleConfig) obj;
        return Intrinsics.LJFF(this.include, locationCertSignalRuleConfig.include) && Intrinsics.LJFF(this.exclude, locationCertSignalRuleConfig.exclude);
    }

    public final int hashCode() {
        List<String> list = this.include;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.exclude;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationCertSignalRuleConfig(include=");
        sbLIZ.append(this.include);
        sbLIZ.append(", exclude=");
        sbLIZ.append(this.exclude);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1153410g7X LIZ() {
        List list = this.include;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        List list2 = this.exclude;
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        return new C1153410g7X(list, list2);
    }

    public LocationCertSignalRuleConfig(List<String> list, List<String> list2) {
        this.include = list;
        this.exclude = list2;
    }
}
