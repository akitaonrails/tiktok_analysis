package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FixedItemOnboardingShiningStyle {

    @C09CT("dark")
    public FixedItemOnboardingShiningMode dark;

    @C09CT("light")
    public FixedItemOnboardingShiningMode light;

    public FixedItemOnboardingShiningStyle() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedItemOnboardingShiningStyle)) {
            return false;
        }
        FixedItemOnboardingShiningStyle fixedItemOnboardingShiningStyle = (FixedItemOnboardingShiningStyle) obj;
        return Intrinsics.LJFF(this.light, fixedItemOnboardingShiningStyle.light) && Intrinsics.LJFF(this.dark, fixedItemOnboardingShiningStyle.dark);
    }

    public final int hashCode() {
        FixedItemOnboardingShiningMode fixedItemOnboardingShiningMode = this.light;
        int iHashCode = (fixedItemOnboardingShiningMode == null ? 0 : fixedItemOnboardingShiningMode.hashCode()) * 31;
        FixedItemOnboardingShiningMode fixedItemOnboardingShiningMode2 = this.dark;
        return iHashCode + (fixedItemOnboardingShiningMode2 != null ? fixedItemOnboardingShiningMode2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FixedItemOnboardingShiningStyle(light=");
        sbLIZ.append(this.light);
        sbLIZ.append(", dark=");
        sbLIZ.append(this.dark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FixedItemOnboardingShiningStyle(FixedItemOnboardingShiningMode fixedItemOnboardingShiningMode, FixedItemOnboardingShiningMode fixedItemOnboardingShiningMode2) {
        this.light = fixedItemOnboardingShiningMode;
        this.dark = fixedItemOnboardingShiningMode2;
    }
}
