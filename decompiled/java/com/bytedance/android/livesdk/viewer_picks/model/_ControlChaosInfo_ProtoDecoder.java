package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ControlChaosInfo_ProtoDecoder implements C0IMD<ControlChaosInfo> {
    public static ControlChaosInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ControlChaosInfo controlChaosInfo = new ControlChaosInfo();
        controlChaosInfo.hotKeys = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            controlChaosInfo.actionType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        controlChaosInfo.hotKeys.add(_HotKey_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    controlChaosInfo.commandType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return controlChaosInfo;
            }
        }
    }

    public static void LJ(ControlChaosInfo controlChaosInfo) {
        List<HotKey> list = controlChaosInfo.hotKeys;
        if (list == null) {
            controlChaosInfo.hotKeys = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (HotKey hotKey : controlChaosInfo.hotKeys) {
            if (hotKey != null) {
                _HotKey_ProtoDecoder.LJ(hotKey);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ControlChaosInfo controlChaosInfo) {
        LJ(controlChaosInfo);
    }

    @Override // X.C0IMD
    public final ControlChaosInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ControlChaosInfo controlChaosInfo, List list) {
    }
}
