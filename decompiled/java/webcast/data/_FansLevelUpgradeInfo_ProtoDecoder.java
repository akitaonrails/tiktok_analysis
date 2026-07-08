package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FansLevelUpgradeInfo_ProtoDecoder implements C0IMD<FansLevelUpgradeInfo> {
    public static FansLevelUpgradeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FansLevelUpgradeInfo fansLevelUpgradeInfo = new FansLevelUpgradeInfo();
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
                                fansLevelUpgradeInfo.levelUpgradeExpiredTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            fansLevelUpgradeInfo.level = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        fansLevelUpgradeInfo.anchorId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    fansLevelUpgradeInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fansLevelUpgradeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final FansLevelUpgradeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FansLevelUpgradeInfo fansLevelUpgradeInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansLevelUpgradeInfo fansLevelUpgradeInfo, List list) {
    }
}
