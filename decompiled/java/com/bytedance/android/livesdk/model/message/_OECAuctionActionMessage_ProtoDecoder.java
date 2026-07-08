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
public final class _OECAuctionActionMessage_ProtoDecoder implements C0IMD<OECAuctionActionMessage> {
    @Override // X.C0IMD
    public final void LIZ(OECAuctionActionMessage oECAuctionActionMessage) {
        OECAuctionActionMessage oECAuctionActionMessage2 = oECAuctionActionMessage;
        CommonMessageData commonMessageData = oECAuctionActionMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (oECAuctionActionMessage2.auctionTrace == null) {
            oECAuctionActionMessage2.auctionTrace = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final OECAuctionActionMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        OECAuctionActionMessage oECAuctionActionMessage = new OECAuctionActionMessage();
        oECAuctionActionMessage.auctionTrace = new HashMap();
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
                                            oECAuctionActionMessage.auctionTrace.put(strLIZLLL, strLIZLLL2);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                oECAuctionActionMessage.timestamp = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            oECAuctionActionMessage.auctionConfig = _AuctionConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        oECAuctionActionMessage.actionType = c1516680pZS.LJIIJ();
                    }
                } else {
                    oECAuctionActionMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return oECAuctionActionMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OECAuctionActionMessage oECAuctionActionMessage, List list) {
    }
}
