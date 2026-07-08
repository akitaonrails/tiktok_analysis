package com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplaySettingsData;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayShareToGuestsResponse;
import com.bytedance.scene.Scene;
import tikcast.api.anchor.AnchorLiveFragmentSubInboxResponse;
import tikcast.api.anchor.LiveFragmentReportResponse;
import tikcast.api.anchor.UpdateReplaySettingsResponse;

/* JADX INFO: loaded from: classes28.dex */
public interface LiveReplySettingApi {
    @InterfaceC1501160pAQ("/webcast/room/replay/settings/")
    Object getLiveReplySettings(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) Integer num, InterfaceC1364105Vn<? super C470590Icr<AnchorReplaySettingsData>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/webcast/anchor/live_fragment/report/")
    Object reportAutoPostPanelStatus(@InterfaceC1501050pAF("room_id_str") String str, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("action") int i2, InterfaceC1364105Vn<? super C470590Icr<LiveFragmentReportResponse>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/webcast/room/replay/share_to_guests/")
    Object shareToGuests(@InterfaceC1501050pAF("switch") int i, InterfaceC1364105Vn<? super C470590Icr<AnchorReplayShareToGuestsResponse>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/webcast/anchor/live_fragment/sub_inbox/")
    Object subscribeInbox(@InterfaceC1501050pAF("switch") int i, InterfaceC1364105Vn<? super C470590Icr<AnchorLiveFragmentSubInboxResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/webcast/anchor/replay/settings/update/")
    Object updateReplaySetting(@InterfaceC1501050pAF("setting_type") int i, @InterfaceC1501050pAF("action") int i2, @InterfaceC1501050pAF("after_live_visibility") int i3, InterfaceC1364105Vn<? super C470590Icr<UpdateReplaySettingsResponse>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/webcast/anchor/replay/settings/update/")
    Object updateReplaySetting(@InterfaceC1501050pAF("setting_type") int i, @InterfaceC1501050pAF("action") int i2, InterfaceC1364105Vn<? super C470590Icr<UpdateReplaySettingsResponse>> interfaceC1364105Vn);
}
