package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnigmaBattleSetting_ProtoDecoder implements C0IMD<EnigmaBattleSetting> {
    public static EnigmaBattleSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnigmaBattleSetting enigmaBattleSetting = new EnigmaBattleSetting();
        enigmaBattleSetting.enigmaScoreRevealCountdownSec = new ArrayList();
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
                                    enigmaBattleSetting.enigmaScoreRevealDurationSec = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                enigmaBattleSetting.enigmaScoreRevealCountdownSec.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                            }
                        } else {
                            enigmaBattleSetting.enigmaBattleCampaignEnd = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        enigmaBattleSetting.enigmaBattleCampaignStart = c1516680pZS.LJIIJJI();
                    }
                } else {
                    enigmaBattleSetting.isStartable = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enigmaBattleSetting;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EnigmaBattleSetting enigmaBattleSetting) {
        EnigmaBattleSetting enigmaBattleSetting2 = enigmaBattleSetting;
        if (enigmaBattleSetting2.enigmaScoreRevealCountdownSec == null) {
            enigmaBattleSetting2.enigmaScoreRevealCountdownSec = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final EnigmaBattleSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaBattleSetting enigmaBattleSetting, List list) {
    }
}
