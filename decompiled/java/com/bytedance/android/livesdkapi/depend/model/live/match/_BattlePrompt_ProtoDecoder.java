package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattlePrompt_ProtoDecoder implements C0IMD<BattlePrompt> {
    public static BattlePrompt LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattlePrompt battlePrompt = new BattlePrompt();
        battlePrompt.promptElements = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        battlePrompt.promptElements.add(_BattlePromptElem_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    battlePrompt.promptKey = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battlePrompt;
            }
        }
    }

    public static void LJ(BattlePrompt battlePrompt) {
        List<BattlePromptElem> list = battlePrompt.promptElements;
        if (list == null) {
            battlePrompt.promptElements = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<BattlePromptElem> it2 = battlePrompt.promptElements.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattlePrompt battlePrompt) {
        LJ(battlePrompt);
    }

    @Override // X.C0IMD
    public final BattlePrompt LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattlePrompt battlePrompt, List list) {
    }
}
