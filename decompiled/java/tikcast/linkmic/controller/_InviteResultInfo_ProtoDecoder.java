package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._ErrorInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _InviteResultInfo_ProtoDecoder implements C0IMD<InviteResultInfo> {
    public static InviteResultInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        InviteResultInfo inviteResultInfo = new InviteResultInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 5) {
                            if (iLJI != 7) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                inviteResultInfo.errInfo = _ErrorInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            inviteResultInfo.actionType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        inviteResultInfo.linkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    inviteResultInfo.player = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return inviteResultInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(InviteResultInfo inviteResultInfo) {
    }

    @Override // X.C0IMD
    public final InviteResultInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InviteResultInfo inviteResultInfo, List list) {
    }
}
