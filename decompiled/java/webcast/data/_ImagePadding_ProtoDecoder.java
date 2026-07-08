package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _ImagePadding_ProtoDecoder implements C0IMD<ImagePadding> {
    public static ImagePadding LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ImagePadding imagePadding = new ImagePadding();
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
                                imagePadding.right = c1516680pZS.LJIIJ();
                            }
                        } else {
                            imagePadding.left = c1516680pZS.LJIIJ();
                        }
                    } else {
                        imagePadding.bottom = c1516680pZS.LJIIJ();
                    }
                } else {
                    imagePadding.top = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return imagePadding;
            }
        }
    }

    @Override // X.C0IMD
    public final ImagePadding LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ImagePadding imagePadding) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ImagePadding imagePadding, List list) {
    }
}
