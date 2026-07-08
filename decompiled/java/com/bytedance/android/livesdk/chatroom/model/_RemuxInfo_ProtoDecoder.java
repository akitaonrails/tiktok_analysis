package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RemuxInfo_ProtoDecoder implements C0IMD<RemuxInfo> {
    public static RemuxInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RemuxInfo remuxInfo = new RemuxInfo();
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
                                    remuxInfo.startRemuxTime = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                remuxInfo.videoMeta = _VideoMetaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            remuxInfo.failReason = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        remuxInfo.estimatedSize = c1516680pZS.LJIIJJI();
                    }
                } else {
                    remuxInfo.remuxStatus = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return remuxInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RemuxInfo remuxInfo) {
    }

    @Override // X.C0IMD
    public final RemuxInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RemuxInfo remuxInfo, List list) {
    }
}
