package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnigmaBattleExtraInfo_ProtoDecoder implements C0IMD<EnigmaBattleExtraInfo> {
    public static EnigmaBattleExtraInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnigmaBattleExtraInfo enigmaBattleExtraInfo = new EnigmaBattleExtraInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        enigmaBattleExtraInfo.isGiftFromEnigma = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    enigmaBattleExtraInfo.hasStarted = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enigmaBattleExtraInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final EnigmaBattleExtraInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EnigmaBattleExtraInfo enigmaBattleExtraInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaBattleExtraInfo enigmaBattleExtraInfo, List list) {
    }
}
