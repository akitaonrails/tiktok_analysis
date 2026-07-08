package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ParagraphLayout_ProtoDecoder implements C0IMD<ParagraphLayout> {
    public static ParagraphLayout LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ParagraphLayout paragraphLayout = new ParagraphLayout();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        paragraphLayout.wrapMode = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        paragraphLayout.width = _SizeSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        paragraphLayout.height = _SizeSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        paragraphLayout.startNewRow = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        paragraphLayout.rowAlign = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        paragraphLayout.contentAlignX = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        paragraphLayout.shrink = _ParagraphLayout_ShrinkSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return paragraphLayout;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ParagraphLayout paragraphLayout) {
    }

    @Override // X.C0IMD
    public final ParagraphLayout LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ParagraphLayout paragraphLayout, List list) {
    }
}
