package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuideV2;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTruthOrDareTriggerGuideV2_TruthOrDareTip_ProtoDecoder implements C0IMD<BattleTruthOrDareTriggerGuideV2.TruthOrDareTip> {
    public static BattleTruthOrDareTriggerGuideV2.TruthOrDareTip LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleTruthOrDareTriggerGuideV2.TruthOrDareTip truthOrDareTip = new BattleTruthOrDareTriggerGuideV2.TruthOrDareTip();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        truthOrDareTip.tipContentKey = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    truthOrDareTip.tipTypeKey = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return truthOrDareTip;
            }
        }
    }

    @Override // X.C0IMD
    public final BattleTruthOrDareTriggerGuideV2.TruthOrDareTip LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BattleTruthOrDareTriggerGuideV2.TruthOrDareTip truthOrDareTip) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTruthOrDareTriggerGuideV2.TruthOrDareTip truthOrDareTip, List list) {
    }
}
