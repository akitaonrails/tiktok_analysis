package webcast.data.host_board;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ImageStyle_ProtoDecoder implements C0IMD<ImageStyle> {
    public static ImageStyle LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ImageStyle imageStyle = new ImageStyle();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        imageStyle.round = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        imageStyle.radius = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        imageStyle.radiusTopLeft = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        imageStyle.radiusTopRight = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        imageStyle.radiusBottomLeft = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        imageStyle.radiusBottomRight = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return imageStyle;
            }
        }
    }

    @Override // X.C0IMD
    public final ImageStyle LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ImageStyle imageStyle) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ImageStyle imageStyle, List list) {
    }
}
