package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CapsuleBizParamsMultiGuestInviteGuide_ProtoDecoder implements C0IMD<CapsuleBizParamsMultiGuestInviteGuide> {
    public static CapsuleBizParamsMultiGuestInviteGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CapsuleBizParamsMultiGuestInviteGuide capsuleBizParamsMultiGuestInviteGuide = new CapsuleBizParamsMultiGuestInviteGuide();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        capsuleBizParamsMultiGuestInviteGuide.inviteeUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        capsuleBizParamsMultiGuestInviteGuide.displayStrategy = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        capsuleBizParamsMultiGuestInviteGuide.linkmicAudienceInviteNoticeReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        capsuleBizParamsMultiGuestInviteGuide.noticeType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        capsuleBizParamsMultiGuestInviteGuide.turnOnGuide = _LinkMicAudienceNoticeMessage_LinkMicAudienceTurnOnGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        capsuleBizParamsMultiGuestInviteGuide.noticeGuide = _LinkMicAudienceNoticeMessage_LinkMicAudienceInviteGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        capsuleBizParamsMultiGuestInviteGuide.groupChatMemberInviteGuide = _LinkmicAudienceInviteGroupChatMemberGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return capsuleBizParamsMultiGuestInviteGuide;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CapsuleBizParamsMultiGuestInviteGuide capsuleBizParamsMultiGuestInviteGuide) {
        User user;
        CapsuleBizParamsMultiGuestInviteGuide capsuleBizParamsMultiGuestInviteGuide2 = capsuleBizParamsMultiGuestInviteGuide;
        User user2 = capsuleBizParamsMultiGuestInviteGuide2.inviteeUser;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide = capsuleBizParamsMultiGuestInviteGuide2.noticeGuide;
        if (linkMicAudienceInviteGuide != null && (user = linkMicAudienceInviteGuide.user) != null) {
            _User_ProtoDecoder.LJ(user);
        }
        LinkmicAudienceInviteGroupChatMemberGuide linkmicAudienceInviteGroupChatMemberGuide = capsuleBizParamsMultiGuestInviteGuide2.groupChatMemberInviteGuide;
        if (linkmicAudienceInviteGroupChatMemberGuide != null && linkmicAudienceInviteGroupChatMemberGuide.groupMemberUserIds == null) {
            linkmicAudienceInviteGroupChatMemberGuide.groupMemberUserIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final CapsuleBizParamsMultiGuestInviteGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CapsuleBizParamsMultiGuestInviteGuide capsuleBizParamsMultiGuestInviteGuide, List list) {
    }
}
