package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FlowSpec_ProtoDecoder implements C0IMD<FlowSpec> {
    public static FlowSpec LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FlowSpec flowSpec = new FlowSpec();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        flowSpec.rowAlignX = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        flowSpec.direction = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        flowSpec.rowAlignY = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        flowSpec.interItemSpacing = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 5:
                        flowSpec.rowSpacing = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 6:
                        flowSpec.overflow = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        flowSpec.width = _SizeSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        flowSpec.height = _SizeSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return flowSpec;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FlowSpec flowSpec) {
    }

    @Override // X.C0IMD
    public final FlowSpec LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FlowSpec flowSpec, List list) {
    }
}
