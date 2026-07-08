package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class _RealtimeLiveCenterTips_ProtoDecoder implements C0IMD<RealtimeLiveCenterTips> {
    public static RealtimeLiveCenterTips LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RealtimeLiveCenterTips realtimeLiveCenterTips = new RealtimeLiveCenterTips();
        realtimeLiveCenterTips.eventTrackParams = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        realtimeLiveCenterTips.showTips = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        realtimeLiveCenterTips.tipText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        realtimeLiveCenterTips.tipType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        realtimeLiveCenterTips.randomTipKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        realtimeLiveCenterTips.tipsSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        realtimeLiveCenterTips.buttonName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        realtimeLiveCenterTips.buttonEventTrack = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        realtimeLiveCenterTips.typeEventTrack = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        realtimeLiveCenterTips.tipsStarlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        realtimeLiveCenterTips.showFeedback = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        realtimeLiveCenterTips.suggestionRecordId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL2 != null) {
                                        realtimeLiveCenterTips.eventTrackParams.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        realtimeLiveCenterTips.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return realtimeLiveCenterTips;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RealtimeLiveCenterTips realtimeLiveCenterTips) {
        RealtimeLiveCenterTips realtimeLiveCenterTips2 = realtimeLiveCenterTips;
        if (realtimeLiveCenterTips2.eventTrackParams == null) {
            realtimeLiveCenterTips2.eventTrackParams = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final RealtimeLiveCenterTips LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeLiveCenterTips realtimeLiveCenterTips, List list) {
    }
}
