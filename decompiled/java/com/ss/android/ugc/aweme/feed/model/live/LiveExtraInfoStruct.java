package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class LiveExtraInfoStruct implements Serializable {

    @C09CT("stats_tag_for_client_func")
    public List<LiveRoomStatesTag> liveRoomStatesTagsForClientFunc;

    public LiveExtraInfoStruct() {
    }

    public LiveExtraInfoStruct(List<LiveRoomStatesTag> list) {
        this.liveRoomStatesTagsForClientFunc = list;
    }

    public final void setLiveRoomStatesTagsForClientFunc(List<LiveRoomStatesTag> list) {
        this.liveRoomStatesTagsForClientFunc = list;
    }
}
