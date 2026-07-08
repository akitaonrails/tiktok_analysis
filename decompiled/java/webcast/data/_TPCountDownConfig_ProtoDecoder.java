package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TPCountDownConfig_ProtoDecoder implements C0IMD<TPCountDownConfig> {
    public static TPCountDownConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TPCountDownConfig tPCountDownConfig = new TPCountDownConfig();
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
                                tPCountDownConfig.backgroundRadius = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                            }
                        } else {
                            tPCountDownConfig.padding = _TouchPointPadding_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        tPCountDownConfig.backgroundColor = _TouchPointColor_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    tPCountDownConfig.endTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tPCountDownConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TPCountDownConfig tPCountDownConfig) {
    }

    @Override // X.C0IMD
    public final TPCountDownConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TPCountDownConfig tPCountDownConfig, List list) {
    }
}
