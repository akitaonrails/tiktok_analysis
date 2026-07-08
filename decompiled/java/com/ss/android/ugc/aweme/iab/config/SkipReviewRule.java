package com.ss.android.ugc.aweme.iab.config;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SkipReviewRule {

    @C09CT("domain")
    public final List<String> domain;

    @C09CT("first_path")
    public final List<String> firstPath;

    public SkipReviewRule() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipReviewRule)) {
            return false;
        }
        SkipReviewRule skipReviewRule = (SkipReviewRule) obj;
        return Intrinsics.LJFF(this.domain, skipReviewRule.domain) && Intrinsics.LJFF(this.firstPath, skipReviewRule.firstPath);
    }

    public final int hashCode() {
        List<String> list = this.domain;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.firstPath;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkipReviewRule(domain=");
        sbLIZ.append(this.domain);
        sbLIZ.append(", firstPath=");
        sbLIZ.append(this.firstPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SkipReviewRule(List<String> list, List<String> list2) {
        this.domain = list;
        this.firstPath = list2;
    }
}
