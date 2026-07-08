package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.FansEventData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FansEventData_GetUnclaimedPoints_ProtoDecoder implements C0IMD<FansEventData.GetUnclaimedPoints> {
    public static FansEventData.GetUnclaimedPoints LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FansEventData.GetUnclaimedPoints getUnclaimedPoints = new FansEventData.GetUnclaimedPoints();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        getUnclaimedPoints.unclaimedPoints = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        getUnclaimedPoints.expireTimestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        getUnclaimedPoints.totalUnclaimedScore = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        getUnclaimedPoints.memberJoinTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        getUnclaimedPoints.dailyTasksFinished = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        getUnclaimedPoints.afterDailyTasksFinished = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getUnclaimedPoints;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FansEventData.GetUnclaimedPoints getUnclaimedPoints) {
        Text text = getUnclaimedPoints.afterDailyTasksFinished;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final FansEventData.GetUnclaimedPoints LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansEventData.GetUnclaimedPoints getUnclaimedPoints, List list) {
    }
}
