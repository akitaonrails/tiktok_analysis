package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _OecLiveCreatorMessage_ProtoDecoder implements C0IMD<OecLiveCreatorMessage> {
    @Override // X.C0IMD
    public final void LIZ(OecLiveCreatorMessage oecLiveCreatorMessage) {
        AuctionConfigV2 auctionConfigV2;
        SurpriseSet surpriseSet;
        OecLiveCreatorMessage oecLiveCreatorMessage2 = oecLiveCreatorMessage;
        CommonMessageData commonMessageData = oecLiveCreatorMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Map<Integer, OecLiveCreatorAction> map = oecLiveCreatorMessage2.actionMap;
        if (map == null) {
            oecLiveCreatorMessage2.actionMap = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Integer, OecLiveCreatorAction>> it2 = oecLiveCreatorMessage2.actionMap.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
        OecLiveCreatorMessageData oecLiveCreatorMessageData = oecLiveCreatorMessage2.data;
        if (oecLiveCreatorMessageData != null && (auctionConfigV2 = oecLiveCreatorMessageData.auctionConfig) != null && (surpriseSet = auctionConfigV2.surpriseSet) != null) {
            _SurpriseSet_ProtoDecoder.LJ(surpriseSet);
        }
        OecLiveCreatorMessageMeta oecLiveCreatorMessageMeta = oecLiveCreatorMessage2.meta;
        if (oecLiveCreatorMessageMeta != null && oecLiveCreatorMessageMeta.traceInfoMap == null) {
            oecLiveCreatorMessageMeta.traceInfoMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final OecLiveCreatorMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        OecLiveCreatorMessage oecLiveCreatorMessage = new OecLiveCreatorMessage();
        oecLiveCreatorMessage.actionMap = new HashMap();
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
                                oecLiveCreatorMessage.meta = _OecLiveCreatorMessageMeta_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            oecLiveCreatorMessage.data = _OecLiveCreatorMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Integer numValueOf = null;
                        OecLiveCreatorAction oecLiveCreatorActionLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    oecLiveCreatorActionLIZLLL = _OecLiveCreatorAction_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (numValueOf != null) {
                            if (oecLiveCreatorActionLIZLLL != null) {
                                oecLiveCreatorMessage.actionMap.put(numValueOf, oecLiveCreatorActionLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    oecLiveCreatorMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return oecLiveCreatorMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OecLiveCreatorMessage oecLiveCreatorMessage, List list) {
    }
}
