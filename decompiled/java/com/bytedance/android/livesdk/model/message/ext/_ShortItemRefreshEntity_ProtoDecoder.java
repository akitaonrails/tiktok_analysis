package com.bytedance.android.livesdk.model.message.ext;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShortItemRefreshEntity_ProtoDecoder implements C0IMD<ShortItemRefreshEntity> {
    public static ShortItemRefreshEntity LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ShortItemRefreshEntity shortItemRefreshEntity = new ShortItemRefreshEntity();
        shortItemRefreshEntity.refreshItems = new ArrayList();
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
                                    shortItemRefreshEntity.refreshMsgType = c1516680pZS.LJIIJ();
                                }
                            } else {
                                shortItemRefreshEntity.index = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            shortItemRefreshEntity.activityId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        shortItemRefreshEntity.refreshItems.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    shortItemRefreshEntity.interval = (int) c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return shortItemRefreshEntity;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ShortItemRefreshEntity shortItemRefreshEntity) {
        ShortItemRefreshEntity shortItemRefreshEntity2 = shortItemRefreshEntity;
        if (shortItemRefreshEntity2.refreshItems == null) {
            shortItemRefreshEntity2.refreshItems = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final ShortItemRefreshEntity LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShortItemRefreshEntity shortItemRefreshEntity, List list) {
    }
}
