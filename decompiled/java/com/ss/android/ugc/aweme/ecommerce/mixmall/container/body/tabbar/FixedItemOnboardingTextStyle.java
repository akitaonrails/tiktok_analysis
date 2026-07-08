package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class FixedItemOnboardingTextStyle {

    @C09CT("dark")
    public ItemStyle dark;

    @C09CT("light")
    public ItemStyle light;

    public FixedItemOnboardingTextStyle() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedItemOnboardingTextStyle)) {
            return false;
        }
        FixedItemOnboardingTextStyle fixedItemOnboardingTextStyle = (FixedItemOnboardingTextStyle) obj;
        return Intrinsics.LJFF(this.light, fixedItemOnboardingTextStyle.light) && Intrinsics.LJFF(this.dark, fixedItemOnboardingTextStyle.dark);
    }

    public final int hashCode() {
        ItemStyle itemStyle = this.light;
        int iHashCode = (itemStyle == null ? 0 : itemStyle.hashCode()) * 31;
        ItemStyle itemStyle2 = this.dark;
        return iHashCode + (itemStyle2 != null ? itemStyle2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FixedItemOnboardingTextStyle(light=");
        sbLIZ.append(this.light);
        sbLIZ.append(", dark=");
        sbLIZ.append(this.dark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FixedItemOnboardingTextStyle(ItemStyle itemStyle, ItemStyle itemStyle2) {
        this.light = itemStyle;
        this.dark = itemStyle2;
    }
}
