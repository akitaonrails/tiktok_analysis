package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestShareRevenueSettingInfo_ProtoDecoder implements C0IMD<MultiGuestShareRevenueSettingInfo> {
    public static MultiGuestShareRevenueSettingInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestShareRevenueSettingInfo multiGuestShareRevenueSettingInfo = new MultiGuestShareRevenueSettingInfo();
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
                                multiGuestShareRevenueSettingInfo.revenueSettingRatio = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            multiGuestShareRevenueSettingInfo.revenueSetting = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        multiGuestShareRevenueSettingInfo.version = c1516680pZS.LJIIJJI();
                    }
                } else {
                    multiGuestShareRevenueSettingInfo.valid = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestShareRevenueSettingInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final MultiGuestShareRevenueSettingInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MultiGuestShareRevenueSettingInfo multiGuestShareRevenueSettingInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestShareRevenueSettingInfo multiGuestShareRevenueSettingInfo, List list) {
    }
}
