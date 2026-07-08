package com.ss.android.ugc.aweme.feed.adapter.widget.repost;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import webcast.api.room.WebcastRoomRepostCreateResponse;
import webcast.api.room.WebcastRoomRepostDeleteResponse;
import webcast.api.room.WebcastRoomRepostNoteCreateResponse;
import webcast.api.room.WebcastRoomRepostRepostersResponse;

/* JADX INFO: loaded from: classes28.dex */
public interface LiveRepostApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/repost/create/")
    C11NZ<WebcastRoomRepostCreateResponse> createRepost(@InterfaceC1501050pAF("room_id") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/repost/note/create/")
    C11NZ<WebcastRoomRepostNoteCreateResponse> createRepostNote(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("note") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/repost/delete/")
    C11NZ<WebcastRoomRepostDeleteResponse> deleteRepost(@InterfaceC1501050pAF("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/room/repost/reposters/")
    C11NZ<WebcastRoomRepostRepostersResponse> getReposters(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("token") String str, @InterfaceC1501070pAH("non_personalized") boolean z);
}
