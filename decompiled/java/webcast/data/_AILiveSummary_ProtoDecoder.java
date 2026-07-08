package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AILiveSummary_ProtoDecoder implements C0IMD<AILiveSummary> {
    public static AILiveSummary LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AILiveSummary aILiveSummary = new AILiveSummary();
        aILiveSummary.aiSummaryList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        aILiveSummary.roomLlmTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        aILiveSummary.resultKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        aILiveSummary.createTimestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        aILiveSummary.aiLiveSummarySwitch = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        aILiveSummary.aiLiveSummaryType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        aILiveSummary.aiSummaryList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        aILiveSummary.openAiSummary = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        aILiveSummary.aiLiveSummaryVersions = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        aILiveSummary.audienceSideTitleLanguage = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        aILiveSummary.highlightRequired = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return aILiveSummary;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AILiveSummary aILiveSummary) {
        AILiveSummary aILiveSummary2 = aILiveSummary;
        if (aILiveSummary2.aiSummaryList == null) {
            aILiveSummary2.aiSummaryList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final AILiveSummary LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AILiveSummary aILiveSummary, List list) {
    }
}
