package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import tikcast.api.anchor.AnchorLiveJourneyReceiveRewardReq;
import tikcast.api.anchor.AnchorLiveJourneyReceiveRewardResp;
import tikcast.api.anchor.GetHostContainerSchemaResponse;
import tikcast.api.anchor_data.GetRealtimeLiveCenterOverviewContainer;
import webcast.api.creator.RoomCreatorBizInfoReq;
import webcast.api.creator.RoomCreatorBizInfoResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface LiveCenterApi {
    @InterfaceC1501170pAR("/webcast/anchor/live_journey/receive_reward/")
    C11NZ<C470590Icr<AnchorLiveJourneyReceiveRewardResp.Data>> claimJourneyRewards(@InterfaceC1485405rg AnchorLiveJourneyReceiveRewardReq anchorLiveJourneyReceiveRewardReq);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/live_center/task/event_report/")
    C11NZ<C470590Icr<Unit>> finishLiveCenterTimingTask(@InterfaceC1501050pAF("event_type") int i);

    @InterfaceC1501170pAR("/webcast/room/creator_biz_info/")
    C11NZ<C470590Icr<RoomCreatorBizInfoResponse.BizInfoData>> getBizInfoResponse(@InterfaceC1485405rg RoomCreatorBizInfoReq roomCreatorBizInfoReq);

    @InterfaceC1501160pAQ("/webcast/live_center/realtime/overview/")
    C11NZ<C470590Icr<GetRealtimeLiveCenterOverviewContainer>> getOverview(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("need_detail") int i, @InterfaceC1501070pAH("need_layout") int i2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i3, @InterfaceC1501070pAH("white_box_suggestion_id") String str2, @InterfaceC1501070pAH("tips_suggestion_id") String str3);

    @InterfaceC1501170pAR("/webcast/anchor/get_schema_config/")
    Object getSchemaConfig(InterfaceC1364105Vn<? super C470590Icr<GetHostContainerSchemaResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/cold_boot/")
    C11NZ<C470590Icr<Unit>> notifyAnchorColdBoot(@InterfaceC1501070pAH("use_live_podcast_response") boolean z, @InterfaceC1501070pAH("can_be_live_podcast") boolean z2, @InterfaceC1501070pAH("enable_live_video") boolean z3);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/anchor_task/receive_reward/")
    C11NZ<C470590Icr<Unit>> receiveInstanceReward(@InterfaceC1501050pAF("task_record_id") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/anchor_grow_level/receive_reward/")
    C11NZ<C470590Icr<Unit>> receiveReward(@InterfaceC1501050pAF("level") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/host_management/suggestion/show_report/")
    Object reportSuggestionShow(@InterfaceC1501050pAF("suggestion_record_id") String str, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/live_center/realtime/operate/")
    C11NZ<C470590Icr<Unit>> switchImMessage(@InterfaceC1501050pAF("action") int i, @InterfaceC1501050pAF("push_interval") int i2, @InterfaceC1501050pAF("room_id") String str);
}
