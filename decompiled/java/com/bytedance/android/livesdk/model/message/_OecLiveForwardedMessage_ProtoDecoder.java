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
public final class _OecLiveForwardedMessage_ProtoDecoder implements C0IMD<OecLiveForwardedMessage> {
    @Override // X.C0IMD
    public final void LIZ(OecLiveForwardedMessage oecLiveForwardedMessage) {
        OecLiveForwardedMessage oecLiveForwardedMessage2 = oecLiveForwardedMessage;
        CommonMessageData commonMessageData = oecLiveForwardedMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (oecLiveForwardedMessage2.data == null) {
            oecLiveForwardedMessage2.data = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final OecLiveForwardedMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        OecLiveForwardedMessage oecLiveForwardedMessage = new OecLiveForwardedMessage();
        oecLiveForwardedMessage.data = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
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
                                    oecLiveForwardedMessage.data.put(strLIZLLL, strLIZLLL2);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        oecLiveForwardedMessage.messageType = c1516680pZS.LJIIJJI();
                    }
                } else {
                    oecLiveForwardedMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return oecLiveForwardedMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OecLiveForwardedMessage oecLiveForwardedMessage, List list) {
    }
}
