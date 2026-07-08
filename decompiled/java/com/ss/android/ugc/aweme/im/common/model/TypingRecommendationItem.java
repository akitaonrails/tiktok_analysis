package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TypingRecommendationItem implements Serializable {

    @C09CT("ic_id")
    public final Long typingRecommendationAlgoEtId;

    public TypingRecommendationItem() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TypingRecommendationItem) && Intrinsics.LJFF(this.typingRecommendationAlgoEtId, ((TypingRecommendationItem) obj).typingRecommendationAlgoEtId);
    }

    public int hashCode() {
        Long l = this.typingRecommendationAlgoEtId;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TypingRecommendationItem(typingRecommendationAlgoEtId=");
        sbLIZ.append(this.typingRecommendationAlgoEtId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TypingRecommendationItem(Long l) {
        this.typingRecommendationAlgoEtId = l;
    }
}
