package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CoStreamer_ProtoDecoder implements C0IMD<CoStreamer> {
    public static CoStreamer LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CoStreamer coStreamer = new CoStreamer();
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
                                coStreamer.userCount = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            coStreamer.owner = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        coStreamer.roomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    coStreamer.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return coStreamer;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CoStreamer coStreamer) {
        User user = coStreamer.owner;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final CoStreamer LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CoStreamer coStreamer, List list) {
    }
}
