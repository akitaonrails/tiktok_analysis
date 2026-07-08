package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class _AILivePreviewHighlightVideoInfo_ProtoDecoder implements C0IMD<AILivePreviewHighlightVideoInfo> {
    public static AILivePreviewHighlightVideoInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AILivePreviewHighlightVideoInfo aILivePreviewHighlightVideoInfo = new AILivePreviewHighlightVideoInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        aILivePreviewHighlightVideoInfo.url = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        aILivePreviewHighlightVideoInfo.duration = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                        break;
                    case 3:
                        aILivePreviewHighlightVideoInfo.urlKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        aILivePreviewHighlightVideoInfo.bitRate = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        aILivePreviewHighlightVideoInfo.size = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        aILivePreviewHighlightVideoInfo.codecType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        aILivePreviewHighlightVideoInfo.format = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        aILivePreviewHighlightVideoInfo.height = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        aILivePreviewHighlightVideoInfo.width = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        aILivePreviewHighlightVideoInfo.coverUri = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return aILivePreviewHighlightVideoInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final AILivePreviewHighlightVideoInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AILivePreviewHighlightVideoInfo aILivePreviewHighlightVideoInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AILivePreviewHighlightVideoInfo aILivePreviewHighlightVideoInfo, List list) {
    }
}
