package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FixedItemOnboardingData {

    @C09CT("title")
    public String title;

    public FixedItemOnboardingData() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedItemOnboardingData) && Intrinsics.LJFF(this.title, ((FixedItemOnboardingData) obj).title);
    }

    public final int hashCode() {
        String str = this.title;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FixedItemOnboardingData(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FixedItemOnboardingData(String str) {
        this.title = str;
    }
}
