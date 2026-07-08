package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuideV2;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTruthOrDareTriggerGuideV2_ProtoDecoder implements C0IMD<BattleTruthOrDareTriggerGuideV2> {
    public static BattleTruthOrDareTriggerGuideV2 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleTruthOrDareTriggerGuideV2 battleTruthOrDareTriggerGuideV2 = new BattleTruthOrDareTriggerGuideV2();
        battleTruthOrDareTriggerGuideV2.tips = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        battleTruthOrDareTriggerGuideV2.anchorContentKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        battleTruthOrDareTriggerGuideV2.audienceContentKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        battleTruthOrDareTriggerGuideV2.tips.add(_BattleTruthOrDareTriggerGuideV2_TruthOrDareTip_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        battleTruthOrDareTriggerGuideV2.guideDurationSecond = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        battleTruthOrDareTriggerGuideV2.tipDurationSecond = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        battleTruthOrDareTriggerGuideV2.ruleDetailUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        battleTruthOrDareTriggerGuideV2.lapGuideKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        battleTruthOrDareTriggerGuideV2.lapGuideDurationSecond = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        battleTruthOrDareTriggerGuideV2.isFirstTime = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleTruthOrDareTriggerGuideV2;
            }
        }
    }

    public static void LJ(BattleTruthOrDareTriggerGuideV2 battleTruthOrDareTriggerGuideV2) {
        List<BattleTruthOrDareTriggerGuideV2.TruthOrDareTip> list = battleTruthOrDareTriggerGuideV2.tips;
        if (list == null) {
            battleTruthOrDareTriggerGuideV2.tips = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<BattleTruthOrDareTriggerGuideV2.TruthOrDareTip> it2 = battleTruthOrDareTriggerGuideV2.tips.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleTruthOrDareTriggerGuideV2 battleTruthOrDareTriggerGuideV2) {
        LJ(battleTruthOrDareTriggerGuideV2);
    }

    @Override // X.C0IMD
    public final BattleTruthOrDareTriggerGuideV2 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTruthOrDareTriggerGuideV2 battleTruthOrDareTriggerGuideV2, List list) {
    }
}
