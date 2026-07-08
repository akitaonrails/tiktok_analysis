package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicAudienceNoticeMessage_ProtoDecoder implements C0IMD<LinkMicAudienceNoticeMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicAudienceNoticeMessage linkMicAudienceNoticeMessage) {
        User user;
        User user2;
        LinkMicAudienceNoticeMessage linkMicAudienceNoticeMessage2 = linkMicAudienceNoticeMessage;
        CommonMessageData commonMessageData = linkMicAudienceNoticeMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide = linkMicAudienceNoticeMessage2.inviteGuide;
        if (linkMicAudienceInviteGuide != null && (user2 = linkMicAudienceInviteGuide.user) != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        LinkmicAudienceInviteGroupChatMemberGuide linkmicAudienceInviteGroupChatMemberGuide = linkMicAudienceNoticeMessage2.groupChatMemberInviteGuide;
        if (linkmicAudienceInviteGroupChatMemberGuide != null && linkmicAudienceInviteGroupChatMemberGuide.groupMemberUserIds == null) {
            linkmicAudienceInviteGroupChatMemberGuide.groupMemberUserIds = new ArrayList();
        }
        LinkmicAudienceApplyGuide linkmicAudienceApplyGuide = linkMicAudienceNoticeMessage2.applyGuide;
        if (linkmicAudienceApplyGuide != null && (user = linkmicAudienceApplyGuide.user) != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final LinkMicAudienceNoticeMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicAudienceNoticeMessage linkMicAudienceNoticeMessage = new LinkMicAudienceNoticeMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkMicAudienceNoticeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkMicAudienceNoticeMessage.noticeType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        linkMicAudienceNoticeMessage.turnOnGuide = _LinkMicAudienceNoticeMessage_LinkMicAudienceTurnOnGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        linkMicAudienceNoticeMessage.inviteGuide = _LinkMicAudienceNoticeMessage_LinkMicAudienceInviteGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        linkMicAudienceNoticeMessage.groupChatMemberInviteGuide = _LinkmicAudienceInviteGroupChatMemberGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        linkMicAudienceNoticeMessage.applyGuide = _LinkmicAudienceApplyGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicAudienceNoticeMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicAudienceNoticeMessage linkMicAudienceNoticeMessage, List list) {
    }
}
