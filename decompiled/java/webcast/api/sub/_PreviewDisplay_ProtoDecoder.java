package webcast.api.sub;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _PreviewDisplay_ProtoDecoder implements C0IMD<PreviewDisplay> {
    public static PreviewDisplay LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PreviewDisplay previewDisplay = new PreviewDisplay();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        previewDisplay.hasSuggestedQuestion = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        previewDisplay.hasForm = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        previewDisplay.hasSub = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        previewDisplay.activeSkuCount = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        previewDisplay.hasBooking = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        previewDisplay.hasThirdPartyLink = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return previewDisplay;
            }
        }
    }

    @Override // X.C0IMD
    public final PreviewDisplay LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PreviewDisplay previewDisplay) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PreviewDisplay previewDisplay, List list) {
    }
}
