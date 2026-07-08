package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AILivePreviewHighlight_ProtoDecoder implements C0IMD<AILivePreviewHighlight> {
    public static AILivePreviewHighlight LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AILivePreviewHighlight aILivePreviewHighlight = new AILivePreviewHighlight();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        aILivePreviewHighlight.fragmentId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        aILivePreviewHighlight.highlightUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        aILivePreviewHighlight.sourceType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        aILivePreviewHighlight.createTimestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        aILivePreviewHighlight.expireTimestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        aILivePreviewHighlight.resultKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        aILivePreviewHighlight.videoInfo = _AILivePreviewHighlightVideoInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        aILivePreviewHighlight.videoType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return aILivePreviewHighlight;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AILivePreviewHighlight aILivePreviewHighlight) {
    }

    @Override // X.C0IMD
    public final AILivePreviewHighlight LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AILivePreviewHighlight aILivePreviewHighlight, List list) {
    }
}
