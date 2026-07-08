package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FansLevelInfo_ProtoDecoder implements C0IMD<FansLevelInfo> {
    public static FansLevelInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FansLevelInfo fansLevelInfo = new FansLevelInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        fansLevelInfo.userid = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        fansLevelInfo.anchorid = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        fansLevelInfo.score = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        fansLevelInfo.level = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        fansLevelInfo.isSleeping = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        fansLevelInfo.timeToSleep = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        fansLevelInfo.fansScoreRule = _FansScoreRule_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        fansLevelInfo.badge = _BadgeStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        fansLevelInfo.joinStatus = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        fansLevelInfo.isSuperFan = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fansLevelInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FansLevelInfo fansLevelInfo) {
        BadgeStruct badgeStruct = fansLevelInfo.badge;
        if (badgeStruct != null) {
            _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
        }
    }

    @Override // X.C0IMD
    public final FansLevelInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansLevelInfo fansLevelInfo, List list) {
    }
}
