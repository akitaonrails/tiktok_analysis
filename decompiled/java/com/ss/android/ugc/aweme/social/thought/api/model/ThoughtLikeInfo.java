package com.ss.android.ugc.aweme.social.thought.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ThoughtLikeInfo implements Serializable {

    @C09CT("type")
    public final Integer type;

    public ThoughtLikeInfo() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThoughtLikeInfo) && Intrinsics.LJFF(this.type, ((ThoughtLikeInfo) obj).type);
    }

    public int hashCode() {
        Integer num = this.type;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThoughtLikeInfo(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ThoughtLikeInfo(Integer num) {
        this.type = num;
    }
}
