package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.RankUpdateMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RankUpdateMessage_ValidRanks_ProtoDecoder implements C0IMD<RankUpdateMessage.ValidRanks> {
    public static RankUpdateMessage.ValidRanks LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RankUpdateMessage.ValidRanks validRanks = new RankUpdateMessage.ValidRanks();
        validRanks.rankTypes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        validRanks.rankTypes.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                    }
                } else {
                    validRanks.isEffect = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return validRanks;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RankUpdateMessage.ValidRanks validRanks) {
        RankUpdateMessage.ValidRanks validRanks2 = validRanks;
        if (validRanks2.rankTypes == null) {
            validRanks2.rankTypes = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final RankUpdateMessage.ValidRanks LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankUpdateMessage.ValidRanks validRanks, List list) {
    }
}
