package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CameoAssetInfo {

    @C09CT("cameo_id")
    public final String cameoId;

    public CameoAssetInfo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CameoAssetInfo) && Intrinsics.LJFF(this.cameoId, ((CameoAssetInfo) obj).cameoId);
    }

    public final int hashCode() {
        String str = this.cameoId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameoAssetInfo(cameoId=");
        sbLIZ.append(this.cameoId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CameoAssetInfo(String str) {
        this.cameoId = str;
    }
}
