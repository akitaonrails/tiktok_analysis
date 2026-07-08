package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorSubWaveTriggerSettings_ProtoDecoder implements C0IMD<AnchorSubWaveTriggerSettings> {
    public static AnchorSubWaveTriggerSettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorSubWaveTriggerSettings anchorSubWaveTriggerSettings = new AnchorSubWaveTriggerSettings();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            anchorSubWaveTriggerSettings.needSubCounts = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        anchorSubWaveTriggerSettings.name = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorSubWaveTriggerSettings.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorSubWaveTriggerSettings;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorSubWaveTriggerSettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorSubWaveTriggerSettings anchorSubWaveTriggerSettings) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorSubWaveTriggerSettings anchorSubWaveTriggerSettings, List list) {
    }
}
