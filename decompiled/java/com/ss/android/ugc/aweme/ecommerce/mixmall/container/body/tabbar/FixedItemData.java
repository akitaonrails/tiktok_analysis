package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FixedItemData {

    @C09CT("dark")
    public FixedItemAsset dark;

    @C09CT("light")
    public FixedItemAsset light;

    @C09CT("schema")
    public String schema;

    public FixedItemData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedItemData)) {
            return false;
        }
        FixedItemData fixedItemData = (FixedItemData) obj;
        return Intrinsics.LJFF(this.schema, fixedItemData.schema) && Intrinsics.LJFF(this.light, fixedItemData.light) && Intrinsics.LJFF(this.dark, fixedItemData.dark);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FixedItemAsset fixedItemAsset = this.light;
        int iHashCode2 = (iHashCode + (fixedItemAsset == null ? 0 : fixedItemAsset.hashCode())) * 31;
        FixedItemAsset fixedItemAsset2 = this.dark;
        return iHashCode2 + (fixedItemAsset2 != null ? fixedItemAsset2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FixedItemData(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", light=");
        sbLIZ.append(this.light);
        sbLIZ.append(", dark=");
        sbLIZ.append(this.dark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final FixedItemAsset LIZ(boolean z) {
        FixedItemAsset fixedItemAsset;
        FixedItemAsset fixedItemAsset2;
        if (z && (fixedItemAsset2 = this.dark) != null && fixedItemAsset2.LIZ()) {
            return this.dark;
        }
        FixedItemAsset fixedItemAsset3 = this.light;
        if (fixedItemAsset3 != null && fixedItemAsset3.LIZ()) {
            return this.light;
        }
        if (z && (fixedItemAsset = this.dark) != null && fixedItemAsset.LIZ()) {
            return this.dark;
        }
        return null;
    }

    public FixedItemData(String str, FixedItemAsset fixedItemAsset, FixedItemAsset fixedItemAsset2) {
        this.schema = str;
        this.light = fixedItemAsset;
        this.dark = fixedItemAsset2;
    }
}
