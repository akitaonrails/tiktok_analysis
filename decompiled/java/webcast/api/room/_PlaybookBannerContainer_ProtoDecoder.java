package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _PlaybookBannerContainer_ProtoDecoder implements C0IMD<PlaybookBannerContainer> {
    public static PlaybookBannerContainer LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlaybookBannerContainer playbookBannerContainer = new PlaybookBannerContainer();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        playbookBannerContainer.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        playbookBannerContainer.desc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        playbookBannerContainer.coverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        playbookBannerContainer.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        playbookBannerContainer.playbookSaveScene = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        playbookBannerContainer.playbookId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        playbookBannerContainer.playbookContentId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        playbookBannerContainer.statusText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        playbookBannerContainer.originalPlaybookContentId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        playbookBannerContainer.from = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playbookBannerContainer;
            }
        }
    }

    @Override // X.C0IMD
    public final PlaybookBannerContainer LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PlaybookBannerContainer playbookBannerContainer) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookBannerContainer playbookBannerContainer, List list) {
    }
}
