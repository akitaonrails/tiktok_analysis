package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ActivityCurrent_ProtoDecoder implements C0IMD<ActivityCurrent> {
    public static ActivityCurrent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ActivityCurrent activityCurrent = new ActivityCurrent();
        activityCurrent.pushActionTypes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        activityCurrent.timeOffset = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        activityCurrent.now = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        activityCurrent.timeZoneOffset = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        activityCurrent.phaseName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        activityCurrent.activityCode = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        activityCurrent.runtimeActivity = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        activityCurrent.currentSerialId = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        activityCurrent.nowMs = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        activityCurrent.pushActionTypes.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        activityCurrent.generateNowMs = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return activityCurrent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ActivityCurrent activityCurrent) {
        ActivityCurrent activityCurrent2 = activityCurrent;
        if (activityCurrent2.pushActionTypes == null) {
            activityCurrent2.pushActionTypes = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final ActivityCurrent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ActivityCurrent activityCurrent, List list) {
    }
}
