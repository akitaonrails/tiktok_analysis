package com.ss.android.ugc.aweme.ecommerce.preloader.model;

import X.AbstractC1931807hU;
import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ECPreloadEventData extends AbstractC1931807hU {

    @C09CT("name")
    public final String name;

    @C09CT("param")
    public final n param;

    public ECPreloadEventData() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECPreloadEventData)) {
            return false;
        }
        ECPreloadEventData eCPreloadEventData = (ECPreloadEventData) obj;
        return Intrinsics.LJFF(this.name, eCPreloadEventData.name) && Intrinsics.LJFF(this.param, eCPreloadEventData.param);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        n nVar = this.param;
        return iHashCode + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECPreloadEventData(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", param=");
        sbLIZ.append(this.param);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ECPreloadEventData(String str, n nVar) {
        this.name = str;
        this.param = nVar;
    }
}
