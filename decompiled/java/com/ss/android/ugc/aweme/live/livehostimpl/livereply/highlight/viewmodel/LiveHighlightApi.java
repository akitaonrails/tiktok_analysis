package com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel;

import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import tikcast.api.anchor.AnchorLiveFragmentDeleteResponse;
import tikcast.api.anchor.AnchorLiveFragmentListResponse;
import tikcast.api.anchor.GetFragmentEditElementsReq;
import tikcast.api.anchor.GetFragmentEditElementsResp;
import tikcast.api.anchor.RevertLiveFragmentResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LiveHighlightApi {
    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/webcast/anchor/live_fragment/delete/")
    Object deleteLiveFragmentInfo(@InterfaceC1501050pAF("fragment_id") String str, InterfaceC1364105Vn<? super C470590Icr<AnchorLiveFragmentDeleteResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @C09SO(EnumC1846380y9E.BROADCAST)
    @InterfaceC1501170pAR("/webcast/anchor/live_fragment/list/")
    Object getLiveFragmentInfos(@InterfaceC1501150pAP HashMap<String, Object> map, InterfaceC1364105Vn<? super C470590Icr<AnchorLiveFragmentListResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/anchor/live_fragment/edit_elements/")
    Object getLiveHighlightEditElements(@InterfaceC1485405rg GetFragmentEditElementsReq getFragmentEditElementsReq, InterfaceC1364105Vn<? super C470590Icr<GetFragmentEditElementsResp.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/replay/info/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object getLiveReplayVideoInfos(@InterfaceC1501070pAH("room_ids") String str, InterfaceC1364105Vn<? super C470590Icr<AnchorReplayInfoData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/replay/info/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object getReplayVideoInfosForBBFans(@InterfaceC1501070pAH("room_ids") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("user_type") int i2, @InterfaceC1501070pAH("need_live_fragment") Boolean bool, InterfaceC1364105Vn<? super C470590Icr<AnchorReplayInfoData>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/webcast/anchor/live_fragment/revert/")
    Object revertLiveFragmentInfo(@InterfaceC1501050pAF("fragment_id") String str, @InterfaceC1501050pAF("action") int i, InterfaceC1364105Vn<? super C470590Icr<RevertLiveFragmentResponse.ResponseData>> interfaceC1364105Vn);
}
