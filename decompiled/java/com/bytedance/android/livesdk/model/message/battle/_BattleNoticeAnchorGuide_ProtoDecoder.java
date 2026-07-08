package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleNoticeAnchorGuide_ProtoDecoder implements C0IMD<BattleNoticeAnchorGuide> {
    public static BattleNoticeAnchorGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleNoticeAnchorGuide battleNoticeAnchorGuide = new BattleNoticeAnchorGuide();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        battleNoticeAnchorGuide.buttonContent = _BattleNoticeText_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    battleNoticeAnchorGuide.content = _BattleNoticeText_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleNoticeAnchorGuide;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleNoticeAnchorGuide battleNoticeAnchorGuide) {
    }

    @Override // X.C0IMD
    public final BattleNoticeAnchorGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleNoticeAnchorGuide battleNoticeAnchorGuide, List list) {
    }
}
