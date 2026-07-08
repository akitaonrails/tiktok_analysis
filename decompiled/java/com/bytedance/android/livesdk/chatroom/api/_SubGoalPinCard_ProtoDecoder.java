package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubGoalPinCard_ProtoDecoder implements C0IMD<SubGoalPinCard> {
    public static SubGoalPinCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubGoalPinCard subGoalPinCard = new SubGoalPinCard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    subGoalPinCard.progress = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                subGoalPinCard.target = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            subGoalPinCard.desc = _SubPinCardText_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        subGoalPinCard.timeToLive = c1516680pZS.LJIIJJI();
                    }
                } else {
                    subGoalPinCard.goalId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subGoalPinCard;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubGoalPinCard subGoalPinCard) {
    }

    @Override // X.C0IMD
    public final SubGoalPinCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubGoalPinCard subGoalPinCard, List list) {
    }
}
