package com.bytedance.android.livesdk.chatroom.api;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.liveinteract.multilive.model.ActivityBannerResponse;
import com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionResponseData;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.android.live.liveinteract.multilive.model.HostCheckOtherAudienceMultiGuestPermissionResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestBannerParams;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestBannerResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateGuestSettingResponse;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInviteClearInviteeReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInviteClearInviteeResp;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.MultiGuestAnchorPermissionResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.chatroom.model.interact.audience.LinkmicSettingResult;
import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface LinkApi {
    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/host_permission/")
    AbstractC19484711Kz<BaseResponse<MultiGuestAnchorPermissionResponse, CheckPermissionExtra>> checkAnchorSelfPermission(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("app_id") long j2, @InterfaceC1501070pAH("live_id") long j3);

    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/audience_permission/")
    AbstractC19484711Kz<BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra>> checkAudienceSelfPermission(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("app_id") long j2, @InterfaceC1501070pAH("live_id") long j3);

    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/host_check_other_audience_permission/")
    AbstractC19484711Kz<HostCheckOtherAudienceMultiGuestPermissionResponse> checkOthersPermission(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("app_id") long j2, @InterfaceC1501070pAH("live_id") long j3, @InterfaceC1501070pAH("check_user_id") long j4, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/fan_ticket_ranklist/")
    AbstractC19484711Kz<FanTicketRanklistResponse> getFanTicketRankList(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("guest_user_id") long j2, @InterfaceC1501070pAH("anchor_id") long j3, @InterfaceC1501070pAH("channel_id") long j4, @InterfaceC1501070pAH("linkmic_id") String str, @InterfaceC1501070pAH("show_id") String str2, @InterfaceC1501070pAH("play_id") String str3, @InterfaceC1501070pAH("play_scene") int i);

    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/get_guest_setting/")
    AbstractC19484711Kz<GetGuestSettingResponse> getGuestSetting();

    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/activity_banner/")
    AbstractC19484711Kz<C470590Icr<ActivityBannerResponse.ResponseData>> getMultiGuestActivityInfo(@InterfaceC1501070pAH("activity_name") String str);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/mg_banner/")
    AbstractC19484711Kz<C470590Icr<MultiGuestBannerResponse.ResponseData>> getMultiGuestBanner(@InterfaceC1485405rg MultiGuestBannerParams multiGuestBannerParams);

    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/get_settings/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    C11NZ<C470590Icr<LinkmicSettingResult>> isShowGuestLinkHint(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("owner_id") long j2, @InterfaceC1501070pAH("sec_owner_id") String str, @InterfaceC1501070pAH("get_ab_params") boolean z);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/guest_invite_clear_invitee/")
    AbstractC19484711Kz<C470590Icr<GuestInviteClearInviteeResp.ResponseData>> postInviteUserExitRoom(@InterfaceC1485405rg GuestInviteClearInviteeReq guestInviteClearInviteeReq);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/linkmic_multi_guest/reserve/")
    AbstractC19484711Kz<C470590Icr<MultiGuestReserveResponse.ResponseData>> reserve(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("app_id") long j, @InterfaceC1501050pAF("live_id") long j2, @InterfaceC1501050pAF("from_user_id") long j3, @InterfaceC1501050pAF("to_user_id") long j4, @InterfaceC1501050pAF("room_id") long j5, @InterfaceC1501050pAF("type") int i2, @InterfaceC1501050pAF("auto_follow") boolean z);

    @InterfaceC1501160pAQ("/webcast/linkmic_multi_guest/update_guest_setting/")
    AbstractC19484711Kz<UpdateGuestSettingResponse> updateGuestSetting(@InterfaceC1501130pAN Map<String, String> map);
}
