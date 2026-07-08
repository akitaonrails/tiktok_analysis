package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BigSaleConfig_ProtoDecoder implements C0IMD<BigSaleConfig> {
    public static BigSaleConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BigSaleConfig bigSaleConfig = new BigSaleConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    bigSaleConfig.width = c1516680pZS.LJIIJ();
                                }
                            } else {
                                bigSaleConfig.height = c1516680pZS.LJIIJ();
                            }
                        } else {
                            bigSaleConfig.bigSaleVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        bigSaleConfig.imageId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    bigSaleConfig.imageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bigSaleConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final BigSaleConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BigSaleConfig bigSaleConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BigSaleConfig bigSaleConfig, List list) {
    }
}
