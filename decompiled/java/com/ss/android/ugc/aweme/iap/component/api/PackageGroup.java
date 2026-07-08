package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PackageGroup {

    @C09CT("highlight")
    public final Highlight highlight;

    @C09CT("packages")
    public final List<UnifiedPackage> packages;

    @C09CT("type")
    public final Integer type;

    public PackageGroup() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageGroup)) {
            return false;
        }
        PackageGroup packageGroup = (PackageGroup) obj;
        return Intrinsics.LJFF(this.type, packageGroup.type) && Intrinsics.LJFF(this.highlight, packageGroup.highlight) && Intrinsics.LJFF(this.packages, packageGroup.packages);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Highlight highlight = this.highlight;
        return ((iHashCode + (highlight != null ? highlight.hashCode() : 0)) * 31) + this.packages.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PackageGroup(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", highlight=");
        sbLIZ.append(this.highlight);
        sbLIZ.append(", packages=");
        sbLIZ.append(this.packages);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PackageGroup(Integer num, Highlight highlight, List<UnifiedPackage> list) {
        this.type = num;
        this.highlight = highlight;
        this.packages = list;
    }

    public PackageGroup(Integer num, Highlight highlight, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : highlight, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
