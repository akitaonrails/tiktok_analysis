package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SupplementReview implements Serializable {

    @C09CT("review_keywords")
    public final List<String> reviewKeywords;

    @C09CT("reviews")
    public final List<SupplementReviewItem> reviews;

    @C09CT("reviews_count")
    public final Integer reviewsCount;

    @C09CT("star")
    public final Double star;

    @C09CT("star_str")
    public final String starStr;

    @C09CT("summary")
    public final String summary;

    public SupplementReview() {
        this(null, null, null, null, null, null);
    }

    public final SupplementReview copy(Double d, String str, Integer num, String str2, List<String> list, List<SupplementReviewItem> list2) {
        return new SupplementReview(d, str, num, str2, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupplementReview)) {
            return false;
        }
        SupplementReview supplementReview = (SupplementReview) obj;
        return Intrinsics.LJFF(this.star, supplementReview.star) && Intrinsics.LJFF(this.starStr, supplementReview.starStr) && Intrinsics.LJFF(this.reviewsCount, supplementReview.reviewsCount) && Intrinsics.LJFF(this.summary, supplementReview.summary) && Intrinsics.LJFF(this.reviewKeywords, supplementReview.reviewKeywords) && Intrinsics.LJFF(this.reviews, supplementReview.reviews);
    }

    public int hashCode() {
        Double d = this.star;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.starStr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.reviewsCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.summary;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.reviewKeywords;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<SupplementReviewItem> list2 = this.reviews;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SupplementReview(star=");
        sbLIZ.append(this.star);
        sbLIZ.append(", starStr=");
        sbLIZ.append(this.starStr);
        sbLIZ.append(", reviewsCount=");
        sbLIZ.append(this.reviewsCount);
        sbLIZ.append(", summary=");
        sbLIZ.append(this.summary);
        sbLIZ.append(", reviewKeywords=");
        sbLIZ.append(this.reviewKeywords);
        sbLIZ.append(", reviews=");
        sbLIZ.append(this.reviews);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SupplementReview(Double d, String str, Integer num, String str2, List<String> list, List<SupplementReviewItem> list2) {
        this.star = d;
        this.starStr = str;
        this.reviewsCount = num;
        this.summary = str2;
        this.reviewKeywords = list;
        this.reviews = list2;
    }
}
