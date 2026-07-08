package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CarouselCfg_ProtoDecoder implements C0IMD<CarouselCfg> {
    public static CarouselCfg LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CarouselCfg carouselCfg = new CarouselCfg();
        carouselCfg.textStatusList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            carouselCfg.times = c1516680pZS.LJIIJ();
                        }
                    } else {
                        carouselCfg.textStatusList.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                    }
                } else {
                    carouselCfg.intervalMs = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return carouselCfg;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CarouselCfg carouselCfg) {
        CarouselCfg carouselCfg2 = carouselCfg;
        if (carouselCfg2.textStatusList == null) {
            carouselCfg2.textStatusList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final CarouselCfg LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CarouselCfg carouselCfg, List list) {
    }
}
