package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveFragment_ProtoDecoder implements C0IMD<LiveFragment> {
    public static LiveFragment LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveFragment liveFragment = new LiveFragment();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveFragment.fragmentId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        liveFragment.coverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        liveFragment.playUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        liveFragment.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        liveFragment.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        liveFragment.autocutType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        liveFragment.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        liveFragment.duration = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        liveFragment.originFragmentType = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        liveFragment.originFragmentSubType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        liveFragment.llmTitleShort = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        liveFragment.itemIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveFragment;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveFragment LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveFragment liveFragment) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveFragment liveFragment, List list) {
    }
}
