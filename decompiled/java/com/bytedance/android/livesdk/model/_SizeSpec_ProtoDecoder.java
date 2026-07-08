package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SizeSpec_ProtoDecoder implements C0IMD<SizeSpec> {
    public static SizeSpec LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SizeSpec sizeSpec = new SizeSpec();
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
                                sizeSpec.maxSize = _MeasureSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            sizeSpec.minSize = _MeasureSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        sizeSpec.value = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                    }
                } else {
                    sizeSpec.mode = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sizeSpec;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SizeSpec sizeSpec) {
    }

    @Override // X.C0IMD
    public final SizeSpec LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SizeSpec sizeSpec, List list) {
    }
}
