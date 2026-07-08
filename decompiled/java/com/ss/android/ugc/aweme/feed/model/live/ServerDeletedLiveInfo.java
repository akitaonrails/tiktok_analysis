package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerDeletedLiveInfo implements Serializable {

    @C09CT("deleted_live_rooms")
    public List<DeletedLiveInfo> deletedLiveRooms;

    public ServerDeletedLiveInfo() {
        this(null, 1, null);
    }

    public ServerDeletedLiveInfo(List<DeletedLiveInfo> list) {
        this.deletedLiveRooms = list;
    }

    public final void setDeletedLiveRooms(List<DeletedLiveInfo> list) {
        this.deletedLiveRooms = list;
    }

    public ServerDeletedLiveInfo(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
