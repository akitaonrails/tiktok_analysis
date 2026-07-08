package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HeatUpdateContent_ProtoDecoder implements C0IMD<HeatUpdateContent> {
    public static HeatUpdateContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HeatUpdateContent heatUpdateContent = new HeatUpdateContent();
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
                                heatUpdateContent.updateSource = c1516680pZS.LJIIJ();
                            }
                        } else {
                            heatUpdateContent.updatedHeat = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        heatUpdateContent.fromUserId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    heatUpdateContent.channelId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return heatUpdateContent;
            }
        }
    }

    @Override // X.C0IMD
    public final HeatUpdateContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(HeatUpdateContent heatUpdateContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HeatUpdateContent heatUpdateContent, List list) {
    }
}
