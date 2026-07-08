package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StrokeStyle_ProtoDecoder implements C0IMD<StrokeStyle> {
    public static StrokeStyle LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StrokeStyle strokeStyle = new StrokeStyle();
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
                                strokeStyle.offsetY = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                            }
                        } else {
                            strokeStyle.offsetX = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        }
                    } else {
                        strokeStyle.width = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                    }
                } else {
                    strokeStyle.color = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return strokeStyle;
            }
        }
    }

    @Override // X.C0IMD
    public final StrokeStyle LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(StrokeStyle strokeStyle) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StrokeStyle strokeStyle, List list) {
    }
}
