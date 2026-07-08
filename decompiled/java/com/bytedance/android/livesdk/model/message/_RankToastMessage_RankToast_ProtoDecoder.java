package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.RankToastMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RankToastMessage_RankToast_ProtoDecoder implements C0IMD<RankToastMessage.RankToast> {
    public static RankToastMessage.RankToast LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RankToastMessage.RankToast rankToast = new RankToastMessage.RankToast();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        rankToast.shouldToast = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    rankToast.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rankToast;
            }
        }
    }

    @Override // X.C0IMD
    public final RankToastMessage.RankToast LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RankToastMessage.RankToast rankToast) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankToastMessage.RankToast rankToast, List list) {
    }
}
