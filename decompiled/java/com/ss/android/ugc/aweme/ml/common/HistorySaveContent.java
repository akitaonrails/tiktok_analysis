package com.ss.android.ugc.aweme.ml.common;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HistorySaveContent {

    @C09CT("list")
    public List<HistorySaveListItem> list;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Content(list=");
        sbLIZ.append(this.list);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
