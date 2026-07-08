package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WatchReasonV2Item_ProtoDecoder implements C0IMD<WatchReasonV2Item> {
    public static WatchReasonV2Item LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WatchReasonV2Item watchReasonV2Item = new WatchReasonV2Item();
        watchReasonV2Item.watchReasonIds = new ArrayList();
        watchReasonV2Item.tagIds = new ArrayList();
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
                                    watchReasonV2Item.style = c1516680pZS.LJIIJ();
                                }
                            } else {
                                watchReasonV2Item.watchReasonIds.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                            }
                        } else {
                            watchReasonV2Item.tagIds.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                        }
                    } else {
                        watchReasonV2Item.content = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    watchReasonV2Item.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return watchReasonV2Item;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WatchReasonV2Item watchReasonV2Item) {
        WatchReasonV2Item watchReasonV2Item2 = watchReasonV2Item;
        if (watchReasonV2Item2.tagIds == null) {
            watchReasonV2Item2.tagIds = new ArrayList();
        }
        if (watchReasonV2Item2.watchReasonIds == null) {
            watchReasonV2Item2.watchReasonIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final WatchReasonV2Item LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WatchReasonV2Item watchReasonV2Item, List list) {
    }
}
