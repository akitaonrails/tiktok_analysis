package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _InviteTopHostInfo_ProtoDecoder implements C0IMD<InviteTopHostInfo> {
    public static InviteTopHostInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        InviteTopHostInfo inviteTopHostInfo = new InviteTopHostInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        inviteTopHostInfo.topIndex = Long.valueOf(c1516680pZS.LJIIJJI());
                    }
                } else {
                    inviteTopHostInfo.rankType = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return inviteTopHostInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final InviteTopHostInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(InviteTopHostInfo inviteTopHostInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InviteTopHostInfo inviteTopHostInfo, List list) {
    }
}
