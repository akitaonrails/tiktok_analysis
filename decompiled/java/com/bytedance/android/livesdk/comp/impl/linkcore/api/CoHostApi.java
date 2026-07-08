package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkmicListResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.PermitResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.ResumeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CancelResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiCancelResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CoHostInviteDetailedExtra;
import com.bytedance.scene.Scene;
import webcast.api.linkmic.ApplyResponse;
import webcast.api.linkmic.KickOutResponse;
import webcast.api.linkmic.LeaveResponse;

/* JADX INFO: loaded from: classes.dex */
public interface CoHostApi {
    @InterfaceC1501160pAQ("/webcast/linkmic/apply/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<BaseResponse<ApplyResponse.ResponseData, CoHostInviteDetailedExtra>> apply(@InterfaceC1501070pAH("to_room_id") long j, @InterfaceC1501070pAH("to_user_id") long j2, @InterfaceC1501070pAH("room_id") long j3, @InterfaceC1501070pAH("source_type") long j4, @InterfaceC1501070pAH("effective_seconds") long j5, @InterfaceC1501070pAH("need_withdraw") boolean z, @InterfaceC1501070pAH("transparent_extra") String str, @InterfaceC1501070pAH("tag_type") int i, @InterfaceC1501070pAH("tag_value") String str2, @InterfaceC1501070pAH("check_perception_center") boolean z2, @InterfaceC1501070pAH("client_log_id") String str3);

    @InterfaceC1501160pAQ("/webcast/linkmic/cancel/")
    AbstractC19484711Kz<C470590Icr<CancelResponse>> cancel(@InterfaceC1501070pAH("channel_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("to_room_id") long j3, @InterfaceC1501070pAH("to_user_id") long j4, @InterfaceC1501070pAH("sec_to_user_id") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("action_id") long j5, @InterfaceC1501070pAH("cancel_type") int i2, @InterfaceC1501070pAH("transparent_extra") String str2);

    @InterfaceC1501160pAQ("/webcast/linkmic/invite/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<BaseResponse<LinkInviteResult, CoHostInviteDetailedExtra>> invite(@InterfaceC1501070pAH("vendor") int i, @InterfaceC1501070pAH("to_room_id") long j, @InterfaceC1501070pAH("to_user_id") long j2, @InterfaceC1501070pAH("sec_to_user_id") String str, @InterfaceC1501070pAH("room_id") long j3, @InterfaceC1501070pAH("invite_type") int i2, @InterfaceC1501070pAH("match_type") int i3, @InterfaceC1501070pAH("invite_more") boolean z, @InterfaceC1501070pAH("invite_from_channel_id") long j4, @InterfaceC1501070pAH("effective_seconds") int i4, @InterfaceC1501070pAH("need_withdraw") boolean z2, @InterfaceC1501070pAH("transparent_extra") String str2, @InterfaceC1501070pAH("tag_type") int i5, @InterfaceC1501070pAH("tag_value") String str3, @InterfaceC1501070pAH("check_perception_center") boolean z3, @InterfaceC1501070pAH("client_log_id") String str4, @InterfaceC1501070pAH("algo_request_id") String str5);

    @InterfaceC1501160pAQ("/webcast/linkmic/kick_out/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<C470590Icr<KickOutResponse.ResponseData>> kickOut(@InterfaceC1501070pAH("channel_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("to_user_id") long j3, @InterfaceC1501070pAH("to_room_id") long j4, @InterfaceC1501070pAH("kickout_type") int i, @InterfaceC1501070pAH("transparent_extra") String str);

    @InterfaceC1501160pAQ("/webcast/linkmic/leave/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<C470590Icr<LeaveResponse.ResponseData>> leave(@InterfaceC1501070pAH("channel_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("not_suggest_to_uid") long j3, @InterfaceC1501070pAH("transparent_extra") String str);

    @InterfaceC1501160pAQ("/webcast/linkmic/multi_cancel/")
    AbstractC19484711Kz<C470590Icr<MultiCancelResponse>> multiCancel(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("cancel_users") String str, @InterfaceC1501070pAH("transparent_extra") String str2);

    @InterfaceC1501160pAQ("/webcast/linkmic/permit/")
    AbstractC19484711Kz<C470590Icr<PermitResponse.ResponseData>> permit(@InterfaceC1501070pAH("channel_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("permit_status") int i, @InterfaceC1501070pAH("apply_user_id") long j3, @InterfaceC1501070pAH("apply_room_id") long j4, @InterfaceC1501070pAH("action_id") long j5, @InterfaceC1501070pAH("transparent_extra") String str);

    @InterfaceC1501160pAQ("/webcast/linkmic/reply/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<C470590Icr<LinkReplyResult>> reply(@InterfaceC1501070pAH("channel_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("reply_status") int i, @InterfaceC1501070pAH("invite_user_id") long j3, @InterfaceC1501070pAH("action_id") long j4, @InterfaceC1501070pAH("invite_room_id") long j5, @InterfaceC1501070pAH("transparent_extra") String str, @InterfaceC1501070pAH("algo_request_id") String str2);

    @InterfaceC1501160pAQ("/webcast/linkmic/resume/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<C470590Icr<ResumeResponse.ResponseData>> resume(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("user_id") long j2);

    @InterfaceC1501160pAQ("/webcast/linkmic/list/")
    @C09SO(EnumC1846380y9E.LINK_MIC)
    AbstractC19484711Kz<C470590Icr<LinkmicListResponse>> updateUserList(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("channel_id") long j2);
}
