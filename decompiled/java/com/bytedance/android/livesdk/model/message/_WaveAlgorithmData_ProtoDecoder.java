package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WaveAlgorithmData_ProtoDecoder implements C0IMD<WaveAlgorithmData> {
    public static WaveAlgorithmData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WaveAlgorithmData waveAlgorithmData = new WaveAlgorithmData();
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
                                    waveAlgorithmData.isFollow = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                waveAlgorithmData.isRewatch = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            waveAlgorithmData.predictScore = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        waveAlgorithmData.isAlgHit = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    waveAlgorithmData.algorithmVersion = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return waveAlgorithmData;
            }
        }
    }

    @Override // X.C0IMD
    public final WaveAlgorithmData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(WaveAlgorithmData waveAlgorithmData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WaveAlgorithmData waveAlgorithmData, List list) {
    }
}
