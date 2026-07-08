package com.bytedance.android.livesdk.game.api;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C0X9S;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import X.InterfaceC820680WHi;
import com.bytedance.android.livesdk.game.model.AnchorPartnershipInfoResponse;
import com.bytedance.android.livesdk.game.model.AnchorTasksResponse;
import com.bytedance.android.livesdk.game.model.PartnershipDownloadResponse;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.scene.Scene;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import webcast.api.partnership.AnchorCheckPartnershipJumpResponse;
import webcast.api.partnership.AnchorEventsResponse;
import webcast.api.partnership.AnchorInfoResponse;
import webcast.api.partnership.AnchorPartnershipTasksResponse;
import webcast.api.partnership.AnchorRoomInfoResponse;
import webcast.api.partnership.AnchorToggleInfoResponse;
import webcast.api.partnership.ChangeBusinessStatusResponse;
import webcast.api.partnership.ClickAttributionResponse;
import webcast.api.partnership.DropsDetailResponse;
import webcast.api.partnership.DropsListResponse;
import webcast.api.partnership.DropsReportResponse;
import webcast.api.partnership.EsportsHighlightVideosResponse;
import webcast.api.partnership.UserInfoResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface GameLivePartnershipRetrofitApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/partnership/change_business_status/")
    C11NZ<C470590Icr<ChangeBusinessStatusResponse>> addGamePartnershipBusinessStatus(@InterfaceC1501050pAF("action") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/partnership/click_attribution_report/")
    C11NZ<C470590Icr<ClickAttributionResponse.ResponseData>> clickAttributionReport(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("room_id") String str2, @InterfaceC1501050pAF("game_id") String str3, @InterfaceC1501050pAF("task_id") String str4, @InterfaceC1501050pAF("ad_id") String str5, @InterfaceC1501050pAF("ua") String str6, @InterfaceC1501050pAF("creator_id") String str7, @InterfaceC1501050pAF("enter_from") int i2, @InterfaceC1501050pAF("touch_point") int i3, @InterfaceC1501050pAF("log_extra") String str8, @InterfaceC1501050pAF("promote_ad_type") String str9);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/partnership/drops_report/")
    C11NZ<C470590Icr<DropsReportResponse>> dropsTaskReport(@InterfaceC1501050pAF("drops_id") String str, @InterfaceC1501050pAF("round") int i, @InterfaceC1501050pAF("anchor_id") String str2, @InterfaceC1501050pAF("room_id") String str3, @InterfaceC1501050pAF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i2);

    @InterfaceC1501160pAQ("/webcast/partnership/anchor_info/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    C11NZ<C470590Icr<AnchorInfoResponse.ResponseData>> fetchPartnershipAnchorInfo(@InterfaceC1501070pAH("game_tag_id") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/game_station/download/")
    C11NZ<C470590Icr<PartnershipDownloadResponse>> gameStationDownload(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("src_id") String str, @InterfaceC1501050pAF("site_id") String str2, @InterfaceC1501050pAF("game_id") String str3, @InterfaceC1501050pAF("game_tag_id") String str4, @InterfaceC1501050pAF("ad_id") String str5, @InterfaceC1501050pAF("ua") String str6, @InterfaceC1501050pAF("author_id") String str7, @InterfaceC1501050pAF("room_id") String str8, @InterfaceC1501050pAF("item_id") String str9, @InterfaceC1501050pAF("promote_task_id") String str10, @InterfaceC1501050pAF("log_extra") String str11, @InterfaceC1501050pAF("extra_params") String str12, @InterfaceC1501050pAF("enter_from") String str13, @InterfaceC1501050pAF("touch_point") int i2, @InterfaceC1501050pAF("promote_ad_type") String str14);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/game_station/ttcm/download/")
    C11NZ<C470590Icr<PartnershipDownloadResponse>> gameTtcmDownload(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) String str, @InterfaceC1501050pAF("src_id") String str2, @InterfaceC1501050pAF("site_id") String str3, @InterfaceC1501050pAF("game_id") String str4, @InterfaceC1501050pAF("ad_id") String str5, @InterfaceC1501050pAF("ua") String str6, @InterfaceC1501050pAF("author_id") String str7);

    @InterfaceC1501160pAQ("/webcast/partnership/anchor_check_partnership_jump/")
    AbstractC19484711Kz<C470590Icr<AnchorCheckPartnershipJumpResponse.ResponseData>> getAnchorCheckPartnershipJump(@InterfaceC1501070pAH("entrance_source") int i, @InterfaceC1501070pAH("first_click") boolean z);

    @InterfaceC1501160pAQ("/webcast/partnership/anchor_partnership_tasks/")
    AbstractC19484711Kz<C470590Icr<AnchorPartnershipTasksResponse.ResponseData>> getAnchorPartnershipTasks();

    @InterfaceC1501160pAQ("/webcast/partnership/esports/v2/highlight_videos/")
    C11NZ<C470590Icr<EsportsHighlightVideosResponse.ResponseData>> getEsportsHighlightVideos(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("author_id") String str2, @InterfaceC1501070pAH("pull_type") int i, @InterfaceC1501070pAH("pull_score") long j);

    @InterfaceC1501160pAQ
    @InterfaceC1501310pAf({"x-tt-dataflow-id: 671088652"})
    C0X9S<TypedInput> performGet(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC2175608fi Map<String, String> map2, @InterfaceC820680WHi boolean z);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/v1/before_post/report/")
    C11NZ<n> postGameFrame(@InterfaceC1501050pAF("creation_id") String str, @InterfaceC1501050pAF("file_uri") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/partnership/change_business_status/")
    C0X9S<C470590Icr<ChangeBusinessStatusResponse>> removeGamePartnershipBusinessStatus(@InterfaceC1501050pAF("action") int i);

    @InterfaceC1501160pAQ("webcast/partnership/anchor_room_info")
    C11NZ<C470590Icr<AnchorRoomInfoResponse.ResponseData>> requestAnchorRoomInfo(@InterfaceC1501070pAH("room_id") String str);

    @InterfaceC1501160pAQ("/webcast/partnership/anchor_toggle_info")
    C11NZ<C470590Icr<AnchorToggleInfoResponse.ResponseData>> requestAnchorToggleInfo(@InterfaceC1501070pAH("game_tag_id") long j, @InterfaceC1501070pAH("live_mode") int i);

    @InterfaceC1501160pAQ("/webcast/partnership/audience_room_info")
    C11NZ<C470590Icr<n>> requestAudienceRoomInfo(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("anchor_uid") String str2, @InterfaceC1501070pAH("ad_id") String str3, @InterfaceC1501070pAH("ua") String str4);

    @InterfaceC1501160pAQ("/webcast/partnership/drops_detail/")
    C11NZ<C470590Icr<DropsDetailResponse.ResponseData>> requestDropsDetail(@InterfaceC1501070pAH("drops_id") String str);

    @InterfaceC1501160pAQ("/webcast/partnership/drops_list/")
    C11NZ<C470590Icr<DropsListResponse.ResponseData>> requestDropsList(@InterfaceC1501070pAH("drop_mode") int i);

    @InterfaceC1501160pAQ("/webcast/partnership/anchor_events/")
    C11NZ<C470590Icr<AnchorEventsResponse.ResponseData>> requestEventInfo(@InterfaceC1501070pAH("event_mode") int i);

    @InterfaceC1501160pAQ("/webcast/partnership/partnership_info/")
    C11NZ<C470590Icr<AnchorPartnershipInfoResponse>> requestGetAnchorPartnershipInfo();

    @InterfaceC1501160pAQ("/webcast/partnership/anchor_tasks/")
    AbstractC19484711Kz<C470590Icr<AnchorTasksResponse>> requestGetAnchorTasks(@InterfaceC1501070pAH("status_filter") long j);

    @InterfaceC1501160pAQ("/webcast/partnership/audience_room_tasks/")
    AbstractC19484711Kz<C470590Icr<n>> requestGetAudienceTasks(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/partnership/user_info/")
    C11NZ<C470590Icr<UserInfoResponse.ResponseData>> requestUserInfo();

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/partnership/download/")
    C11NZ<C470590Icr<PartnershipDownloadResponse>> sendClickDownloadEvent(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("audience_uid") long j2, @InterfaceC1501050pAF("game_id") long j3, @InterfaceC1501050pAF("task_id") String str, @InterfaceC1501050pAF("ad_id") String str2, @InterfaceC1501050pAF("did") String str3, @InterfaceC1501050pAF("anchor_id") String str4, @InterfaceC1501050pAF("platform") String str5, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) String str6);
}
