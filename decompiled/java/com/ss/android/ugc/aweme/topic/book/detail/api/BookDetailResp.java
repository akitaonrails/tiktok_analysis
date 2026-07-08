package com.ss.android.ugc.aweme.topic.book.detail.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BookDetailResp extends BaseResponse {

    @C09CT("topic_detail")
    public final BookDetail detail;

    @C09CT("is_collected")
    public boolean isCollected;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookDetailResp)) {
            return false;
        }
        BookDetailResp bookDetailResp = (BookDetailResp) obj;
        return this.isCollected == bookDetailResp.isCollected && Intrinsics.LJFF(this.detail, bookDetailResp.detail);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.isCollected) * 31) + this.detail.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BookDetailResp(isCollected=");
        sbLIZ.append(this.isCollected);
        sbLIZ.append(", detail=");
        sbLIZ.append(this.detail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BookDetailResp(boolean z, BookDetail bookDetail) {
        this.isCollected = z;
        this.detail = bookDetail;
    }
}
