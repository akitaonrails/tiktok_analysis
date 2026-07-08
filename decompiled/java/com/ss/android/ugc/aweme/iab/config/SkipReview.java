package com.ss.android.ugc.aweme.iab.config;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SkipReview {

    @C09CT("rules")
    public final List<SkipReviewRule> rules;

    public SkipReview() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SkipReview) && Intrinsics.LJFF(this.rules, ((SkipReview) obj).rules);
    }

    public final int hashCode() {
        List<SkipReviewRule> list = this.rules;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkipReview(rules=");
        sbLIZ.append(this.rules);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SkipReview(List<SkipReviewRule> list) {
        this.rules = list;
    }
}
