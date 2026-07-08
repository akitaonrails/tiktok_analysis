package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class KickOutAllResult {
    public final List<Long> removeUidList;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KickOutAllResult(removeUidList=");
        sbLIZ.append(this.removeUidList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KickOutAllResult(List<Long> list) {
        this.removeUidList = list;
    }
}
