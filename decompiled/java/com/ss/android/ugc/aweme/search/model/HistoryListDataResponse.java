package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HistoryListDataResponse {

    @C09CT("data")
    public final List<HistoryExtraInfo> data;

    public HistoryListDataResponse() {
        this(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryListDataResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HistoryListDataResponse(List<HistoryExtraInfo> list) {
        this.data = list;
    }
}
