package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.im.KickOutBizContent;
import webcast.im._JoinRoomDirectBizContent_ProtoDecoder;
import webcast.im._KickOutBizContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiLiveContent_ProtoDecoder implements C0IMD<MultiLiveContent> {
    public static MultiLiveContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiLiveContent multiLiveContent = new MultiLiveContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        multiLiveContent.applyIMContent = _ApplyBizContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        multiLiveContent.inviteIMContent = _InviteBizContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        multiLiveContent.replyIMContent = _ReplyBizContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        multiLiveContent.permitIMContent = _PermitBizContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        multiLiveContent.joinDirectIMContent = _JoinDirectBizContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        multiLiveContent.kickOutBizContent = _KickOutBizContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        multiLiveContent.joinRoomDirectBizContent = _JoinRoomDirectBizContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiLiveContent;
            }
        }
    }

    public static void LJ(MultiLiveContent multiLiveContent) {
        User user;
        User user2;
        User user3;
        ApplyBizContent applyBizContent = multiLiveContent.applyIMContent;
        if (applyBizContent != null && (user3 = applyBizContent.user) != null) {
            _User_ProtoDecoder.LJ(user3);
        }
        InviteBizContent inviteBizContent = multiLiveContent.inviteIMContent;
        if (inviteBizContent != null) {
            User user4 = inviteBizContent.operatorUserInfo;
            if (user4 != null) {
                _User_ProtoDecoder.LJ(user4);
            }
            User user5 = inviteBizContent.inviteeUserInfo;
            if (user5 != null) {
                _User_ProtoDecoder.LJ(user5);
            }
        }
        ReplyBizContent replyBizContent = multiLiveContent.replyIMContent;
        if (replyBizContent != null && (user2 = replyBizContent.replyUserInfo) != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        PermitBizContent permitBizContent = multiLiveContent.permitIMContent;
        if (permitBizContent != null && (user = permitBizContent.operatorUserInfo) != null) {
            _User_ProtoDecoder.LJ(user);
        }
        KickOutBizContent kickOutBizContent = multiLiveContent.kickOutBizContent;
        if (kickOutBizContent != null) {
            User user6 = kickOutBizContent.operatorUserInfo;
            if (user6 != null) {
                _User_ProtoDecoder.LJ(user6);
            }
            User user7 = kickOutBizContent.kickPlayerUserInfo;
            if (user7 != null) {
                _User_ProtoDecoder.LJ(user7);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiLiveContent multiLiveContent) {
        LJ(multiLiveContent);
    }

    @Override // X.C0IMD
    public final MultiLiveContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiLiveContent multiLiveContent, List list) {
    }
}
