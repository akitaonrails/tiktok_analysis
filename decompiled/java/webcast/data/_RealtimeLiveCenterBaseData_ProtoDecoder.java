package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class _RealtimeLiveCenterBaseData_ProtoDecoder implements C0IMD<RealtimeLiveCenterBaseData> {
    public static RealtimeLiveCenterBaseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RealtimeLiveCenterBaseData realtimeLiveCenterBaseData = new RealtimeLiveCenterBaseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        realtimeLiveCenterBaseData.liveStartTime = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        realtimeLiveCenterBaseData.liveEndTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        realtimeLiveCenterBaseData.totalScore = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        realtimeLiveCenterBaseData.liveWatchCnt = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        realtimeLiveCenterBaseData.liveNewFansUcnt = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        realtimeLiveCenterBaseData.liveConsumeUcnt = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        realtimeLiveCenterBaseData.liveCommentCnt = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        realtimeLiveCenterBaseData.liveLikeCnt = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        realtimeLiveCenterBaseData.newSubscribersCnt = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        realtimeLiveCenterBaseData.liveOnlineWatchCnt = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        realtimeLiveCenterBaseData.shareCnt = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return realtimeLiveCenterBaseData;
            }
        }
    }

    @Override // X.C0IMD
    public final RealtimeLiveCenterBaseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RealtimeLiveCenterBaseData realtimeLiveCenterBaseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeLiveCenterBaseData realtimeLiveCenterBaseData, List list) {
    }
}
