package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class RecommendReviewItemDto implements Serializable {

    @C09CT("author")
    public final String author;

    @C09CT("content")
    public final String content;

    @C09CT("images")
    public final List<String> images;

    @C09CT("star")
    public final Double star;

    @C09CT("star_str")
    public final String starStr;

    @C09CT("timestamp")
    public final String timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendReviewItemDto)) {
            return false;
        }
        RecommendReviewItemDto recommendReviewItemDto = (RecommendReviewItemDto) obj;
        return Intrinsics.LJFF(this.author, recommendReviewItemDto.author) && Intrinsics.LJFF(this.content, recommendReviewItemDto.content) && Intrinsics.LJFF(this.star, recommendReviewItemDto.star) && Intrinsics.LJFF(this.starStr, recommendReviewItemDto.starStr) && Intrinsics.LJFF(this.timestamp, recommendReviewItemDto.timestamp) && Intrinsics.LJFF(this.images, recommendReviewItemDto.images);
    }

    public int hashCode() {
        String str = this.author;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.star;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.starStr;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.timestamp;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.images;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendReviewItemDto(author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", star=");
        sbLIZ.append(this.star);
        sbLIZ.append(", starStr=");
        sbLIZ.append(this.starStr);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", images=");
        sbLIZ.append(this.images);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecommendReviewItemDto(String str, String str2, Double d, String str3, String str4, List<String> list) {
        this.author = str;
        this.content = str2;
        this.star = d;
        this.starStr = str3;
        this.timestamp = str4;
        this.images = list;
    }
}
