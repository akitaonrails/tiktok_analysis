package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ViewerPickAnchorParam_ProtoDecoder implements C0IMD<ViewerPickAnchorParam> {
    public static ViewerPickAnchorParam LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ViewerPickAnchorParam viewerPickAnchorParam = new ViewerPickAnchorParam();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                viewerPickAnchorParam.integrateVwIntoLiveboard = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            viewerPickAnchorParam.viewerWishesPriorityRequestEnable = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        viewerPickAnchorParam.viewerWishesQueueModeEnable = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    viewerPickAnchorParam.viewerWishesUseNewSetupProcess = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return viewerPickAnchorParam;
            }
        }
    }

    @Override // X.C0IMD
    public final ViewerPickAnchorParam LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ViewerPickAnchorParam viewerPickAnchorParam) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ViewerPickAnchorParam viewerPickAnchorParam, List list) {
    }
}
