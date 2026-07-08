package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AIGCMeta implements Serializable {

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("title")
    public final String title;

    public AIGCMeta() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCMeta)) {
            return false;
        }
        AIGCMeta aIGCMeta = (AIGCMeta) obj;
        return Intrinsics.LJFF(this.title, aIGCMeta.title) && Intrinsics.LJFF(this.subTitle, aIGCMeta.subTitle);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCMeta(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCMeta(String str, String str2) {
        this.title = str;
        this.subTitle = str2;
    }
}
