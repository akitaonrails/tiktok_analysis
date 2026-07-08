package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ReviewInteractItemDto {

    @C09CT("author")
    public final String author;

    @C09CT("content")
    public final String content;

    @C09CT("pics")
    public final ReviewInteractPicsDto pics;

    @C09CT("star")
    public final Double star;

    @C09CT("star_str")
    public final String starStr;

    @C09CT("timestamp")
    public final Long timestamp;

    public ReviewInteractItemDto() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewInteractItemDto)) {
            return false;
        }
        ReviewInteractItemDto reviewInteractItemDto = (ReviewInteractItemDto) obj;
        return Intrinsics.LJFF(this.star, reviewInteractItemDto.star) && Intrinsics.LJFF(this.starStr, reviewInteractItemDto.starStr) && Intrinsics.LJFF(this.content, reviewInteractItemDto.content) && Intrinsics.LJFF(this.author, reviewInteractItemDto.author) && Intrinsics.LJFF(this.timestamp, reviewInteractItemDto.timestamp) && Intrinsics.LJFF(this.pics, reviewInteractItemDto.pics);
    }

    public int hashCode() {
        Double d = this.star;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.starStr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.author;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.timestamp;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        ReviewInteractPicsDto reviewInteractPicsDto = this.pics;
        return iHashCode5 + (reviewInteractPicsDto != null ? reviewInteractPicsDto.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewInteractItemDto(star=");
        sbLIZ.append(this.star);
        sbLIZ.append(", starStr=");
        sbLIZ.append(this.starStr);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", pics=");
        sbLIZ.append(this.pics);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReviewInteractItemDto(Double d, String str, String str2, String str3, Long l, ReviewInteractPicsDto reviewInteractPicsDto) {
        this.star = d;
        this.starStr = str;
        this.content = str2;
        this.author = str3;
        this.timestamp = l;
        this.pics = reviewInteractPicsDto;
    }
}
