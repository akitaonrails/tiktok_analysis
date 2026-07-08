package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data;

import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.bytedance.scene.Scene;
import tikcast.api.anchor.AnchorLiveFragmentDeleteResponse;
import tikcast.api.anchor.AnchorLiveFragmentListResponse;
import tikcast.api.anchor.ReplayPlaylistNoticeInfoData;

/* JADX INFO: loaded from: classes.dex */
public interface LiveReplayApi {
    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/webcast/anchor/live_fragment/delete/")
    Object deletePostedAutoPostFragment(@InterfaceC1501050pAF("fragment_id") String str, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("item_id") String str2, InterfaceC1364105Vn<? super C470590Icr<AnchorLiveFragmentDeleteResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/replay/playlist/notice_info/")
    Object fetchShouldShowPlayListBanner(@InterfaceC1501070pAH("last_notice_timestamp") long j, InterfaceC1364105Vn<? super C470590Icr<ReplayPlaylistNoticeInfoData>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @C09SO(EnumC1846380y9E.BROADCAST)
    @InterfaceC1501170pAR("/webcast/anchor/live_fragment/list/")
    Object getAutoPostFragmentList(@InterfaceC1501050pAF("room_ids") String str, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("get_result_by") int i2, InterfaceC1364105Vn<? super C470590Icr<AnchorLiveFragmentListResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @C09SO(EnumC1846380y9E.BROADCAST)
    @InterfaceC1501170pAR("/webcast/anchor/live_fragment/list/")
    Object getLiveFragmentInfos(@InterfaceC1501050pAF("room_ids") String str, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super C470590Icr<AnchorLiveFragmentListResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/replay/info/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object getLiveReplayVideoInfos(@InterfaceC1501070pAH("offset") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("need_live_fragment") Boolean bool, InterfaceC1364105Vn<? super C470590Icr<AnchorReplayInfoData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/replay/info/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object getReplayVideoInfosFromBB(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("room_ids") String str, @InterfaceC1501070pAH("user_type") int i2, @InterfaceC1501070pAH("need_live_fragment") Boolean bool, InterfaceC1364105Vn<? super C470590Icr<AnchorReplayInfoData>> interfaceC1364105Vn);
}
