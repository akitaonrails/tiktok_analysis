package webcast.api.game;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MonetizationTipsConfig_ProtoDecoder implements C0IMD<MonetizationTipsConfig> {
    public static MonetizationTipsConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MonetizationTipsConfig monetizationTipsConfig = new MonetizationTipsConfig();
        monetizationTipsConfig.revenueTipsTriggerTime = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    monetizationTipsConfig.revenueTipsTriggerTime.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return monetizationTipsConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MonetizationTipsConfig monetizationTipsConfig) {
        MonetizationTipsConfig monetizationTipsConfig2 = monetizationTipsConfig;
        if (monetizationTipsConfig2.revenueTipsTriggerTime == null) {
            monetizationTipsConfig2.revenueTipsTriggerTime = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final MonetizationTipsConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MonetizationTipsConfig monetizationTipsConfig, List list) {
    }
}
