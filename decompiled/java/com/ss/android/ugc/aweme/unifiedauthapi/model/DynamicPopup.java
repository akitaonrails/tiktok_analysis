package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicPopup {

    @C09CT("dynamic_description")
    public final String dynamicDescription;

    @C09CT("dynamic_subtitle")
    public final String dynamicSubtitle;

    @C09CT("dynamic_title")
    public final String dynamicTitle;

    @C09CT("dynamic_use_fallback")
    public final boolean dynamicUseFallback;

    public DynamicPopup() {
        this(null, null, null, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicPopup)) {
            return false;
        }
        DynamicPopup dynamicPopup = (DynamicPopup) obj;
        return Intrinsics.LJFF(this.dynamicTitle, dynamicPopup.dynamicTitle) && Intrinsics.LJFF(this.dynamicDescription, dynamicPopup.dynamicDescription) && Intrinsics.LJFF(this.dynamicSubtitle, dynamicPopup.dynamicSubtitle) && this.dynamicUseFallback == dynamicPopup.dynamicUseFallback;
    }

    public final int hashCode() {
        String str = this.dynamicTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dynamicDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dynamicSubtitle;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.dynamicUseFallback);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicPopup(dynamicTitle=");
        sbLIZ.append(this.dynamicTitle);
        sbLIZ.append(", dynamicDescription=");
        sbLIZ.append(this.dynamicDescription);
        sbLIZ.append(", dynamicSubtitle=");
        sbLIZ.append(this.dynamicSubtitle);
        sbLIZ.append(", dynamicUseFallback=");
        sbLIZ.append(this.dynamicUseFallback);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DynamicPopup(String str, String str2, String str3, boolean z) {
        this.dynamicTitle = str;
        this.dynamicDescription = str2;
        this.dynamicSubtitle = str3;
        this.dynamicUseFallback = z;
    }
}
