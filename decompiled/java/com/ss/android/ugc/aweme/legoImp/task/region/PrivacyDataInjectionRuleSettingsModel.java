package com.ss.android.ugc.aweme.legoImp.task.region;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivacyDataInjectionRuleSettingsModel {

    @C09CT("domain_exclude_list")
    public final List<String> domainExcludeList;

    @C09CT("domain_include_list")
    public final List<String> domainIncludeList;

    @C09CT("keys")
    public final List<String> keys;

    @C09CT("path_exclude_list")
    public final List<String> pathExcludeList;

    @C09CT("path_include_list")
    public final List<String> pathIncludeList;

    public PrivacyDataInjectionRuleSettingsModel() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyDataInjectionRuleSettingsModel)) {
            return false;
        }
        PrivacyDataInjectionRuleSettingsModel privacyDataInjectionRuleSettingsModel = (PrivacyDataInjectionRuleSettingsModel) obj;
        return Intrinsics.LJFF(this.keys, privacyDataInjectionRuleSettingsModel.keys) && Intrinsics.LJFF(this.pathIncludeList, privacyDataInjectionRuleSettingsModel.pathIncludeList) && Intrinsics.LJFF(this.pathExcludeList, privacyDataInjectionRuleSettingsModel.pathExcludeList) && Intrinsics.LJFF(this.domainIncludeList, privacyDataInjectionRuleSettingsModel.domainIncludeList) && Intrinsics.LJFF(this.domainExcludeList, privacyDataInjectionRuleSettingsModel.domainExcludeList);
    }

    public final int hashCode() {
        return (((((((this.keys.hashCode() * 31) + this.pathIncludeList.hashCode()) * 31) + this.pathExcludeList.hashCode()) * 31) + this.domainIncludeList.hashCode()) * 31) + this.domainExcludeList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataInjectionRuleSettingsModel(keys=");
        sbLIZ.append(this.keys);
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

    public PrivacyDataInjectionRuleSettingsModel(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.keys = list;
        this.pathIncludeList = list2;
        this.pathExcludeList = list3;
        this.domainIncludeList = list4;
        this.domainExcludeList = list5;
    }

    public PrivacyDataInjectionRuleSettingsModel(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4, (i & 16) != 0 ? C13BV.INSTANCE : list5);
    }
}
