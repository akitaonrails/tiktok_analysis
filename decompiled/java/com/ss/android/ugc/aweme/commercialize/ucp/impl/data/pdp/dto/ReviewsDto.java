package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ReviewsDto implements Serializable {

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("message")
    public final String message;

    @C09CT("next_cursor")
    public final String next_cursor;

    @C09CT("reviews")
    public final List<ReviewItemDto> reviews;

    @C09CT("status_code")
    public final Integer status_code;

    @C09CT("total")
    public final Integer total;

    public ReviewsDto() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewsDto)) {
            return false;
        }
        ReviewsDto reviewsDto = (ReviewsDto) obj;
        return Intrinsics.LJFF(this.status_code, reviewsDto.status_code) && Intrinsics.LJFF(this.message, reviewsDto.message) && Intrinsics.LJFF(this.reviews, reviewsDto.reviews) && Intrinsics.LJFF(this.next_cursor, reviewsDto.next_cursor) && Intrinsics.LJFF(this.has_more, reviewsDto.has_more) && Intrinsics.LJFF(this.total, reviewsDto.total);
    }

    public int hashCode() {
        Integer num = this.status_code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ReviewItemDto> list = this.reviews;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.next_cursor;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.has_more;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.total;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewsDto(status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", reviews=");
        sbLIZ.append(this.reviews);
        sbLIZ.append(", next_cursor=");
        sbLIZ.append(this.next_cursor);
        sbLIZ.append(", has_more=");
        sbLIZ.append(this.has_more);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReviewsDto(Integer num, String str, List<ReviewItemDto> list, String str2, Boolean bool, Integer num2) {
        this.status_code = num;
        this.message = str;
        this.reviews = list;
        this.next_cursor = str2;
        this.has_more = bool;
        this.total = num2;
    }
}
