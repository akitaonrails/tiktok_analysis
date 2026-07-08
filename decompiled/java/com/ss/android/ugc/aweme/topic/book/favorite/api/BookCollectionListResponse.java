package com.ss.android.ugc.aweme.topic.book.favorite.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BookCollectionListResponse extends BaseResponse {

    @C09CT("book_list")
    public final List<TopicRawInfo> bookList;

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookCollectionListResponse)) {
            return false;
        }
        BookCollectionListResponse bookCollectionListResponse = (BookCollectionListResponse) obj;
        return Intrinsics.LJFF(this.bookList, bookCollectionListResponse.bookList) && this.cursor == bookCollectionListResponse.cursor && this.hasMore == bookCollectionListResponse.hasMore;
    }

    public final int hashCode() {
        return (((this.bookList.hashCode() * 31) + C786410Ut5.Y2(this.cursor)) * 31) + C786410Ut5.Z2(this.hasMore);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BookCollectionListResponse(bookList=");
        sbLIZ.append(this.bookList);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BookCollectionListResponse() {
        this(new ArrayList(), 0L, false);
    }

    public BookCollectionListResponse(List<TopicRawInfo> list, long j, boolean z) {
        this.bookList = list;
        this.cursor = j;
        this.hasMore = z;
    }
}
