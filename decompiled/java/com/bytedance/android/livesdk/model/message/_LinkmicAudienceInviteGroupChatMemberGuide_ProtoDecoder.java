package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkmicAudienceInviteGroupChatMemberGuide_ProtoDecoder implements C0IMD<LinkmicAudienceInviteGroupChatMemberGuide> {
    public static LinkmicAudienceInviteGroupChatMemberGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkmicAudienceInviteGroupChatMemberGuide linkmicAudienceInviteGroupChatMemberGuide = new LinkmicAudienceInviteGroupChatMemberGuide();
        linkmicAudienceInviteGroupChatMemberGuide.groupMemberUserIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkmicAudienceInviteGroupChatMemberGuide.groupMemberUserIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        }
                    } else {
                        linkmicAudienceInviteGroupChatMemberGuide.buttonContent = _LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkmicAudienceInviteGroupChatMemberGuide.content = _LinkMicAudienceNoticeMessage_LinkMicAudienceNoticeText_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkmicAudienceInviteGroupChatMemberGuide;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkmicAudienceInviteGroupChatMemberGuide linkmicAudienceInviteGroupChatMemberGuide) {
        LinkmicAudienceInviteGroupChatMemberGuide linkmicAudienceInviteGroupChatMemberGuide2 = linkmicAudienceInviteGroupChatMemberGuide;
        if (linkmicAudienceInviteGroupChatMemberGuide2.groupMemberUserIds == null) {
            linkmicAudienceInviteGroupChatMemberGuide2.groupMemberUserIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final LinkmicAudienceInviteGroupChatMemberGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkmicAudienceInviteGroupChatMemberGuide linkmicAudienceInviteGroupChatMemberGuide, List list) {
    }
}
