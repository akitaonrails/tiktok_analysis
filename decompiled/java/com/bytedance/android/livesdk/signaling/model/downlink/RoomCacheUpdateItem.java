package com.bytedance.android.livesdk.signaling.model.downlink;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RoomCacheUpdateItem {

    @C09CT("cache_valid")
    public final boolean cacheValid;

    @C09CT("room_base64")
    public final String roomData;

    @C09CT("room_id")
    public final long roomId;

    @C09CT("basic_changes")
    public final List<Integer> tagList;

    @C09CT("time_stamp")
    public final long updateVersion;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomCacheUpdateItem)) {
            return false;
        }
        RoomCacheUpdateItem roomCacheUpdateItem = (RoomCacheUpdateItem) obj;
        return this.roomId == roomCacheUpdateItem.roomId && this.updateVersion == roomCacheUpdateItem.updateVersion && Intrinsics.LJFF(this.roomData, roomCacheUpdateItem.roomData) && Intrinsics.LJFF(this.tagList, roomCacheUpdateItem.tagList) && this.cacheValid == roomCacheUpdateItem.cacheValid;
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.roomId) * 31) + C786410Ut5.Y2(this.updateVersion)) * 31;
        String str = this.roomData;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Integer> list = this.tagList;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.cacheValid);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoomCacheUpdateItem(roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", updateVersion=");
        sbLIZ.append(this.updateVersion);
        sbLIZ.append(", roomData=");
        sbLIZ.append(this.roomData);
        sbLIZ.append(", tagList=");
        sbLIZ.append(this.tagList);
        sbLIZ.append(", cacheValid=");
        sbLIZ.append(this.cacheValid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RoomCacheUpdateItem(long j, long j2, String str, List<Integer> list, boolean z) {
        this.roomId = j;
        this.updateVersion = j2;
        this.roomData = str;
        this.tagList = list;
        this.cacheValid = z;
    }
}
