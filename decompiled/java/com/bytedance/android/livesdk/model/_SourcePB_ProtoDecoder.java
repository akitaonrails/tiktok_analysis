package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class _SourcePB_ProtoDecoder implements C0IMD<SourcePB> {
    public static SourcePB LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SourcePB sourcePB = new SourcePB();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        sourcePB.strategyBoardValue = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        sourcePB.strategyLiveType = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        sourcePB.strategyBoardContentType = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        sourcePB.industryId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        sourcePB.industryName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        sourcePB.promptVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        sourcePB.aigcModelVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        sourcePB.generateVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sourcePB;
            }
        }
    }

    @Override // X.C0IMD
    public final SourcePB LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SourcePB sourcePB) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SourcePB sourcePB, List list) {
    }
}
