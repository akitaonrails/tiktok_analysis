package com.bytedance.android.livesdk.model.message.battle;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleNoticeRuleGuide_ProtoDecoder implements C0IMD<BattleNoticeRuleGuide> {
    public static BattleNoticeRuleGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleNoticeRuleGuide battleNoticeRuleGuide = new BattleNoticeRuleGuide();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        battleNoticeRuleGuide.content = _BattleNoticeText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        battleNoticeRuleGuide.buttonContent = _BattleNoticeText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        battleNoticeRuleGuide.ruleUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        battleNoticeRuleGuide.exceptAnchor = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        battleNoticeRuleGuide.contentText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        battleNoticeRuleGuide.buttonContentText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleNoticeRuleGuide;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleNoticeRuleGuide battleNoticeRuleGuide) {
        BattleNoticeRuleGuide battleNoticeRuleGuide2 = battleNoticeRuleGuide;
        Text text = battleNoticeRuleGuide2.contentText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = battleNoticeRuleGuide2.buttonContentText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final BattleNoticeRuleGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleNoticeRuleGuide battleNoticeRuleGuide, List list) {
    }
}
