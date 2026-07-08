package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OwnerRankInfo_ProtoDecoder implements C0IMD<OwnerRankInfo> {
    public static OwnerRankInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OwnerRankInfo ownerRankInfo = new OwnerRankInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            ownerRankInfo.addScore = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        ownerRankInfo.score = c1516680pZS.LJIIJJI();
                    }
                } else {
                    ownerRankInfo.rank = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ownerRankInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final OwnerRankInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(OwnerRankInfo ownerRankInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OwnerRankInfo ownerRankInfo, List list) {
    }
}
