package com.ss.android.ugc.aweme.live.livehostimpl.livereply.playlist;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.chatroom.model.CreatePlaylistData;
import com.bytedance.android.livesdk.chatroom.model.CreatePlaylistReq;
import com.bytedance.android.livesdk.chatroom.model.GetPlaylistAddableItemData;

/* JADX INFO: loaded from: classes13.dex */
public interface LiveReplayPlaylistApi {
    @InterfaceC1501170pAR("/webcast/anchor/replay/playlist/create/")
    Object createLiveReplayPlaylist(@InterfaceC1485405rg CreatePlaylistReq createPlaylistReq, InterfaceC1364105Vn<? super C470590Icr<CreatePlaylistData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/replay/playlist/item_list/")
    Object getLiveReplayPlaylist(@InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("page_size") int i, InterfaceC1364105Vn<? super C470590Icr<GetPlaylistAddableItemData>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/webcast/anchor/replay/playlist/update_reminder/")
    Object updateReminder(@InterfaceC1501050pAF("type") int i, InterfaceC1364105Vn<? super C470590Icr<CreatePlaylistData>> interfaceC1364105Vn);
}
