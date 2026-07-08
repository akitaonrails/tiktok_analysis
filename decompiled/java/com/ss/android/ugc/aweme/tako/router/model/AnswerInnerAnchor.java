package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AnswerInnerAnchor implements Serializable {
    public static final int $stable = 0;

    @C09CT("anchor_key")
    public final String anchorKey;

    @C09CT("type")
    public final String type;

    public AnswerInnerAnchor() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnswerInnerAnchor)) {
            return false;
        }
        AnswerInnerAnchor answerInnerAnchor = (AnswerInnerAnchor) obj;
        return Intrinsics.LJFF(this.type, answerInnerAnchor.type) && Intrinsics.LJFF(this.anchorKey, answerInnerAnchor.anchorKey);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.anchorKey;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnswerInnerAnchor(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", anchorKey=");
        sbLIZ.append(this.anchorKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnswerInnerAnchor(String str, String str2) {
        this.type = str;
        this.anchorKey = str2;
    }
}
