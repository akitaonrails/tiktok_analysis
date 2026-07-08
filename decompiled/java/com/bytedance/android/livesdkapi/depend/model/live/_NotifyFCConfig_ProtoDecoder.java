package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NotifyFCConfig_ProtoDecoder implements C0IMD<NotifyFCConfig> {
    public static NotifyFCConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NotifyFCConfig notifyFCConfig = new NotifyFCConfig();
        notifyFCConfig.quotaList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    notifyFCConfig.quotaList.add(_NotifyQuota_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return notifyFCConfig;
            }
        }
    }

    public static void LJ(NotifyFCConfig notifyFCConfig) {
        List<NotifyQuota> list = notifyFCConfig.quotaList;
        if (list == null) {
            notifyFCConfig.quotaList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<NotifyQuota> it2 = notifyFCConfig.quotaList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NotifyFCConfig notifyFCConfig) {
        LJ(notifyFCConfig);
    }

    @Override // X.C0IMD
    public final NotifyFCConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NotifyFCConfig notifyFCConfig, List list) {
    }
}
