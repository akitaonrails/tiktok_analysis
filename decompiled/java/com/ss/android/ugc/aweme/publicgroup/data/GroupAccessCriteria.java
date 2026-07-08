package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC1229300i5w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GroupAccessCriteria {

    @C09CT("access_criteria_type")
    public final int accessCriteriaType;

    @C09CT("description")
    public final String description;

    @C09CT("key")
    public final String key;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupAccessCriteria)) {
            return false;
        }
        GroupAccessCriteria groupAccessCriteria = (GroupAccessCriteria) obj;
        return this.accessCriteriaType == groupAccessCriteria.accessCriteriaType && Intrinsics.LJFF(this.key, groupAccessCriteria.key) && Intrinsics.LJFF(this.description, groupAccessCriteria.description);
    }

    public final int hashCode() {
        return (((this.accessCriteriaType * 31) + this.key.hashCode()) * 31) + this.description.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupAccessCriteria(accessCriteriaType=");
        sbLIZ.append(this.accessCriteriaType);
        sbLIZ.append(", key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupAccessCriteria() {
        this(EnumC1229300i5w.GROUP_ACCESS_CRITERIA_TYPE_UNKNOWN.getValue(), "", "");
    }

    public GroupAccessCriteria(int i, String str, String str2) {
        this.accessCriteriaType = i;
        this.key = str;
        this.description = str2;
    }
}
