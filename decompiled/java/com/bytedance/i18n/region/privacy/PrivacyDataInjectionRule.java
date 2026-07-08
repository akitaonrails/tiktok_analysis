package com.bytedance.i18n.region.privacy;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivacyDataInjectionRule {
    public final List<String> LIZ;

    @C09CT("domain_exclude_list")
    public final List<String> domainExcludeList;

    @C09CT("domain_include_list")
    public final List<String> domainIncludeList;

    @C09CT("path_exclude_list")
    public final List<String> pathExcludeList;

    @C09CT("path_include_list")
    public final List<String> pathIncludeList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyDataInjectionRule)) {
            return false;
        }
        PrivacyDataInjectionRule privacyDataInjectionRule = (PrivacyDataInjectionRule) obj;
        return Intrinsics.LJFF(this.LIZ, privacyDataInjectionRule.LIZ) && Intrinsics.LJFF(this.pathIncludeList, privacyDataInjectionRule.pathIncludeList) && Intrinsics.LJFF(this.pathExcludeList, privacyDataInjectionRule.pathExcludeList) && Intrinsics.LJFF(this.domainIncludeList, privacyDataInjectionRule.domainIncludeList) && Intrinsics.LJFF(this.domainExcludeList, privacyDataInjectionRule.domainExcludeList);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.pathIncludeList.hashCode()) * 31) + this.pathExcludeList.hashCode()) * 31) + this.domainIncludeList.hashCode()) * 31) + this.domainExcludeList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataInjectionRule(keys=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pathIncludeList=");
        sbLIZ.append(this.pathIncludeList);
        sbLIZ.append(", pathExcludeList=");
        sbLIZ.append(this.pathExcludeList);
        sbLIZ.append(", domainIncludeList=");
        sbLIZ.append(this.domainIncludeList);
        sbLIZ.append(", domainExcludeList=");
        sbLIZ.append(this.domainExcludeList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyDataInjectionRule(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.LIZ = list;
        this.pathIncludeList = list2;
        this.pathExcludeList = list3;
        this.domainIncludeList = list4;
        this.domainExcludeList = list5;
    }

    public PrivacyDataInjectionRule(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4, (i & 16) != 0 ? C13BV.INSTANCE : list5);
    }
}
