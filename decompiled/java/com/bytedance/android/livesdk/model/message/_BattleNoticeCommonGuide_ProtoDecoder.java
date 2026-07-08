package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleNoticeCommonGuide_ProtoDecoder implements C0IMD<BattleNoticeCommonGuide> {
    public static BattleNoticeCommonGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleNoticeCommonGuide battleNoticeCommonGuide = new BattleNoticeCommonGuide();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        battleNoticeCommonGuide.exceptAnchor = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    battleNoticeCommonGuide.displayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleNoticeCommonGuide;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleNoticeCommonGuide battleNoticeCommonGuide) {
        Text text = battleNoticeCommonGuide.displayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final BattleNoticeCommonGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleNoticeCommonGuide battleNoticeCommonGuide, List list) {
    }
}
