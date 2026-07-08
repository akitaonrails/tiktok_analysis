package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BillboardImageConfig_ProtoDecoder implements C0IMD<BillboardImageConfig> {
    public static BillboardImageConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BillboardImageConfig billboardImageConfig = new BillboardImageConfig();
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
                                billboardImageConfig.height = c1516680pZS.LJIIJ();
                            }
                        } else {
                            billboardImageConfig.width = c1516680pZS.LJIIJ();
                        }
                    } else {
                        billboardImageConfig.imageId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    billboardImageConfig.imageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return billboardImageConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final BillboardImageConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BillboardImageConfig billboardImageConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BillboardImageConfig billboardImageConfig, List list) {
    }
}
