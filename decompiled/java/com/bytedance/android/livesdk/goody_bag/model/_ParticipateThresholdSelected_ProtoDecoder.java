package com.bytedance.android.livesdk.goody_bag.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ParticipateThresholdSelected_ProtoDecoder implements C0IMD<ParticipateThresholdSelected> {
    public static ParticipateThresholdSelected LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ParticipateThresholdSelected participateThresholdSelected = new ParticipateThresholdSelected();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        participateThresholdSelected.value = c1516680pZS.LJIIJJI();
                    }
                } else {
                    participateThresholdSelected.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return participateThresholdSelected;
            }
        }
    }

    @Override // X.C0IMD
    public final ParticipateThresholdSelected LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ParticipateThresholdSelected participateThresholdSelected) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ParticipateThresholdSelected participateThresholdSelected, List list) {
    }
}
