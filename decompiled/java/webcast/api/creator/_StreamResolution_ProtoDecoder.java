package webcast.api.creator;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _StreamResolution_ProtoDecoder implements C0IMD<StreamResolution> {
    public static StreamResolution LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StreamResolution streamResolution = new StreamResolution();
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
                                streamResolution.minBitRate = c1516680pZS.LJIIJ();
                            }
                        } else {
                            streamResolution.resolutionDescribe = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        streamResolution.resolutionText = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    streamResolution.streamResolution = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return streamResolution;
            }
        }
    }

    @Override // X.C0IMD
    public final StreamResolution LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(StreamResolution streamResolution) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StreamResolution streamResolution, List list) {
    }
}
