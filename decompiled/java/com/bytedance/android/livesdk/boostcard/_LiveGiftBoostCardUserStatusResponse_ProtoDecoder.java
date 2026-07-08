package com.bytedance.android.livesdk.boostcard;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveGiftBoostCardUserStatusResponse_ProtoDecoder implements C0IMD<LiveGiftBoostCardUserStatusResponse> {
    @Override // X.C0IMD
    public final void LIZ(LiveGiftBoostCardUserStatusResponse liveGiftBoostCardUserStatusResponse) {
        LiveGiftBoostCardUserStatusResponse liveGiftBoostCardUserStatusResponse2 = liveGiftBoostCardUserStatusResponse;
        List<BoostedUsersPoint> list = liveGiftBoostCardUserStatusResponse2.mPoints;
        if (list == null) {
            liveGiftBoostCardUserStatusResponse2.mPoints = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<BoostedUsersPoint> it2 = liveGiftBoostCardUserStatusResponse2.mPoints.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final LiveGiftBoostCardUserStatusResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LiveGiftBoostCardUserStatusResponse liveGiftBoostCardUserStatusResponse = new LiveGiftBoostCardUserStatusResponse();
        liveGiftBoostCardUserStatusResponse.mPoints = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        liveGiftBoostCardUserStatusResponse.mPoints.add(_BoostedUsersPoint_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    liveGiftBoostCardUserStatusResponse.mTotalUsers = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveGiftBoostCardUserStatusResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveGiftBoostCardUserStatusResponse liveGiftBoostCardUserStatusResponse, List list) {
    }
}
