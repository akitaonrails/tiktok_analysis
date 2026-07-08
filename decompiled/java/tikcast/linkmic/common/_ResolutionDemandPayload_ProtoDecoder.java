package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ResolutionDemandPayload_ProtoDecoder implements C0IMD<ResolutionDemandPayload> {
    public static ResolutionDemandPayload LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ResolutionDemandPayload resolutionDemandPayload = new ResolutionDemandPayload();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        resolutionDemandPayload.action = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        resolutionDemandPayload.widthRatio = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                        break;
                    case 3:
                        resolutionDemandPayload.heightRatio = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                        break;
                    case 4:
                        resolutionDemandPayload.configId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        resolutionDemandPayload.layoutKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        resolutionDemandPayload.spotId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        resolutionDemandPayload.canvasWidth = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        resolutionDemandPayload.canvasHeight = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        resolutionDemandPayload.timestampMs = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return resolutionDemandPayload;
            }
        }
    }

    @Override // X.C0IMD
    public final ResolutionDemandPayload LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ResolutionDemandPayload resolutionDemandPayload) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ResolutionDemandPayload resolutionDemandPayload, List list) {
    }
}
