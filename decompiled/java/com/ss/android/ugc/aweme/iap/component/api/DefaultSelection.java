package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultSelection {

    @C09CT("option_id")
    public final String optionId;

    @C09CT("package_id")
    public final String packageId;

    public DefaultSelection() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultSelection)) {
            return false;
        }
        DefaultSelection defaultSelection = (DefaultSelection) obj;
        return Intrinsics.LJFF(this.packageId, defaultSelection.packageId) && Intrinsics.LJFF(this.optionId, defaultSelection.optionId);
    }

    public final int hashCode() {
        String str = this.packageId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.optionId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultSelection(packageId=");
        sbLIZ.append(this.packageId);
        sbLIZ.append(", optionId=");
        sbLIZ.append(this.optionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DefaultSelection(String str, String str2) {
        this.packageId = str;
        this.optionId = str2;
    }
}
