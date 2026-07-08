package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ChangePositionResp_ProtoDecoder implements C0IMD<ChangePositionResp> {
    @Override // X.C0IMD
    public final void LIZ(ChangePositionResp changePositionResp) {
        ChangePositionResp changePositionResp2 = changePositionResp;
        LinkMicCommonResp linkMicCommonResp = changePositionResp2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        if (changePositionResp2.linkedUserUiPositions == null) {
            changePositionResp2.linkedUserUiPositions = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final ChangePositionResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ChangePositionResp changePositionResp = new ChangePositionResp();
        changePositionResp.linkedUserUiPositions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        changePositionResp.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    changePositionResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return changePositionResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ChangePositionResp changePositionResp, List list) {
    }
}
