package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EdgeInsets_ProtoDecoder implements C0IMD<EdgeInsets> {
    public static EdgeInsets LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EdgeInsets edgeInsets = new EdgeInsets();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                edgeInsets.left = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                            }
                        } else {
                            edgeInsets.bottom = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        }
                    } else {
                        edgeInsets.right = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                    }
                } else {
                    edgeInsets.top = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return edgeInsets;
            }
        }
    }

    @Override // X.C0IMD
    public final EdgeInsets LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EdgeInsets edgeInsets) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EdgeInsets edgeInsets, List list) {
    }
}
