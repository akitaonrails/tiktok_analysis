package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PackageInfo {

    @C09CT("default_selection")
    public final DefaultSelection defaultSelection;

    @C09CT("package_groups")
    public final List<PackageGroup> packageGroups;

    @C09CT("product_type")
    public final Integer productType;

    public PackageInfo() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageInfo)) {
            return false;
        }
        PackageInfo packageInfo = (PackageInfo) obj;
        return Intrinsics.LJFF(this.productType, packageInfo.productType) && Intrinsics.LJFF(this.packageGroups, packageInfo.packageGroups) && Intrinsics.LJFF(this.defaultSelection, packageInfo.defaultSelection);
    }

    public final int hashCode() {
        Integer num = this.productType;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.packageGroups.hashCode()) * 31;
        DefaultSelection defaultSelection = this.defaultSelection;
        return iHashCode + (defaultSelection != null ? defaultSelection.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PackageInfo(productType=");
        sbLIZ.append(this.productType);
        sbLIZ.append(", packageGroups=");
        sbLIZ.append(this.packageGroups);
        sbLIZ.append(", defaultSelection=");
        sbLIZ.append(this.defaultSelection);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PackageInfo(Integer num, List<PackageGroup> list, DefaultSelection defaultSelection) {
        this.productType = num;
        this.packageGroups = list;
        this.defaultSelection = defaultSelection;
    }

    public PackageInfo(Integer num, List list, DefaultSelection defaultSelection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : defaultSelection);
    }
}
