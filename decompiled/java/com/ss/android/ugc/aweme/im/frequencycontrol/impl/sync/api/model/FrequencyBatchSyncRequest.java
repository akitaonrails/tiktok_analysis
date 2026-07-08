package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FrequencyBatchSyncRequest implements Serializable {

    @C09CT("extra")
    public final String extra;

    @C09CT("items")
    public final List<FrequencySyncItem> items;

    public FrequencyBatchSyncRequest() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyBatchSyncRequest)) {
            return false;
        }
        FrequencyBatchSyncRequest frequencyBatchSyncRequest = (FrequencyBatchSyncRequest) obj;
        return Intrinsics.LJFF(this.items, frequencyBatchSyncRequest.items) && Intrinsics.LJFF(this.extra, frequencyBatchSyncRequest.extra);
    }

    public int hashCode() {
        List<FrequencySyncItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.extra;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyBatchSyncRequest(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyBatchSyncRequest(List<FrequencySyncItem> list, String str) {
        this.items = list;
        this.extra = str;
    }
}
