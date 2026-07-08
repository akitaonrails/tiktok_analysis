package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TPTuxImage_ProtoDecoder implements C0IMD<TPTuxImage> {
    public static TPTuxImage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TPTuxImage tPTuxImage = new TPTuxImage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        tPTuxImage.size = _TPSize_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    tPTuxImage.protocol = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tPTuxImage;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TPTuxImage tPTuxImage) {
    }

    @Override // X.C0IMD
    public final TPTuxImage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TPTuxImage tPTuxImage, List list) {
    }
}
