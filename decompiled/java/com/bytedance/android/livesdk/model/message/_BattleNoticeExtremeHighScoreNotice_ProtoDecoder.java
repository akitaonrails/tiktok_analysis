package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleNoticeExtremeHighScoreNotice_ProtoDecoder implements C0IMD<BattleNoticeExtremeHighScoreNotice> {
    public static BattleNoticeExtremeHighScoreNotice LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleNoticeExtremeHighScoreNotice battleNoticeExtremeHighScoreNotice = new BattleNoticeExtremeHighScoreNotice();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                battleNoticeExtremeHighScoreNotice.extremeHighScoreThreshold = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            battleNoticeExtremeHighScoreNotice.displayTextUnrelatedViewers = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        battleNoticeExtremeHighScoreNotice.displayTextOriginViewers = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    battleNoticeExtremeHighScoreNotice.battleId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleNoticeExtremeHighScoreNotice;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleNoticeExtremeHighScoreNotice battleNoticeExtremeHighScoreNotice) {
        BattleNoticeExtremeHighScoreNotice battleNoticeExtremeHighScoreNotice2 = battleNoticeExtremeHighScoreNotice;
        Text text = battleNoticeExtremeHighScoreNotice2.displayTextOriginViewers;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = battleNoticeExtremeHighScoreNotice2.displayTextUnrelatedViewers;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final BattleNoticeExtremeHighScoreNotice LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleNoticeExtremeHighScoreNotice battleNoticeExtremeHighScoreNotice, List list) {
    }
}
