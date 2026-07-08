package com.bytedance.android.livesdk.chatroom.api;

import X.C09SO;
import X.C0X9S;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.StartLiveResponse;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.RoomResumeResponse;
import com.bytedance.android.livesdkapi.depend.model.live.ContinueRoomResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleExtra;
import com.bytedance.android.livesdkapi.depend.model.live.debug.CheckDetectPermissionResponse;
import com.bytedance.android.livesdkapi.depend.model.live.debug.DebugRoomItem;
import com.bytedance.android.livesdkapi.depend.model.live.debug.DebugToolState;
import com.bytedance.android.livesdkapi.depend.model.live.debug.GetQuestionnaireContentResponse;
import com.bytedance.android.livesdkapi.depend.model.live.debug.SubmitResponse;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.scene.Scene;
import com.google.gson.n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import webcast.api.room.RefreshPaidStreamResp;

/* JADX INFO: loaded from: classes8.dex */
public interface RoomRetrofitApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/eco/detect/check_permission/")
    C11NZ<C470590Icr<CheckDetectPermissionResponse>> checkDetectPermission(@InterfaceC1501050pAF("user_id") long j);

    @InterfaceC1501160pAQ("/webcast/room/collect_unread/")
    C11NZ<C470590Icr<Object>> collectUnreadRequest(@InterfaceC1501070pAH("unread_extra") String str, @InterfaceC1501070pAH("room_ids") String str2);

    @InterfaceC1501160pAQ("/webcast/room/continue/")
    @C09SO(EnumC1846380y9E.ROOM)
    C11NZ<C470590Icr<ContinueRoomResponse>> continuePreviousRoom(@InterfaceC1501070pAH("enable_http_dns") String str);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/room/create/")
    C11NZ<StartLiveResponse<Room>> createRoom(@InterfaceC1501150pAP HashMap<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/create_replay/")
    C11NZ<StartLiveResponse<Room>> createRoomReplay(@InterfaceC1501150pAP HashMap<String, String> map);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/room/enter/")
    C11NZ<BaseResponse<Room, EnterRoomExtra>> enterRoom(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("hold_living_room") long j2, @InterfaceC1501050pAF("is_login") long j3, @InterfaceC1501150pAP HashMap<String, String> map);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501290pAd(4)
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/enter/")
    C11NZ<BaseResponse<Room, EnterRoomExtra>> enterRoomImmediate(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("hold_living_room") long j2, @InterfaceC1501050pAF("is_login") long j3, @InterfaceC1501150pAP HashMap<String, String> map);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/room/enter/pre_cache/")
    C11NZ<BaseResponse<Room, EnterRoomExtra>> enterRoomPre(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("hold_living_room") long j2, @InterfaceC1501050pAF("is_login") long j3, @InterfaceC1501150pAP HashMap<String, String> map);

    @InterfaceC1501160pAQ("/webcast/room/info/")
    @C09SO(EnumC1846380y9E.ROOM)
    C11NZ<C470590Icr<Room>> fetchRoom(@InterfaceC1501130pAN HashMap<String, String> map);

    @InterfaceC1501160pAQ("/webcast/room/finish_abnormal/")
    C11NZ<C470590Icr<Object>> finishRoomAbnormal(@InterfaceC1501070pAH("source") String str);

    @InterfaceC1501160pAQ("/webcast/feed/get_live_bubble/")
    C11NZ<BaseResponse<LiveBubbleData, LiveBubbleExtra>> getLiveBubble();

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/mget_info/")
    C11NZ<C470590Icr<Map<String, Room>>> getMultipleRoomInfo(@InterfaceC1501050pAF("room_ids") String str);

    @InterfaceC1501170pAR("/webcast/eco/detect/get_questionnaire/")
    C11NZ<C470590Icr<GetQuestionnaireContentResponse>> getQuestionnaireContent();

    @InterfaceC1501160pAQ("/webcast/room/debug_item/")
    C11NZ<C470590Icr<List<DebugRoomItem>>> getRoomDebugInfo(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/room/debug_permission/")
    C11NZ<C470590Icr<DebugToolState>> getRoomDebugInfoPermission();

    @InterfaceC1501160pAQ("/webcast/room/info/")
    @C09SO(EnumC1846380y9E.ROOM)
    C0X9S<C470590Icr<Room>> getRoomStats(@InterfaceC1501070pAH("is_anchor") boolean z, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("pack_level") int i);

    @InterfaceC1501160pAQ("/webcast/room/info/")
    @C09SO(EnumC1846380y9E.ROOM)
    C0X9S<C470590Icr<Room>> getRoomStats(@InterfaceC1501070pAH("is_anchor") boolean z, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("pack_level") int i, @InterfaceC1501070pAH("need_health_score_info") boolean z2, @InterfaceC1501070pAH("from_type") int i2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/leave/")
    C11NZ<C470590Icr<Object>> leaveRoom(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("reason") int i);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/room/enter/{version}/")
    C11NZ<BaseResponse<Room, EnterRoomExtra>> newVersionEnterRoom(@InterfaceC1501060pAG("version") String str, @InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("hold_living_room") long j2, @InterfaceC1501050pAF("is_login") long j3, @InterfaceC1501150pAP HashMap<String, String> map);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501290pAd(4)
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/enter/{version}/")
    C11NZ<BaseResponse<Room, EnterRoomExtra>> newVersionEnterRoomImmediately(@InterfaceC1501060pAG("version") String str, @InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("hold_living_room") long j2, @InterfaceC1501050pAF("is_login") long j3, @InterfaceC1501150pAP HashMap<String, String> map);

    @InterfaceC1501160pAQ("/webcast/feed/press_live_bubble/")
    C11NZ<C470590Icr<Object>> pressLiveBubble(@InterfaceC1501070pAH("bubble_room_id") long j, @InterfaceC1501070pAH("bubble_owner_id") long j2);

    @InterfaceC1501160pAQ("/webcast/room/refresh_paid_stream/")
    @C09SO(EnumC1846380y9E.ROOM)
    C11NZ<C470590Icr<RefreshPaidStreamResp.ResponseData>> refreshPaidStream(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("refresh_type") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/eco/detect/report/")
    C11NZ<C470590Icr<SubmitResponse>> reportDetect(@InterfaceC1501050pAF("detector_user_id") long j, @InterfaceC1501050pAF("action_type") int i, @InterfaceC1501050pAF("detect_room_count") int i2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/resume/")
    C11NZ<C470590Icr<RoomResumeResponse>> resumeRoom(@InterfaceC1501150pAP HashMap<String, String> map);

    @InterfaceC1501170pAR("/webcast/eco/detect/submit/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<C470590Icr<SubmitResponse>> submitDetect(@InterfaceC1485405rg n nVar);

    @InterfaceC1501160pAQ("/webcast/feed/push/")
    C11NZ<C470590Icr<Object>> triggerFeedPush(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str);

    @InterfaceC1501160pAQ("/webcast/room/auditing/apply/")
    C11NZ<C470590Icr<Object>> unblockRoom(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501170pAR("/webcast/room/upload/image/")
    C11NZ<C470590Icr<CoverImageModel>> uploadImage(@InterfaceC1485405rg TypedOutput typedOutput);
}
