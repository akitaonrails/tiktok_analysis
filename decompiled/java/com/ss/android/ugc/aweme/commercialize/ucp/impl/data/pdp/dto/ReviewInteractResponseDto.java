package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ReviewInteractResponseDto extends BaseResponse {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_cursor")
    public final String nextCursor;

    @C09CT("reviews")
    public final List<ReviewInteractItemDto> reviews;

    @C09CT("total")
    public final int total;

    public ReviewInteractResponseDto() {
        this(null, CardStruct.IStatusCode.DEFAULT, false, 0);
    }

    public final ReviewInteractResponseDto copy(List<ReviewInteractItemDto> list, String str, boolean z, int i) {
        return new ReviewInteractResponseDto(list, str, z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewInteractResponseDto)) {
            return false;
        }
        ReviewInteractResponseDto reviewInteractResponseDto = (ReviewInteractResponseDto) obj;
        return Intrinsics.LJFF(this.reviews, reviewInteractResponseDto.reviews) && Intrinsics.LJFF(this.nextCursor, reviewInteractResponseDto.nextCursor) && this.hasMore == reviewInteractResponseDto.hasMore && this.total == reviewInteractResponseDto.total;
    }

    public int hashCode() {
        List<ReviewInteractItemDto> list = this.reviews;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + this.nextCursor.hashCode()) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + this.total;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewInteractResponseDto(reviews=");
        sbLIZ.append(this.reviews);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<ReviewInteractItemDto> getReviews() {
        return this.reviews;
    }

    public final int getTotal() {
        return this.total;
    }

    public ReviewInteractResponseDto(List<ReviewInteractItemDto> list, String str, boolean z, int i) {
        super(null, null);
        this.reviews = list;
        this.nextCursor = str;
        this.hasMore = z;
        this.total = i;
    }
}
