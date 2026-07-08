package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PaidContentReviewSection implements Serializable {

    @C09CT("collection_id")
    public final long collectionId;

    @C09CT("reviews")
    public final List<Object> reviews;

    public PaidContentReviewSection() {
        this(null, 0L, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidContentReviewSection)) {
            return false;
        }
        PaidContentReviewSection paidContentReviewSection = (PaidContentReviewSection) obj;
        return Intrinsics.LJFF(this.reviews, paidContentReviewSection.reviews) && this.collectionId == paidContentReviewSection.collectionId;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidContentReviewSection(reviews=");
        sbLIZ.append(this.reviews);
        sbLIZ.append(", collectionId=");
        sbLIZ.append(this.collectionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaidContentReviewSection(List<Object> list, long j) {
        this.reviews = list;
        this.collectionId = j;
    }

    public PaidContentReviewSection(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : j);
    }
}
