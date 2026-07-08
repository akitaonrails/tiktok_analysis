package com.bytedance.android.livesdk.signaling.model.downlink;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DownlinkRoomCacheUpdateData extends BaseDownlinkData {

    @C09CT("room_cache_list")
    public final List<RoomCacheUpdateItem> updateItemList;

    public DownlinkRoomCacheUpdateData() {
        this(null);
    }

    public final DownlinkRoomCacheUpdateData copy(List<RoomCacheUpdateItem> list) {
        return new DownlinkRoomCacheUpdateData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DownlinkRoomCacheUpdateData) && Intrinsics.LJFF(this.updateItemList, ((DownlinkRoomCacheUpdateData) obj).updateItemList);
    }

    public int hashCode() {
        List<RoomCacheUpdateItem> list = this.updateItemList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownlinkRoomCacheUpdateData(updateItemList=");
        sbLIZ.append(this.updateItemList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<RoomCacheUpdateItem> getUpdateItemList() {
        return this.updateItemList;
    }

    public DownlinkRoomCacheUpdateData(List<RoomCacheUpdateItem> list) {
        this.updateItemList = list;
    }
}
