package com.bytedance.android.livesdk.battle.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.battle.model.BattleTriggerGuideResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTriggerGuideResponse_ProtoDecoder implements C0IMD<BattleTriggerGuideResponse> {
    @Override // X.C0IMD
    public final void LIZ(BattleTriggerGuideResponse battleTriggerGuideResponse) {
    }

    @Override // X.C0IMD
    public final BattleTriggerGuideResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BattleTriggerGuideResponse battleTriggerGuideResponse = new BattleTriggerGuideResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    BattleTriggerGuideResponse.ResponseData responseData = new BattleTriggerGuideResponse.ResponseData();
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    while (c1516680pZS.LJI() != -1) {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    battleTriggerGuideResponse.data = responseData;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleTriggerGuideResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTriggerGuideResponse battleTriggerGuideResponse, List list) {
    }
}
