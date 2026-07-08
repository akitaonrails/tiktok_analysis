package com.ss.android.ugc.tiktok.pns.feedsafety.filtervideo.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public final class FilterKeywordResp extends BaseResponse {

    @C09CT("word_count")
    public final int counts;

    @C09CT("total_word_count")
    public final int totalCounts;

    public FilterKeywordResp() {
        this(0, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterKeywordResp)) {
            return false;
        }
        FilterKeywordResp filterKeywordResp = (FilterKeywordResp) obj;
        return this.counts == filterKeywordResp.counts && this.totalCounts == filterKeywordResp.totalCounts;
    }

    public final int hashCode() {
        return (this.counts * 31) + this.totalCounts;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterKeywordResp(counts=");
        sbLIZ.append(this.counts);
        sbLIZ.append(", totalCounts=");
        sbLIZ.append(this.totalCounts);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FilterKeywordResp(int i, int i2) {
        this.counts = i;
        this.totalCounts = i2;
    }
}
