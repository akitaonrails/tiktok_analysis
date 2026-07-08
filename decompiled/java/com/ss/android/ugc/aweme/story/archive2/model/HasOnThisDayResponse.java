package com.ss.android.ugc.aweme.story.archive2.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HasOnThisDayResponse extends BaseResponse {

    @C09CT("has_on_this_day")
    public final boolean hasOnThisDay;

    @C09CT("query_date")
    public final String queryDate;

    public HasOnThisDayResponse() {
        this(false, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HasOnThisDayResponse)) {
            return false;
        }
        HasOnThisDayResponse hasOnThisDayResponse = (HasOnThisDayResponse) obj;
        return this.hasOnThisDay == hasOnThisDayResponse.hasOnThisDay && Intrinsics.LJFF(this.queryDate, hasOnThisDayResponse.queryDate);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.hasOnThisDay) * 31) + this.queryDate.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HasOnThisDayResponse(hasOnThisDay=");
        sbLIZ.append(this.hasOnThisDay);
        sbLIZ.append(", queryDate=");
        sbLIZ.append(this.queryDate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HasOnThisDayResponse(boolean z, String str) {
        this.hasOnThisDay = z;
        this.queryDate = str;
    }
}
