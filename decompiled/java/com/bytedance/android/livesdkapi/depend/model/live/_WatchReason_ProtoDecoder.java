package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WatchReason_ProtoDecoder implements C0IMD<WatchReason> {
    public static WatchReason LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WatchReason watchReason = new WatchReason();
        watchReason.watchReasons = new ArrayList();
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
                                watchReason.isShow = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            watchReason.bgColorType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        watchReason.style = c1516680pZS.LJIIJ();
                    }
                } else {
                    watchReason.watchReasons.add(_WatchReasonItem_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return watchReason;
            }
        }
    }

    public static void LJ(WatchReason watchReason) {
        Text text;
        List<WatchReasonItem> list = watchReason.watchReasons;
        if (list == null) {
            watchReason.watchReasons = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (WatchReasonItem watchReasonItem : watchReason.watchReasons) {
            if (watchReasonItem != null && (text = watchReasonItem.content) != null) {
                _Text_ProtoDecoder.LJ(text);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WatchReason watchReason) {
        LJ(watchReason);
    }

    @Override // X.C0IMD
    public final WatchReason LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WatchReason watchReason, List list) {
    }
}
