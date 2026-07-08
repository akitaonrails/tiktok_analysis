package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NotifyQuota_ProtoDecoder implements C0IMD<NotifyQuota> {
    public static NotifyQuota LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NotifyQuota notifyQuota = new NotifyQuota();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        notifyQuota.publicCommonParams = _NotifyPublicCommonParams_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        notifyQuota.count = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        notifyQuota.earlyDuration = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        notifyQuota.earlyDurationShowCnt = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        notifyQuota.continuousWatchRoomCnt = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        notifyQuota.continuousWatchShowCnt = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        notifyQuota.timeGapMs = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        notifyQuota.timeGapShowCount = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return notifyQuota;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NotifyQuota notifyQuota) {
    }

    @Override // X.C0IMD
    public final NotifyQuota LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NotifyQuota notifyQuota, List list) {
    }
}
