package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MsgNotifyWatchContinuousQuota_ProtoDecoder implements C0IMD<MsgNotifyWatchContinuousQuota> {
    public static MsgNotifyWatchContinuousQuota LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MsgNotifyWatchContinuousQuota msgNotifyWatchContinuousQuota = new MsgNotifyWatchContinuousQuota();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            msgNotifyWatchContinuousQuota.count = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        msgNotifyWatchContinuousQuota.coutinuousRoomCnt = c1516680pZS.LJIIJJI();
                    }
                } else {
                    msgNotifyWatchContinuousQuota.componentType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return msgNotifyWatchContinuousQuota;
            }
        }
    }

    @Override // X.C0IMD
    public final MsgNotifyWatchContinuousQuota LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MsgNotifyWatchContinuousQuota msgNotifyWatchContinuousQuota) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MsgNotifyWatchContinuousQuota msgNotifyWatchContinuousQuota, List list) {
    }
}
