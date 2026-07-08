package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MeasureSpec_ProtoDecoder implements C0IMD<MeasureSpec> {
    public static MeasureSpec LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MeasureSpec measureSpec = new MeasureSpec();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        measureSpec.value = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                    }
                } else {
                    measureSpec.mode = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return measureSpec;
            }
        }
    }

    @Override // X.C0IMD
    public final MeasureSpec LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MeasureSpec measureSpec) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MeasureSpec measureSpec, List list) {
    }
}
