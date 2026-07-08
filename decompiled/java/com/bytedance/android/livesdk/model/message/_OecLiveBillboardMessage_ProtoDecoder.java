package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OecLiveBillboardMessage_ProtoDecoder implements C0IMD<OecLiveBillboardMessage> {
    @Override // X.C0IMD
    public final void LIZ(OecLiveBillboardMessage oecLiveBillboardMessage) {
        OecLiveBillboardMessage oecLiveBillboardMessage2 = oecLiveBillboardMessage;
        CommonMessageData commonMessageData = oecLiveBillboardMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<Billboard> list = oecLiveBillboardMessage2.currentDisplayBillboards;
        if (list == null) {
            oecLiveBillboardMessage2.currentDisplayBillboards = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Billboard billboard : oecLiveBillboardMessage2.currentDisplayBillboards) {
                if (billboard != null) {
                    _Billboard_ProtoDecoder.LJ(billboard);
                }
            }
        }
        List<Billboard> list2 = oecLiveBillboardMessage2.operatedBillboards;
        if (list2 == null) {
            oecLiveBillboardMessage2.operatedBillboards = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (Billboard billboard2 : oecLiveBillboardMessage2.operatedBillboards) {
                if (billboard2 != null) {
                    _Billboard_ProtoDecoder.LJ(billboard2);
                }
            }
        }
        if (oecLiveBillboardMessage2.daInfo == null) {
            oecLiveBillboardMessage2.daInfo = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final OecLiveBillboardMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        OecLiveBillboardMessage oecLiveBillboardMessage = new OecLiveBillboardMessage();
        oecLiveBillboardMessage.daInfo = new HashMap();
        oecLiveBillboardMessage.operatedBillboards = new ArrayList();
        oecLiveBillboardMessage.currentDisplayBillboards = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        oecLiveBillboardMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        oecLiveBillboardMessage.actionType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        oecLiveBillboardMessage.triggerSource = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        oecLiveBillboardMessage.bornTimeMs = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        oecLiveBillboardMessage.currentDisplayBillboards.add(_Billboard_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        oecLiveBillboardMessage.operatedBillboards.add(_Billboard_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
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
                                        oecLiveBillboardMessage.daInfo.put(strLIZLLL, strLIZLLL2);
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
                    case 8:
                        oecLiveBillboardMessage.popUp = _PopUp_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        oecLiveBillboardMessage.needRequestRefresh = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        oecLiveBillboardMessage.dispersionInfo = _DispersionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return oecLiveBillboardMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OecLiveBillboardMessage oecLiveBillboardMessage, List list) {
    }
}
