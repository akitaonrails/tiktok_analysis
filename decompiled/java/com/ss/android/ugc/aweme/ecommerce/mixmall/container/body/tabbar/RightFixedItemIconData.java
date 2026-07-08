package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RightFixedItemIconData {

    @C09CT("dark")
    public FixedItemAsset dark;

    @C09CT("light")
    public FixedItemAsset light;

    public RightFixedItemIconData() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RightFixedItemIconData)) {
            return false;
        }
        RightFixedItemIconData rightFixedItemIconData = (RightFixedItemIconData) obj;
        return Intrinsics.LJFF(this.light, rightFixedItemIconData.light) && Intrinsics.LJFF(this.dark, rightFixedItemIconData.dark);
    }

    public final int hashCode() {
        FixedItemAsset fixedItemAsset = this.light;
        int iHashCode = (fixedItemAsset == null ? 0 : fixedItemAsset.hashCode()) * 31;
        FixedItemAsset fixedItemAsset2 = this.dark;
        return iHashCode + (fixedItemAsset2 != null ? fixedItemAsset2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RightFixedItemIconData(light=");
        sbLIZ.append(this.light);
        sbLIZ.append(", dark=");
        sbLIZ.append(this.dark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RightFixedItemIconData(FixedItemAsset fixedItemAsset, FixedItemAsset fixedItemAsset2) {
        this.light = fixedItemAsset;
        this.dark = fixedItemAsset2;
    }
}
