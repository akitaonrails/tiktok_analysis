package com.ss.android.ugc.aweme.models;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class NowArchiveResponse extends BaseResponse {

    @C09CT("data")
    public final List<Aweme> data;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_cursor")
    public final long nextCursor;

    @C09CT("pre_cursor")
    public final long prevCursor;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowArchiveResponse)) {
            return false;
        }
        NowArchiveResponse nowArchiveResponse = (NowArchiveResponse) obj;
        return this.hasMore == nowArchiveResponse.hasMore && this.prevCursor == nowArchiveResponse.prevCursor && this.nextCursor == nowArchiveResponse.nextCursor && Intrinsics.LJFF(this.data, nowArchiveResponse.data);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.hasMore) * 31) + C786410Ut5.Y2(this.prevCursor)) * 31) + C786410Ut5.Y2(this.nextCursor)) * 31) + this.data.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NowArchiveResponse(hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", prevCursor=");
        sbLIZ.append(this.prevCursor);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NowArchiveResponse(boolean z, long j, long j2, List<? extends Aweme> list) {
        this.hasMore = z;
        this.prevCursor = j;
        this.nextCursor = j2;
        this.data = list;
    }
}
