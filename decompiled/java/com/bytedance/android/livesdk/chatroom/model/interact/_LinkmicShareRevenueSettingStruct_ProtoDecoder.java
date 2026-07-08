package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkmicShareRevenueSettingStruct_ProtoDecoder implements C0IMD<LinkmicShareRevenueSettingStruct> {
    public static LinkmicShareRevenueSettingStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkmicShareRevenueSettingStruct linkmicShareRevenueSettingStruct = new LinkmicShareRevenueSettingStruct();
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
                                linkmicShareRevenueSettingStruct.enableSettingRatio = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            linkmicShareRevenueSettingStruct.linkmicShareRevenueSettingRatio = c1516680pZS.LJIIJ();
                        }
                    } else {
                        linkmicShareRevenueSettingStruct.linkmicShareRevenueSetting = c1516680pZS.LJIIJ();
                    }
                } else {
                    linkmicShareRevenueSettingStruct.shareRevenueSettingVersionCode = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkmicShareRevenueSettingStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkmicShareRevenueSettingStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkmicShareRevenueSettingStruct linkmicShareRevenueSettingStruct) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkmicShareRevenueSettingStruct linkmicShareRevenueSettingStruct, List list) {
    }
}
