package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WatchReasonItem_ProtoDecoder implements C0IMD<WatchReasonItem> {
    public static WatchReasonItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WatchReasonItem watchReasonItem = new WatchReasonItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            watchReasonItem.tuxIconProtocol = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        watchReasonItem.content = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    watchReasonItem.reasonId = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return watchReasonItem;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WatchReasonItem watchReasonItem) {
        Text text = watchReasonItem.content;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final WatchReasonItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WatchReasonItem watchReasonItem, List list) {
    }
}
