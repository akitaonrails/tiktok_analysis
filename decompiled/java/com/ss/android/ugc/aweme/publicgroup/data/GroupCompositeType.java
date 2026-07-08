package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC1219960hqs;
import X.EnumC1228990i5R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupCompositeType {

    @C09CT("group_business_type")
    public final int businessType;

    @C09CT("group_category")
    public final String groupCategory;

    @C09CT("group_type")
    public final String groupType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupCompositeType)) {
            return false;
        }
        GroupCompositeType groupCompositeType = (GroupCompositeType) obj;
        return Intrinsics.LJFF(this.groupCategory, groupCompositeType.groupCategory) && Intrinsics.LJFF(this.groupType, groupCompositeType.groupType) && this.businessType == groupCompositeType.businessType;
    }

    public final int hashCode() {
        int iHashCode = this.groupCategory.hashCode() * 31;
        String str = this.groupType;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.businessType;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupCompositeType(groupCategory=");
        sbLIZ.append(this.groupCategory);
        sbLIZ.append(", groupType=");
        sbLIZ.append(this.groupType);
        sbLIZ.append(", businessType=");
        sbLIZ.append(this.businessType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GroupCompositeType() {
        this(EnumC1228990i5R.PUBLIC_GROUP.getValue(), "", EnumC1219960hqs.UNKNOWN.getValue());
    }

    public GroupCompositeType(String str, String str2, int i) {
        this.groupCategory = str;
        this.groupType = str2;
        this.businessType = i;
    }
}
