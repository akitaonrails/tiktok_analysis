package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkmicSettingResult_ProtoDecoder implements C0IMD<LinkmicSettingResult> {
    @Override // X.C0IMD
    public final void LIZ(LinkmicSettingResult linkmicSettingResult) {
        LinkmicSettingResult linkmicSettingResult2 = linkmicSettingResult;
        List<LinkmicSettingmodel> list = linkmicSettingResult2.settings;
        if (list == null) {
            linkmicSettingResult2.settings = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<LinkmicSettingmodel> it2 = linkmicSettingResult2.settings.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final LinkmicSettingResult LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkmicSettingResult linkmicSettingResult = new LinkmicSettingResult();
        linkmicSettingResult.settings = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 102) {
                    if (iLJI != 200) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        linkmicSettingResult.settings.add(_LinkmicSettingmodel_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    linkmicSettingResult.linkMIcAbParams = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkmicSettingResult;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkmicSettingResult linkmicSettingResult, List list) {
    }
}
