package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C1711340udQ;
import X.C2188811AlT;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class POIcon {

    @C09CT("dark_mode_icon_url")
    public final String darkUrl;

    @C09CT("icon_url")
    public final String url;

    public POIcon() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POIcon)) {
            return false;
        }
        POIcon pOIcon = (POIcon) obj;
        return Intrinsics.LJFF(this.url, pOIcon.url) && Intrinsics.LJFF(this.darkUrl, pOIcon.darkUrl);
    }

    public final int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POIcon(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", darkUrl=");
        sbLIZ.append(this.darkUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ(Context context) {
        C1711340udQ c1711340udQ = C1711340udQ.LIZ;
        String str = this.url;
        String str2 = this.darkUrl;
        c1711340udQ.getClass();
        return C1711340udQ.LIZ(context, str, str2);
    }

    public POIcon(String str, String str2) {
        this.url = str;
        this.darkUrl = str2;
    }
}
