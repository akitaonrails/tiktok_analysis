package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCIcon {

    @C09CT("dark_icon_url")
    public String darkIconUrl;

    @C09CT("light_icon_url")
    public String lightIconUrl;

    public CCDCIcon() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CCDCIcon)) {
            return false;
        }
        CCDCIcon cCDCIcon = (CCDCIcon) obj;
        return Intrinsics.LJFF(this.darkIconUrl, cCDCIcon.darkIconUrl) && Intrinsics.LJFF(this.lightIconUrl, cCDCIcon.lightIconUrl);
    }

    public final int hashCode() {
        String str = this.darkIconUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lightIconUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCDCIcon(darkIconUrl=");
        sbLIZ.append(this.darkIconUrl);
        sbLIZ.append(", lightIconUrl=");
        sbLIZ.append(this.lightIconUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CCDCIcon(String str, String str2) {
        this.darkIconUrl = str;
        this.lightIconUrl = str2;
    }
}
