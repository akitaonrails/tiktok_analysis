package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RTCVideoParam_ProtoDecoder implements C0IMD<RTCVideoParam> {
    public static RTCVideoParam LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RTCVideoParam rTCVideoParam = new RTCVideoParam();
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
                                rTCVideoParam.bitRate = c1516680pZS.LJIIJ();
                            }
                        } else {
                            rTCVideoParam.fps = c1516680pZS.LJIIJ();
                        }
                    } else {
                        rTCVideoParam.height = c1516680pZS.LJIIJ();
                    }
                } else {
                    rTCVideoParam.width = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rTCVideoParam;
            }
        }
    }

    @Override // X.C0IMD
    public final RTCVideoParam LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RTCVideoParam rTCVideoParam) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RTCVideoParam rTCVideoParam, List list) {
    }
}
