package com.ss.android.ugc.aweme.iab;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class TtopUrlReviewResp extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("iab_url_category")
    public final int iabUrlCategory;

    @C09CT("iab_url_review_result")
    public final int iabUrlReviewResult;

    public TtopUrlReviewResp() {
        this(-1, -1);
    }

    public final TtopUrlReviewResp copy(int i, int i2) {
        return new TtopUrlReviewResp(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtopUrlReviewResp)) {
            return false;
        }
        TtopUrlReviewResp ttopUrlReviewResp = (TtopUrlReviewResp) obj;
        return this.iabUrlReviewResult == ttopUrlReviewResp.iabUrlReviewResult && this.iabUrlCategory == ttopUrlReviewResp.iabUrlCategory;
    }

    public int hashCode() {
        return (this.iabUrlReviewResult * 31) + this.iabUrlCategory;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TtopUrlReviewResp(iabUrlReviewResult=");
        sbLIZ.append(this.iabUrlReviewResult);
        sbLIZ.append(", iabUrlCategory=");
        sbLIZ.append(this.iabUrlCategory);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getIabUrlCategory() {
        return this.iabUrlCategory;
    }

    public final int getIabUrlReviewResult() {
        return this.iabUrlReviewResult;
    }

    public TtopUrlReviewResp(int i, int i2) {
        this.iabUrlReviewResult = i;
        this.iabUrlCategory = i2;
    }
}
