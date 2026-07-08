package com.ss.android.ugc.aweme.explore.lynx;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExploreLynxTopComment {

    @C09CT("digg_count")
    public final Long diggCount;

    @C09CT("text")
    public final String text;

    @C09CT("user_name")
    public final String userName;

    public ExploreLynxTopComment() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreLynxTopComment)) {
            return false;
        }
        ExploreLynxTopComment exploreLynxTopComment = (ExploreLynxTopComment) obj;
        return Intrinsics.LJFF(this.userName, exploreLynxTopComment.userName) && Intrinsics.LJFF(this.text, exploreLynxTopComment.text) && Intrinsics.LJFF(this.diggCount, exploreLynxTopComment.diggCount);
    }

    public final int hashCode() {
        String str = this.userName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.diggCount;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreLynxTopComment(userName=");
        sbLIZ.append(this.userName);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", diggCount=");
        sbLIZ.append(this.diggCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreLynxTopComment(String str, String str2, Long l) {
        this.userName = str;
        this.text = str2;
        this.diggCount = l;
    }
}
