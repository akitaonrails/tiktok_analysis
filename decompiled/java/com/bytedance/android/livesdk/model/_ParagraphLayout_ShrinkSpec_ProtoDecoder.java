package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.ParagraphLayout;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ParagraphLayout_ShrinkSpec_ProtoDecoder implements C0IMD<ParagraphLayout.ShrinkSpec> {
    public static ParagraphLayout.ShrinkSpec LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ParagraphLayout.ShrinkSpec shrinkSpec = new ParagraphLayout.ShrinkSpec();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        shrinkSpec.minFontSize = c1516680pZS.LJIIJ();
                    }
                } else {
                    shrinkSpec.enable = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return shrinkSpec;
            }
        }
    }

    @Override // X.C0IMD
    public final ParagraphLayout.ShrinkSpec LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ParagraphLayout.ShrinkSpec shrinkSpec) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ParagraphLayout.ShrinkSpec shrinkSpec, List list) {
    }
}
