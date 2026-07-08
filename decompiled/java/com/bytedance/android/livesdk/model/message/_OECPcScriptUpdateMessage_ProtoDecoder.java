package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OECPcScriptUpdateMessage_ProtoDecoder implements C0IMD<OECPcScriptUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(OECPcScriptUpdateMessage oECPcScriptUpdateMessage) {
        OECPcScriptUpdateMessage oECPcScriptUpdateMessage2 = oECPcScriptUpdateMessage;
        CommonMessageData commonMessageData = oECPcScriptUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (oECPcScriptUpdateMessage2.productId == null) {
            oECPcScriptUpdateMessage2.productId = new ArrayList();
        }
        if (oECPcScriptUpdateMessage2.script == null) {
            oECPcScriptUpdateMessage2.script = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final OECPcScriptUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        OECPcScriptUpdateMessage oECPcScriptUpdateMessage = new OECPcScriptUpdateMessage();
        oECPcScriptUpdateMessage.productId = new ArrayList();
        oECPcScriptUpdateMessage.script = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    oECPcScriptUpdateMessage.timestamp = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                oECPcScriptUpdateMessage.narrativeScript = C1516700pZU.LIZLLL(c1516680pZS);
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
                                    oECPcScriptUpdateMessage.script.put(strLIZLLL, strLIZLLL2);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        oECPcScriptUpdateMessage.productId.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    oECPcScriptUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return oECPcScriptUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OECPcScriptUpdateMessage oECPcScriptUpdateMessage, List list) {
    }
}
