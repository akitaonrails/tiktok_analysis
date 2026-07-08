package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OecLiveHotRoomMessage_ProtoDecoder implements C0IMD<OecLiveHotRoomMessage> {
    @Override // X.C0IMD
    public final void LIZ(OecLiveHotRoomMessage oecLiveHotRoomMessage) {
        OecLiveHotRoomMessage oecLiveHotRoomMessage2 = oecLiveHotRoomMessage;
        CommonMessageData commonMessageData = oecLiveHotRoomMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (oecLiveHotRoomMessage2.pathMap == null) {
            oecLiveHotRoomMessage2.pathMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final OecLiveHotRoomMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        OecLiveHotRoomMessage oecLiveHotRoomMessage = new OecLiveHotRoomMessage();
        oecLiveHotRoomMessage.pathMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            oecLiveHotRoomMessage.expireAt = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (strLIZLLL != null) {
                            if (strLIZLLL2 != null) {
                                oecLiveHotRoomMessage.pathMap.put(strLIZLLL, strLIZLLL2);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    oecLiveHotRoomMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return oecLiveHotRoomMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OecLiveHotRoomMessage oecLiveHotRoomMessage, List list) {
    }
}
