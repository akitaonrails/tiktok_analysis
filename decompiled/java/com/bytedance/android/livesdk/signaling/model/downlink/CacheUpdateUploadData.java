package com.bytedance.android.livesdk.signaling.model.downlink;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CacheUpdateUploadData {

    @C09CT("room_cache_list")
    public List<CacheUpdateItem> updateItemList;

    public CacheUpdateUploadData() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CacheUpdateUploadData) && Intrinsics.LJFF(this.updateItemList, ((CacheUpdateUploadData) obj).updateItemList);
    }

    public final int hashCode() {
        List<CacheUpdateItem> list = this.updateItemList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheUpdateUploadData(updateItemList=");
        sbLIZ.append(this.updateItemList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CacheUpdateUploadData(List<CacheUpdateItem> list) {
        this.updateItemList = list;
    }
}
