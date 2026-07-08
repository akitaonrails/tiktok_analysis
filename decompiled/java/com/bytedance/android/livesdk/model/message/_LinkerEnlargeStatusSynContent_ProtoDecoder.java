package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common._LinkerMediaChangeOperator_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerEnlargeStatusSynContent_ProtoDecoder implements C0IMD<LinkerEnlargeStatusSynContent> {
    public static LinkerEnlargeStatusSynContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent = new LinkerEnlargeStatusSynContent();
        linkerEnlargeStatusSynContent.linkedUserUiPositions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkerEnlargeStatusSynContent.isEnlarge = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        linkerEnlargeStatusSynContent.enlargeLinkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        linkerEnlargeStatusSynContent.scene = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        linkerEnlargeStatusSynContent.targetLinkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        linkerEnlargeStatusSynContent.operatorInfo = _LinkerMediaChangeOperator_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        linkerEnlargeStatusSynContent.layoutId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        linkerEnlargeStatusSynContent.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerEnlargeStatusSynContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent) {
        LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent2 = linkerEnlargeStatusSynContent;
        if (linkerEnlargeStatusSynContent2.linkedUserUiPositions == null) {
            linkerEnlargeStatusSynContent2.linkedUserUiPositions = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final LinkerEnlargeStatusSynContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent, List list) {
    }
}
