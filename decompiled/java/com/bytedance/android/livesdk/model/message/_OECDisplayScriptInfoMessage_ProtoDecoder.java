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
public final class _OECDisplayScriptInfoMessage_ProtoDecoder implements C0IMD<OECDisplayScriptInfoMessage> {
    @Override // X.C0IMD
    public final void LIZ(OECDisplayScriptInfoMessage oECDisplayScriptInfoMessage) {
        OECDisplayScriptInfoMessage oECDisplayScriptInfoMessage2 = oECDisplayScriptInfoMessage;
        CommonMessageData commonMessageData = oECDisplayScriptInfoMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (oECDisplayScriptInfoMessage2.daInfoMap == null) {
            oECDisplayScriptInfoMessage2.daInfoMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final OECDisplayScriptInfoMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        OECDisplayScriptInfoMessage oECDisplayScriptInfoMessage = new OECDisplayScriptInfoMessage();
        oECDisplayScriptInfoMessage.daInfoMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        oECDisplayScriptInfoMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        oECDisplayScriptInfoMessage.enabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        oECDisplayScriptInfoMessage.collapsable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        oECDisplayScriptInfoMessage.productId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        oECDisplayScriptInfoMessage.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        oECDisplayScriptInfoMessage.script = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        oECDisplayScriptInfoMessage.timestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL2 != null) {
                                        oECDisplayScriptInfoMessage.daInfoMap.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return oECDisplayScriptInfoMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OECDisplayScriptInfoMessage oECDisplayScriptInfoMessage, List list) {
    }
}
