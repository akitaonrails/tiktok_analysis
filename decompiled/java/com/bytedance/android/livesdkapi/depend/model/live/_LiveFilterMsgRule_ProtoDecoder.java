package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveFilterMsgRule_ProtoDecoder implements C0IMD<LiveFilterMsgRule> {
    public static LiveFilterMsgRule LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveFilterMsgRule liveFilterMsgRule = new LiveFilterMsgRule();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            liveFilterMsgRule.random = _FilterMsgRuleParamRandom_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        liveFilterMsgRule.rule = c1516680pZS.LJIIJ();
                    }
                } else {
                    liveFilterMsgRule.name = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveFilterMsgRule;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveFilterMsgRule liveFilterMsgRule) {
    }

    @Override // X.C0IMD
    public final LiveFilterMsgRule LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveFilterMsgRule liveFilterMsgRule, List list) {
    }
}
