package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ContinueRoomResponse_ProtoDecoder implements C0IMD<ContinueRoomResponse> {
    @Override // X.C0IMD
    public final void LIZ(ContinueRoomResponse continueRoomResponse) {
        Room room = continueRoomResponse.room;
        if (room != null) {
            _Room_ProtoDecoder.LJ(room);
        }
    }

    @Override // X.C0IMD
    public final ContinueRoomResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ContinueRoomResponse continueRoomResponse = new ContinueRoomResponse();
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
                                continueRoomResponse.linkMicUserNum = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            continueRoomResponse.continueScene = c1516680pZS.LJIIJ();
                        }
                    } else {
                        continueRoomResponse.crossDeviceContinueScene = c1516680pZS.LJIIJ();
                    }
                } else {
                    continueRoomResponse.room = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return continueRoomResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ContinueRoomResponse continueRoomResponse, List list) {
    }
}
