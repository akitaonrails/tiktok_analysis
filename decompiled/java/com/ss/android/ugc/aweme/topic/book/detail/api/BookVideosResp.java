package com.ss.android.ugc.aweme.topic.book.detail.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BookVideosResp extends BaseResponse {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("page_extra")
    public final String pageExtra;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookVideosResp)) {
            return false;
        }
        BookVideosResp bookVideosResp = (BookVideosResp) obj;
        return Intrinsics.LJFF(this.awemeList, bookVideosResp.awemeList) && this.hasMore == bookVideosResp.hasMore && Intrinsics.LJFF(this.pageExtra, bookVideosResp.pageExtra);
    }

    public final int hashCode() {
        List<Aweme> list = this.awemeList;
        return ((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + this.pageExtra.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BookVideosResp(awemeList=");
        sbLIZ.append(this.awemeList);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", pageExtra=");
        sbLIZ.append(this.pageExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BookVideosResp(List<? extends Aweme> list, boolean z, String str) {
        this.awemeList = list;
        this.hasMore = z;
        this.pageExtra = str;
    }
}
