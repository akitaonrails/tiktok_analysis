package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FrequencyBatchSyncResponse implements Serializable {

    @C09CT("items")
    public final List<FrequencySyncItem> items;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public FrequencyBatchSyncResponse() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyBatchSyncResponse)) {
            return false;
        }
        FrequencyBatchSyncResponse frequencyBatchSyncResponse = (FrequencyBatchSyncResponse) obj;
        return Intrinsics.LJFF(this.statusCode, frequencyBatchSyncResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, frequencyBatchSyncResponse.statusMsg) && Intrinsics.LJFF(this.items, frequencyBatchSyncResponse.items);
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<FrequencySyncItem> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyBatchSyncResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", items=");
        sbLIZ.append(this.items);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyBatchSyncResponse(Integer num, String str, List<FrequencySyncItem> list) {
        this.statusCode = num;
        this.statusMsg = str;
        this.items = list;
    }
}
