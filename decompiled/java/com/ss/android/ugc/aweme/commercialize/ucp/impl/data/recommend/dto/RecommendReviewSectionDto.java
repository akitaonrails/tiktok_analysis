package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto;

import X.C09CT;
import X.C15438062q;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.SupplementReview;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.SupplementReviewItem;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.SupplementReviewPics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class RecommendReviewSectionDto implements Serializable {

    @C09CT("review_keywords")
    public final List<String> reviewKeywords;

    @C09CT("reviews")
    public final List<RecommendReviewItemDto> reviews;

    @C09CT("reviews_count")
    public final Integer reviewsCount;

    @C09CT("star")
    public final Double star;

    @C09CT("star_str")
    public final String starStr;

    @C09CT("summary")
    public final String summary;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendReviewSectionDto)) {
            return false;
        }
        RecommendReviewSectionDto recommendReviewSectionDto = (RecommendReviewSectionDto) obj;
        return Intrinsics.LJFF(this.star, recommendReviewSectionDto.star) && Intrinsics.LJFF(this.starStr, recommendReviewSectionDto.starStr) && Intrinsics.LJFF(this.reviewsCount, recommendReviewSectionDto.reviewsCount) && Intrinsics.LJFF(this.summary, recommendReviewSectionDto.summary) && Intrinsics.LJFF(this.reviewKeywords, recommendReviewSectionDto.reviewKeywords) && Intrinsics.LJFF(this.reviews, recommendReviewSectionDto.reviews);
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
        List<RecommendReviewItemDto> list2 = this.reviews;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendReviewSectionDto(star=");
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

    public final SupplementReview toSupplement() {
        Double d = this.star;
        String str = this.starStr;
        Integer num = this.reviewsCount;
        String str2 = this.summary;
        List<String> list = this.reviewKeywords;
        List<RecommendReviewItemDto> list2 = this.reviews;
        ArrayList arrayList = null;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (RecommendReviewItemDto recommendReviewItemDto : list2) {
                String str3 = recommendReviewItemDto.author;
                String str4 = recommendReviewItemDto.content;
                Double d2 = recommendReviewItemDto.star;
                String str5 = recommendReviewItemDto.starStr;
                String str6 = recommendReviewItemDto.timestamp;
                List<String> list3 = recommendReviewItemDto.images;
                arrayList2.add(new SupplementReviewItem(str3, str4, d2, str5, str6, list3 != null ? new SupplementReviewPics(list3) : null));
            }
            arrayList = arrayList2;
        }
        return new SupplementReview(d, str, num, str2, list, arrayList);
    }

    public RecommendReviewSectionDto(Double d, String str, Integer num, String str2, List<String> list, List<RecommendReviewItemDto> list2) {
        this.star = d;
        this.starStr = str;
        this.reviewsCount = num;
        this.summary = str2;
        this.reviewKeywords = list;
        this.reviews = list2;
    }
}
