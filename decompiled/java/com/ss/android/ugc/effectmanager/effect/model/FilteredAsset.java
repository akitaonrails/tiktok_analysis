package com.ss.android.ugc.effectmanager.effect.model;

import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class FilteredAsset implements Serializable {
    public final Condition condition;
    public final FilterReason filter_reason;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilteredAsset(condition=");
        sbLIZ.append(this.condition);
        sbLIZ.append(", filter_reason=");
        sbLIZ.append(this.filter_reason);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FilteredAsset(Condition condition, FilterReason filterReason) {
        this.condition = condition;
        this.filter_reason = filterReason;
    }
}
