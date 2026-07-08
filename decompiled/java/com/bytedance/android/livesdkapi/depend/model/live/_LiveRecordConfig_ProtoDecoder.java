package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveRecordConfig_ProtoDecoder implements C0IMD<LiveRecordConfig> {
    public static LiveRecordConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveRecordConfig liveRecordConfig = new LiveRecordConfig();
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
                                liveRecordConfig.minStorageSize = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            liveRecordConfig.maxRecordDuration = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        liveRecordConfig.hasFixedFloatingBall = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    liveRecordConfig.canRecord = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveRecordConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveRecordConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveRecordConfig liveRecordConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveRecordConfig liveRecordConfig, List list) {
    }
}
