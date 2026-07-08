package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessageExtra;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomNotifyMessageExtra_ProtoDecoder implements C0IMD<RoomNotifyMessageExtra> {
    public static RoomNotifyMessageExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomNotifyMessageExtra roomNotifyMessageExtra = new RoomNotifyMessageExtra();
        roomNotifyMessageExtra.highlightedList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            roomNotifyMessageExtra.highlightInfo = _NotifyHighlightInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        roomNotifyMessageExtra.background = _RoomNotifyMessageExtra_Background_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    roomNotifyMessageExtra.duration = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomNotifyMessageExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomNotifyMessageExtra roomNotifyMessageExtra) {
        RoomNotifyMessageExtra roomNotifyMessageExtra2 = roomNotifyMessageExtra;
        RoomNotifyMessageExtra.Background background = roomNotifyMessageExtra2.background;
        if (background != null && background.mUrls == null) {
            background.mUrls = new ArrayList();
        }
        NotifyHighlightInfo notifyHighlightInfo = roomNotifyMessageExtra2.highlightInfo;
        if (notifyHighlightInfo != null) {
            _NotifyHighlightInfo_ProtoDecoder.LJ(notifyHighlightInfo);
        }
    }

    @Override // X.C0IMD
    public final RoomNotifyMessageExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomNotifyMessageExtra roomNotifyMessageExtra, List list) {
    }
}
