package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BusinessContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._MultiLiveContent_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import webcast.im.CancelJoinGroupContent;
import webcast.im.CohostContent;
import webcast.im.GroupChangeContent;
import webcast.im.JoinGroupContent;
import webcast.im.JoinGroupDirectContent;
import webcast.im.JoinRoomDirectContent;
import webcast.im.LeaveJoinGroupContent;
import webcast.im.P2PGroupChangeContent;
import webcast.im.PermitJoinGroupContent;
import webcast.im._CancelJoinGroupContent_ProtoDecoder;
import webcast.im._CohostContent_ProtoDecoder;
import webcast.im._GroupChangeContent_ProtoDecoder;
import webcast.im._JoinGroupContent_ProtoDecoder;
import webcast.im._JoinGroupDirectContent_ProtoDecoder;
import webcast.im._JoinRoomDirectContent_ProtoDecoder;
import webcast.im._LeaveJoinGroupContent_ProtoDecoder;
import webcast.im._LinkEnvelopeContent_ProtoDecoder;
import webcast.im._P2PGroupChangeContent_ProtoDecoder;
import webcast.im._PermitJoinGroupContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkLayerMessage_ProtoDecoder implements C0IMD<LinkLayerMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkLayerMessage linkLayerMessage) {
        AllListUser allListUser;
        RTCExtraInfo rTCExtraInfo;
        LinkLayerMessage linkLayerMessage2 = linkLayerMessage;
        CommonMessageData commonMessageData = linkLayerMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        LinkListChangeContent linkListChangeContent = linkLayerMessage2.listContent;
        if (linkListChangeContent != null) {
            _LinkListChangeContent_ProtoDecoder.LJ(linkListChangeContent);
        }
        InviteContent inviteContent = linkLayerMessage2.inviteContent;
        if (inviteContent != null && (rTCExtraInfo = inviteContent.inviteeRTCInfo) != null) {
            _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
        }
        PermitApplyContent permitApplyContent = linkLayerMessage2.permitApplyContent;
        if (permitApplyContent != null) {
            _PermitApplyContent_ProtoDecoder.LJ(permitApplyContent);
        }
        ReplyInviteContent replyInviteContent = linkLayerMessage2.replyInviteContent;
        if (replyInviteContent != null) {
            _ReplyInviteContent_ProtoDecoder.LJ(replyInviteContent);
        }
        KickOutContent kickOutContent = linkLayerMessage2.kickOutContent;
        if (kickOutContent != null) {
            _KickOutContent_ProtoDecoder.LJ(kickOutContent);
        }
        LeaveContent leaveContent = linkLayerMessage2.leaveContent;
        if (leaveContent != null) {
            _LeaveContent_ProtoDecoder.LJ(leaveContent);
        }
        JoinDirectContent joinDirectContent = linkLayerMessage2.joinDirectContent;
        if (joinDirectContent != null && (allListUser = joinDirectContent.allUsers) != null) {
            _AllListUser_ProtoDecoder.LJ(allListUser);
        }
        JoinGroupContent joinGroupContent = linkLayerMessage2.joinGroupContent;
        if (joinGroupContent != null) {
            _JoinGroupContent_ProtoDecoder.LJ(joinGroupContent);
        }
        PermitJoinGroupContent permitJoinGroupContent = linkLayerMessage2.permitGroupContent;
        if (permitJoinGroupContent != null) {
            _PermitJoinGroupContent_ProtoDecoder.LJ(permitJoinGroupContent);
        }
        CancelJoinGroupContent cancelJoinGroupContent = linkLayerMessage2.cancelGroupContent;
        if (cancelJoinGroupContent != null) {
            _CancelJoinGroupContent_ProtoDecoder.LJ(cancelJoinGroupContent);
        }
        LeaveJoinGroupContent leaveJoinGroupContent = linkLayerMessage2.leaveGroupContent;
        if (leaveJoinGroupContent != null && leaveJoinGroupContent.linkedUserUiPositions == null) {
            leaveJoinGroupContent.linkedUserUiPositions = new ArrayList();
        }
        P2PGroupChangeContent p2PGroupChangeContent = linkLayerMessage2.p2pGroupChangeContent;
        if (p2PGroupChangeContent != null) {
            _P2PGroupChangeContent_ProtoDecoder.LJ(p2PGroupChangeContent);
        }
        GroupChangeContent groupChangeContent = linkLayerMessage2.groupChangeContent;
        if (groupChangeContent != null) {
            GroupChannelAllUser groupChannelAllUser = groupChangeContent.groupUser;
            if (groupChannelAllUser != null) {
                _GroupChannelAllUser_ProtoDecoder.LJ(groupChannelAllUser);
            }
            if (groupChangeContent.linkedUserUiPositions == null) {
                groupChangeContent.linkedUserUiPositions = new ArrayList();
            }
        }
        JoinGroupDirectContent joinGroupDirectContent = linkLayerMessage2.joinGroupDirectContent;
        if (joinGroupDirectContent != null) {
            _JoinGroupDirectContent_ProtoDecoder.LJ(joinGroupDirectContent);
        }
        JoinRoomDirectContent joinRoomDirectContent = linkLayerMessage2.joinRoomDirectContent;
        if (joinRoomDirectContent != null) {
            _JoinRoomDirectContent_ProtoDecoder.LJ(joinRoomDirectContent);
        }
        BusinessContent businessContent = linkLayerMessage2.bizContent;
        if (businessContent != null) {
            MultiLiveContent multiLiveContent = businessContent.multiLiveContent;
            if (multiLiveContent != null) {
                _MultiLiveContent_ProtoDecoder.LJ(multiLiveContent);
            }
            CohostContent cohostContent = businessContent.cohostContent;
            if (cohostContent != null) {
                _CohostContent_ProtoDecoder.LJ(cohostContent);
            }
        }
    }

    @Override // X.C0IMD
    public final LinkLayerMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkLayerMessage linkLayerMessage = new LinkLayerMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    if (iLJI != 150) {
                        if (iLJI != 200) {
                            switch (iLJI) {
                                case 1:
                                    linkLayerMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case 2:
                                    linkLayerMessage.messageType = c1516680pZS.LJIIJ();
                                    break;
                                case 3:
                                    linkLayerMessage.channelId = c1516680pZS.LJIIJJI();
                                    break;
                                case 4:
                                    linkLayerMessage.scene = c1516680pZS.LJIIJ();
                                    break;
                                case 5:
                                    linkLayerMessage.source = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 6:
                                    linkLayerMessage.centerizedIdc = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 7:
                                    linkLayerMessage.rtcRoomId = c1516680pZS.LJIIJJI();
                                    break;
                                case 8:
                                    linkLayerMessage.version = c1516680pZS.LJIIJJI();
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    linkLayerMessage.linkerMode = c1516680pZS.LJIIJ();
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    linkLayerMessage.waitCrossData = C1516700pZU.LIZ(c1516680pZS);
                                    break;
                                default:
                                    switch (iLJI) {
                                        case 102:
                                            linkLayerMessage.listContent = _LinkListChangeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 103:
                                            linkLayerMessage.inviteContent = _InviteContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 104:
                                            linkLayerMessage.applyContent = _ApplyContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 105:
                                            linkLayerMessage.permitApplyContent = _PermitApplyContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 106:
                                            linkLayerMessage.replyInviteContent = _ReplyInviteContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 107:
                                            linkLayerMessage.kickOutContent = _KickOutContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 108:
                                            linkLayerMessage.cancelApplyContent = _CancelApplyContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 109:
                                            linkLayerMessage.cancelInviteContent = _CancelInviteContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 110:
                                            linkLayerMessage.leaveContent = _LeaveContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 111:
                                            linkLayerMessage.finishContent = _FinishChannelContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 112:
                                            linkLayerMessage.joinDirectContent = _JoinDirectContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 113:
                                            linkLayerMessage.joinGroupContent = _JoinGroupContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 114:
                                            linkLayerMessage.permitGroupContent = _PermitJoinGroupContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 115:
                                            linkLayerMessage.cancelGroupContent = _CancelJoinGroupContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 116:
                                            linkLayerMessage.leaveGroupContent = _LeaveJoinGroupContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 117:
                                            linkLayerMessage.p2pGroupChangeContent = _P2PGroupChangeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 118:
                                            linkLayerMessage.groupChangeContent = _GroupChangeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 119:
                                            linkLayerMessage.joinGroupDirectContent = _JoinGroupDirectContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 120:
                                            linkLayerMessage.joinRoomDirectContent = _JoinRoomDirectContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        default:
                                            C1516700pZU.LJ(c1516680pZS);
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            linkLayerMessage.bizContent = _BusinessContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        linkLayerMessage.linkEnvelopeContent = _LinkEnvelopeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkLayerMessage.createChannelContent = _CreateChannelContent_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkLayerMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkLayerMessage linkLayerMessage, List list) {
    }
}
