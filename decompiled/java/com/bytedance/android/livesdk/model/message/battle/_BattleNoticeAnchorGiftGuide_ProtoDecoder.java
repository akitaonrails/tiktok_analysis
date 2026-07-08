package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleNoticeAnchorGiftGuide_ProtoDecoder implements C0IMD<BattleNoticeAnchorGiftGuide> {
    public static BattleNoticeAnchorGiftGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleNoticeAnchorGiftGuide battleNoticeAnchorGiftGuide = new BattleNoticeAnchorGiftGuide();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    battleNoticeAnchorGiftGuide.content = _BattleNoticeText_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleNoticeAnchorGiftGuide;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleNoticeAnchorGiftGuide battleNoticeAnchorGiftGuide) {
    }

    @Override // X.C0IMD
    public final BattleNoticeAnchorGiftGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleNoticeAnchorGiftGuide battleNoticeAnchorGiftGuide, List list) {
    }
}
