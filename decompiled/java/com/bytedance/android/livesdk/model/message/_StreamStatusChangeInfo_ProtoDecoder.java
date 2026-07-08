package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StreamStatusChangeInfo_ProtoDecoder implements C0IMD<StreamStatusChangeInfo> {
    public static StreamStatusChangeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StreamStatusChangeInfo streamStatusChangeInfo = new StreamStatusChangeInfo();
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
                                streamStatusChangeInfo.changeTimestamp = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            streamStatusChangeInfo.curStatus = c1516680pZS.LJIIJ();
                        }
                    } else {
                        streamStatusChangeInfo.preStatus = c1516680pZS.LJIIJ();
                    }
                } else {
                    streamStatusChangeInfo.streamId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return streamStatusChangeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final StreamStatusChangeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(StreamStatusChangeInfo streamStatusChangeInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StreamStatusChangeInfo streamStatusChangeInfo, List list) {
    }
}
