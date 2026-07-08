package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Img_ProtoDecoder implements C0IMD<Img> {
    public static Img LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Img img = new Img();
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
                                img.url = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            img.height = c1516680pZS.LJIIJ();
                        }
                    } else {
                        img.width = c1516680pZS.LJIIJ();
                    }
                } else {
                    img.key = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return img;
            }
        }
    }

    @Override // X.C0IMD
    public final Img LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Img img) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Img img, List list) {
    }
}
