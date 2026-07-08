package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FixedItemOnboardingShiningMode {

    @C09CT("color")
    public String color;

    public FixedItemOnboardingShiningMode() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedItemOnboardingShiningMode) && Intrinsics.LJFF(this.color, ((FixedItemOnboardingShiningMode) obj).color);
    }

    public final int hashCode() {
        String str = this.color;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FixedItemOnboardingShiningMode(color=");
        sbLIZ.append(this.color);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FixedItemOnboardingShiningMode(String str) {
        this.color = str;
    }
}
