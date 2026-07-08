package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LastLayoutSetting_ProtoDecoder implements C0IMD<LastLayoutSetting> {
    public static LastLayoutSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LastLayoutSetting lastLayoutSetting = new LastLayoutSetting();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        lastLayoutSetting.layoutId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    lastLayoutSetting.scene = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return lastLayoutSetting;
            }
        }
    }

    @Override // X.C0IMD
    public final LastLayoutSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LastLayoutSetting lastLayoutSetting) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LastLayoutSetting lastLayoutSetting, List list) {
    }
}
