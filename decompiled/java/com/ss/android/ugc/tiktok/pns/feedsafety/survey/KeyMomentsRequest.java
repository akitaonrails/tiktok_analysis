package com.ss.android.ugc.tiktok.pns.feedsafety.survey;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class KeyMomentsRequest {

    @C09CT("item_ids")
    public final List<String> itemIds;

    public KeyMomentsRequest() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KeyMomentsRequest) && Intrinsics.LJFF(this.itemIds, ((KeyMomentsRequest) obj).itemIds);
    }

    public final int hashCode() {
        List<String> list = this.itemIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyMomentsRequest(itemIds=");
        sbLIZ.append(this.itemIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KeyMomentsRequest(List<String> list) {
        this.itemIds = list;
    }
}
