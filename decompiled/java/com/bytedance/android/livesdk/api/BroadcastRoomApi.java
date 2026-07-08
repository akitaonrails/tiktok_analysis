package com.bytedance.android.livesdk.api;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.api.model.RoomUpdateInfoResult;
import com.bytedance.android.livesdk.api.model.WaitingReviewInfo;
import com.bytedance.android.livesdk.boostcard.LiveGiftBoostCardAckResponse;
import com.bytedance.android.livesdk.chatroom.model.AnchorFinishEncourageData;
import com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData;
import com.bytedance.android.livesdk.chatroom.model.GetSettingPanelRequest;
import com.bytedance.android.livesdk.chatroom.model.GetSettingPanelResponse;
import com.bytedance.android.livesdk.chatroom.model.UpsertRoomVisibleScopeRequest;
import com.bytedance.android.livesdk.chatroom.model.UpsertRoomVisibleScopeResponse;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.scene.Scene;
import tikcast.api.anchor.AnchorGrowPerLiveTriggerResponse;
import tikcast.api.anchor.ReminderWordQueryStatusRequest;
import tikcast.api.anchor.ReminderWordQueryStatusResponse;
import tikcast.api.anchor.ReminderWordUpdateStatusRequest;
import tikcast.api.anchor.ReminderWordUpdateStatusResponse;
import tikcast.api.anchor_data.AnchorFinishEncourageV2Response;
import tikcast.api.boost.ConsumeCardResponse;
import tikcast.api.eco.RulesAndGuidanceResponse;
import tikcast.api.perception.LiveStatusPerceptionResponse;
import webcast.api.creator.PushStreamInfo;
import webcast.api.room.CppAgeVerifyResponse;
import webcast.api.room.CppSafetyEducationResponse;
import webcast.api.room.CreateInfoRequest;
import webcast.api.room.EventTrackingReportReqMessage;
import webcast.api.room.MockResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface BroadcastRoomApi {
    @InterfaceC1501160pAQ("/webcast/perception/live_status_perception/")
    AbstractC19484711Kz<C470590Icr<LiveStatusPerceptionResponse.ResponseData>> bannedInfo(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("anchor_id") long j);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast/boost/card/ack/")
    C11NZ<C470590Icr<LiveGiftBoostCardAckResponse>> boostCardAck(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("ack_type") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/boost/card/consume/")
    C11NZ<C470590Icr<ConsumeCardResponse.Data>> boostCardConsume(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("card_id") long j2);

    @InterfaceC1501160pAQ("/webcast/eco/rules_and_guidance/")
    C11NZ<C470590Icr<RulesAndGuidanceResponse.ResponseData>> checkLiveCenterBubble(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501160pAQ("/webcast/room/anchor_pre_finish/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    C11NZ<C470590Icr<AnchorPreFinishData>> getAnchorPreFinish(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/room/anchor_finish_encourage/")
    C11NZ<C470590Icr<AnchorFinishEncourageData>> getFinishEncourage(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("preload") boolean z, @InterfaceC1501070pAH("only_when_upgrade_level") boolean z2);

    @InterfaceC1501160pAQ("/webcast/host_management/end_live_encourage_container/")
    C11NZ<C470590Icr<AnchorFinishEncourageV2Response.Data>> getFinishEncourageV2(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("preload") boolean z);

    @InterfaceC1501160pAQ("/webcast/room/live_permission/apply_info/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    C11NZ<C470590Icr<LivePermissionApplyResponse>> getLivePermissionApply(@InterfaceC1501070pAH("permission_names") String str);

    @C09SO(EnumC1846380y9E.BROADCAST)
    @InterfaceC1501170pAR("/webcast/room/create_info/")
    C11NZ<C470590Icr<RoomCreateInfo>> getPreviewRoomCreateInfo(@InterfaceC1485405rg CreateInfoRequest createInfoRequest);

    @InterfaceC1501160pAQ("/webcast/room/auditing/info/")
    C11NZ<C470590Icr<WaitingReviewInfo>> getReviewInfo(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/room/get_setting_panel/")
    C11NZ<C470590Icr<GetSettingPanelResponse>> getSettingPanelResponse(@InterfaceC1485405rg GetSettingPanelRequest getSettingPanelRequest);

    @InterfaceC1501160pAQ("/webcast/room/push_stream_info/")
    C11NZ<C470590Icr<PushStreamInfo>> getStreamInfo();

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.BROADCAST)
    @InterfaceC1501170pAR("/webcast/room/mock/")
    C11NZ<C470590Icr<MockResponse.Data>> mockTryModeRoom(@InterfaceC1501050pAF("need_guide_videos") boolean z);

    @InterfaceC1501170pAR("/webcast/room/auto_brighten/")
    C11NZ<C470590Icr<Object>> noticeAutoBrighten(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501170pAR("/webcast/anchor/reminder_word/query_status/")
    C11NZ<ReminderWordQueryStatusResponse> queryReminderWordStatus(@InterfaceC1485405rg ReminderWordQueryStatusRequest reminderWordQueryStatusRequest);

    @InterfaceC1501170pAR("/webcast/room/banner_event/")
    C11NZ<C470590Icr<Object>> reportBannerEvent(@InterfaceC1501070pAH("banner_id") long j, @InterfaceC1501070pAH("event_type") int i);

    @InterfaceC1501170pAR("/webcast/room/event_tracking_report/")
    C11NZ<C470590Icr<Void>> reportCampaignEvent(@InterfaceC1485405rg EventTrackingReportReqMessage eventTrackingReportReqMessage);

    @InterfaceC1501160pAQ("/webcast/room/cpp/age/verify/")
    C11NZ<C470590Icr<CppAgeVerifyResponse.Data>> requestAgeVerify();

    @C09SO(EnumC1846380y9E.BROADCAST)
    @InterfaceC1501170pAR("/webcast/anchor/anchor_grow/per_live_trigger/")
    C11NZ<C470590Icr<AnchorGrowPerLiveTriggerResponse.Data>> requestAnchorGrowTrigger();

    @InterfaceC1501160pAQ("/webcast/room/cpp/safety/education/")
    C11NZ<C470590Icr<CppSafetyEducationResponse.Data>> requestSafetyEducation();

    @InterfaceC1501170pAR("/webcast/room/video/capture/")
    C11NZ<C470590Icr<Object>> updateCaptureVideo(@InterfaceC1485405rg TypedOutput typedOutput);

    @InterfaceC1501170pAR("/webcast/anchor/reminder_word/update_status/")
    C11NZ<ReminderWordUpdateStatusResponse> updateReminderWordStatus(@InterfaceC1485405rg ReminderWordUpdateStatusRequest reminderWordUpdateStatusRequest);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/update_room_info/")
    C11NZ<C470590Icr<RoomUpdateInfoResult>> updateRoomInfo(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("cover_uri") String str);

    @InterfaceC1501170pAR("/webcast/review/upload_original_frame")
    C11NZ<C470590Icr<CoverImageModel>> uploadOriginScreen(@InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC1501070pAH("room_id") Long l, @InterfaceC1501070pAH("event_scene") int i);

    @InterfaceC1501170pAR("/webcast/room/visible_scope/upsert/")
    C11NZ<C470590Icr<UpsertRoomVisibleScopeResponse>> upsertRoomVisibleScope(@InterfaceC1485405rg UpsertRoomVisibleScopeRequest upsertRoomVisibleScopeRequest);
}
