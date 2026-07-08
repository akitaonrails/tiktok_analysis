package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessageExtra;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomNotifyMessageExtra_Background_ProtoDecoder implements C0IMD<RoomNotifyMessageExtra.Background> {
    public static RoomNotifyMessageExtra.Background LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomNotifyMessageExtra.Background background = new RoomNotifyMessageExtra.Background();
        background.mUrls = new ArrayList();
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
                                background.mUri = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            background.mUrls.add(C1516700pZU.LIZLLL(c1516680pZS));
                        }
                    } else {
                        background.height = c1516680pZS.LJIIJ();
                    }
                } else {
                    background.width = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return background;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomNotifyMessageExtra.Background background) {
        RoomNotifyMessageExtra.Background background2 = background;
        if (background2.mUrls == null) {
            background2.mUrls = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final RoomNotifyMessageExtra.Background LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomNotifyMessageExtra.Background background, List list) {
    }
}
