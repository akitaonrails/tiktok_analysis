package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveChain_ProtoDecoder implements C0IMD<LiveChain> {
    public static LiveChain LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveChain liveChain = new LiveChain();
        liveChain.coStreamers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        liveChain.hasCoStreamers = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    liveChain.coStreamers.add(_CoStreamer_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveChain;
            }
        }
    }

    public static void LJ(LiveChain liveChain) {
        User user;
        List<CoStreamer> list = liveChain.coStreamers;
        if (list == null) {
            liveChain.coStreamers = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (CoStreamer coStreamer : liveChain.coStreamers) {
            if (coStreamer != null && (user = coStreamer.owner) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveChain liveChain) {
        LJ(liveChain);
    }

    @Override // X.C0IMD
    public final LiveChain LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveChain liveChain, List list) {
    }
}
