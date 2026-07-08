package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ColorBackground_ProtoDecoder implements C0IMD<ColorBackground> {
    public static ColorBackground LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ColorBackground colorBackground = new ColorBackground();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            colorBackground.padding = _EdgeInsets_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        colorBackground.radius = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                    }
                } else {
                    colorBackground.color = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return colorBackground;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ColorBackground colorBackground) {
    }

    @Override // X.C0IMD
    public final ColorBackground LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ColorBackground colorBackground, List list) {
    }
}
