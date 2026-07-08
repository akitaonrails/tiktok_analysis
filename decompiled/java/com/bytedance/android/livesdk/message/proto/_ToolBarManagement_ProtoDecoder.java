package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ToolBarManagement_ProtoDecoder implements C0IMD<ToolBarManagement> {
    public static ToolBarManagement LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ToolBarManagement toolBarManagement = new ToolBarManagement();
        toolBarManagement.mergingmorepriority = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    toolBarManagement.mergingmorepriority.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return toolBarManagement;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ToolBarManagement toolBarManagement) {
        ToolBarManagement toolBarManagement2 = toolBarManagement;
        if (toolBarManagement2.mergingmorepriority == null) {
            toolBarManagement2.mergingmorepriority = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final ToolBarManagement LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ToolBarManagement toolBarManagement, List list) {
    }
}
