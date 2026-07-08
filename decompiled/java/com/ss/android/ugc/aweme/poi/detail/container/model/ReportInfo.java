package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ReportInfo implements Serializable {

    @C09CT("need_show")
    public final Boolean needShow;

    @C09CT("params")
    public final String params;

    public ReportInfo() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportInfo)) {
            return false;
        }
        ReportInfo reportInfo = (ReportInfo) obj;
        return Intrinsics.LJFF(this.needShow, reportInfo.needShow) && Intrinsics.LJFF(this.params, reportInfo.params);
    }

    public int hashCode() {
        Boolean bool = this.needShow;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.params;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportInfo(needShow=");
        sbLIZ.append(this.needShow);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReportInfo(Boolean bool, String str) {
        this.needShow = bool;
        this.params = str;
    }
}
