package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NotifyPublicCommonParams_ProtoDecoder implements C0IMD<NotifyPublicCommonParams> {
    public static NotifyPublicCommonParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NotifyPublicCommonParams notifyPublicCommonParams = new NotifyPublicCommonParams();
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
                                notifyPublicCommonParams.scene = c1516680pZS.LJIIJ();
                            }
                        } else {
                            notifyPublicCommonParams.biz = c1516680pZS.LJIIJ();
                        }
                    } else {
                        notifyPublicCommonParams.userType = c1516680pZS.LJIIJ();
                    }
                } else {
                    notifyPublicCommonParams.component = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return notifyPublicCommonParams;
            }
        }
    }

    @Override // X.C0IMD
    public final NotifyPublicCommonParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(NotifyPublicCommonParams notifyPublicCommonParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NotifyPublicCommonParams notifyPublicCommonParams, List list) {
    }
}
