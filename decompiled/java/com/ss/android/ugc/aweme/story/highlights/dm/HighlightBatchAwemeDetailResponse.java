package com.ss.android.ugc.aweme.story.highlights.dm;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HighlightBatchAwemeDetailResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("awemes")
    public final List<HighlightCollectionQueryResult> highlightCollectionResults;

    public HighlightBatchAwemeDetailResponse() {
        this(null, 1, null);
    }

    public final HighlightBatchAwemeDetailResponse copy(List<HighlightCollectionQueryResult> list) {
        return new HighlightBatchAwemeDetailResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HighlightBatchAwemeDetailResponse) && Intrinsics.LJFF(this.highlightCollectionResults, ((HighlightBatchAwemeDetailResponse) obj).highlightCollectionResults);
    }

    public int hashCode() {
        List<HighlightCollectionQueryResult> list = this.highlightCollectionResults;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightBatchAwemeDetailResponse(highlightCollectionResults=");
        sbLIZ.append(this.highlightCollectionResults);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<HighlightCollectionQueryResult> getHighlightCollectionResults() {
        return this.highlightCollectionResults;
    }

    public HighlightBatchAwemeDetailResponse(List<HighlightCollectionQueryResult> list) {
        this.highlightCollectionResults = list;
    }

    public HighlightBatchAwemeDetailResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
