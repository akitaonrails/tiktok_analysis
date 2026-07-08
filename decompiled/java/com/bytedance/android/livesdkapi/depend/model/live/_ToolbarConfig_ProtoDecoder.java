package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ToolbarConfig_ProtoDecoder implements C0IMD<ToolbarConfig> {
    public static ToolbarConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ToolbarConfig toolbarConfig = new ToolbarConfig();
        toolbarConfig.highlightComs = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    toolbarConfig.highlightComs.add(_HighlightToolbarComInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return toolbarConfig;
            }
        }
    }

    public static void LJ(ToolbarConfig toolbarConfig) {
        List<HighlightToolbarComInfo> list = toolbarConfig.highlightComs;
        if (list == null) {
            toolbarConfig.highlightComs = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (HighlightToolbarComInfo highlightToolbarComInfo : toolbarConfig.highlightComs) {
            if (highlightToolbarComInfo != null && highlightToolbarComInfo.highlightComTypes == null) {
                highlightToolbarComInfo.highlightComTypes = new ArrayList();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ToolbarConfig toolbarConfig) {
        LJ(toolbarConfig);
    }

    @Override // X.C0IMD
    public final ToolbarConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ToolbarConfig toolbarConfig, List list) {
    }
}
