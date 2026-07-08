package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C926820aE4;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageReq;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageResp;
import com.bytedance.android.livesdk.model.message.linkcore.ApplyRequestResponse;
import com.bytedance.android.livesdk.model.message.linkcore.CancelApplyResponse;
import com.bytedance.android.livesdk.model.message.linkcore.CancelInviteResponse;
import com.bytedance.android.livesdk.model.message.linkcore.ChangeLayoutResp;
import com.bytedance.android.livesdk.model.message.linkcore.ChangePositionResp;
import com.bytedance.android.livesdk.model.message.linkcore.CreateChannelResponse;
import com.bytedance.android.livesdk.model.message.linkcore.DestroyRequestResponse;
import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import com.bytedance.android.livesdk.model.message.linkcore.JoinChannelResp;
import com.bytedance.android.livesdk.model.message.linkcore.JoinDirectResp;
import com.bytedance.android.livesdk.model.message.linkcore.KickOutResponse;
import com.bytedance.android.livesdk.model.message.linkcore.LeaveRequestResponse;
import com.bytedance.android.livesdk.model.message.linkcore.PermitResponse;
import com.bytedance.android.livesdk.model.message.linkcore.ReplyResponse;
import tikcast.linkmic.controller.CancelJoinGroupReq;
import tikcast.linkmic.controller.CancelJoinGroupResp;
import tikcast.linkmic.controller.JoinGroupReq;
import tikcast.linkmic.controller.JoinGroupResp;
import tikcast.linkmic.controller.KickOutAllGuestsParam;
import tikcast.linkmic.controller.KickOutAllGuestsResp;
import tikcast.linkmic.controller.LeaveJoinGroupReq;
import tikcast.linkmic.controller.LeaveJoinGroupResp;
import tikcast.linkmic.controller.MGetABInfosReq;
import tikcast.linkmic.controller.MGetABInfosResp;
import tikcast.linkmic.controller.MigrateGroupReq;
import tikcast.linkmic.controller.MigrateGroupResp;
import tikcast.linkmic.controller.PermitJoinGroupReq;
import tikcast.linkmic.controller.PermitJoinGroupResp;
import tikcast.linkmic.controller.RechargeReq;
import tikcast.linkmic.controller.RechargeResp;
import tikcast.linkmic.controller.ResumeReq;
import tikcast.linkmic.controller.ResumeResp;

/* JADX INFO: loaded from: classes.dex */
public interface LinkMicApi {
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/apply/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<ApplyRequestResponse>> applyRequest(@InterfaceC1485405rg ApplyRequestParam applyRequestParam);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/cancel_apply/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<CancelApplyResponse>> cancelApply(@InterfaceC1485405rg CancelApplyParam cancelApplyParam);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/cancel_invite/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<CancelInviteResponse>> cancelInvite(@InterfaceC1485405rg CancelInviteParam cancelInviteParam);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/tikcast/linkmic/cancel_group/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<CancelJoinGroupResp>> cancelJoinGroup(@InterfaceC1485405rg CancelJoinGroupReq cancelJoinGroupReq);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/change_layout/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<ChangeLayoutResp>> changeLayout(@InterfaceC1485405rg ChangeLayoutParam changeLayoutParam);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/change_position/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<ChangePositionResp>> changePosition(@InterfaceC1485405rg ChangePositionParam changePositionParam);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/create_channel/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<CreateChannelResponse>> crateChannelRequest(@InterfaceC1485405rg CreateChannelParam createChannelParam);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/finish/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<DestroyRequestResponse>> destroyChannelRequest(@InterfaceC1485405rg DestroyChannelParam destroyChannelParam);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/tikcast/linkmic/mget_ab_infos/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<MGetABInfosResp>> getRtcAbInfo(@InterfaceC1485405rg MGetABInfosReq mGetABInfosReq);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/invite/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<InviteResponse>> invite(@InterfaceC1485405rg InviteParam inviteParam);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/join_channel/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<JoinChannelResp>> joinChannel(@InterfaceC1485405rg JoinChannelParam joinChannelParam);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/join_direct/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<JoinDirectResp>> joinDirect(@InterfaceC1485405rg JoinDirectParam joinDirectParam);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/tikcast/linkmic/join_group/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<JoinGroupResp>> joinGroup(@InterfaceC1485405rg JoinGroupReq joinGroupReq);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/kick_out/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<KickOutResponse>> kickOut(@InterfaceC1485405rg KickOutParam kickOutParam);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/kick_out_all_guests/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<KickOutAllGuestsResp>> kickOutAll(@InterfaceC1485405rg KickOutAllGuestsParam kickOutAllGuestsParam);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/leave/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<LeaveRequestResponse>> leaveChannelRequest(@InterfaceC1485405rg LeaveChannelParam leaveChannelParam);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/tikcast/linkmic/leave_group/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<LeaveJoinGroupResp>> leaveJoinGroup(@InterfaceC1485405rg LeaveJoinGroupReq leaveJoinGroupReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/tikcast/linkmic/migrate_group/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<MigrateGroupResp>> migrateGroup(@InterfaceC1485405rg MigrateGroupReq migrateGroupReq);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/permit/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<PermitResponse>> permitApply(@InterfaceC1485405rg PermitParam permitParam);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/tikcast/linkmic/permit_group/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<PermitJoinGroupResp>> permitJoinGroup(@InterfaceC1485405rg PermitJoinGroupReq permitJoinGroupReq);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/recharge/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<RechargeResp>> recharge(@InterfaceC1485405rg RechargeReq rechargeReq);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/reply/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<ReplyResponse>> replyInvite(@InterfaceC1485405rg ReplyInviteParam replyInviteParam);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/tikcast/linkmic/report_link_message/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<ReportLinkMessageResp>> reportLinkMsg(@InterfaceC1485405rg ReportLinkMessageReq reportLinkMessageReq);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/tikcast/linkmic/resume/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<ResumeResp>> resume(@InterfaceC1485405rg ResumeReq resumeReq);
}
