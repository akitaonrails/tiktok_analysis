package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class _LiveManagerEntranceInfo_ProtoDecoder implements C0IMD<LiveManagerEntranceInfo> {
    public static LiveManagerEntranceInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveManagerEntranceInfo liveManagerEntranceInfo = new LiveManagerEntranceInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveManagerEntranceInfo.showLiveManagerEntrance = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        liveManagerEntranceInfo.pageSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        liveManagerEntranceInfo.oecWebsiteSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        liveManagerEntranceInfo.titleTiktokPic = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        liveManagerEntranceInfo.titleLiveManagerPic = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        liveManagerEntranceInfo.backGroundPic = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        liveManagerEntranceInfo.promptText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        liveManagerEntranceInfo.jumpText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        liveManagerEntranceInfo.buttonText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        liveManagerEntranceInfo.bottomLiveManagerTabName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        liveManagerEntranceInfo.libraExperimentGroup = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveManagerEntranceInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveManagerEntranceInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveManagerEntranceInfo liveManagerEntranceInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveManagerEntranceInfo liveManagerEntranceInfo, List list) {
    }
}
