package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class POFormAutoFillAddress {

    @C09CT("display_subtitle")
    public final String displaySubtitle;

    @C09CT("display_title")
    public final String displayTitle;

    @C09CT("sub_element_auto_fill")
    public final Map<String, String> subElementAutoFill;

    public POFormAutoFillAddress() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POFormAutoFillAddress)) {
            return false;
        }
        POFormAutoFillAddress pOFormAutoFillAddress = (POFormAutoFillAddress) obj;
        return Intrinsics.LJFF(this.displayTitle, pOFormAutoFillAddress.displayTitle) && Intrinsics.LJFF(this.displaySubtitle, pOFormAutoFillAddress.displaySubtitle) && Intrinsics.LJFF(this.subElementAutoFill, pOFormAutoFillAddress.subElementAutoFill);
    }

    public final int hashCode() {
        String str = this.displayTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displaySubtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.subElementAutoFill;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POFormAutoFillAddress(displayTitle=");
        sbLIZ.append(this.displayTitle);
        sbLIZ.append(", displaySubtitle=");
        sbLIZ.append(this.displaySubtitle);
        sbLIZ.append(", subElementAutoFill=");
        sbLIZ.append(this.subElementAutoFill);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public POFormAutoFillAddress(String str, String str2, Map<String, String> map) {
        this.displayTitle = str;
        this.displaySubtitle = str2;
        this.subElementAutoFill = map;
    }
}
