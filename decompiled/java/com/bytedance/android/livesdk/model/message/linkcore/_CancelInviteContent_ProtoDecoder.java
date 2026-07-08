package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CancelInviteContent_ProtoDecoder implements C0IMD<CancelInviteContent> {
    public static CancelInviteContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CancelInviteContent cancelInviteContent = new CancelInviteContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        cancelInviteContent.inviter = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        cancelInviteContent.inviterLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        cancelInviteContent.inviteeLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        cancelInviteContent.inviteSeqId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        cancelInviteContent.invitee = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        cancelInviteContent.inviteeLinkerSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cancelInviteContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CancelInviteContent cancelInviteContent) {
    }

    @Override // X.C0IMD
    public final CancelInviteContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CancelInviteContent cancelInviteContent, List list) {
    }
}
