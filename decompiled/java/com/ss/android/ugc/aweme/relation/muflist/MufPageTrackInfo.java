package com.ss.android.ugc.aweme.relation.muflist;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class MufPageTrackInfo implements Serializable {

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("previous_page")
    public final String previousPage;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MufPageTrackInfo)) {
            return false;
        }
        MufPageTrackInfo mufPageTrackInfo = (MufPageTrackInfo) obj;
        return Intrinsics.LJFF(this.enterFrom, mufPageTrackInfo.enterFrom) && Intrinsics.LJFF(this.previousPage, mufPageTrackInfo.previousPage);
    }

    public int hashCode() {
        return (this.enterFrom.hashCode() * 31) + this.previousPage.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MufPageTrackInfo(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.previousPage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MufPageTrackInfo() {
        this("", "");
    }

    public MufPageTrackInfo(String str, String str2) {
        this.enterFrom = str;
        this.previousPage = str2;
    }
}
