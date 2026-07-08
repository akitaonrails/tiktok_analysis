package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _OecLiveShoppingMessageV2_ProtoDecoder implements C0IMD<OecLiveShoppingMessageV2> {
    public static OecLiveShoppingMessageV2 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OecLiveShoppingMessageV2 oecLiveShoppingMessageV2 = new OecLiveShoppingMessageV2();
        oecLiveShoppingMessageV2.actions = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 10) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            oecLiveShoppingMessageV2.msgMeta = _MsgMeta_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        oecLiveShoppingMessageV2.commerceInfo = _CommerceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    EcomLiveElementActions ecomLiveElementActionsLIZLLL = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                ecomLiveElementActionsLIZLLL = _EcomLiveElementActions_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (lValueOf != null) {
                        if (ecomLiveElementActionsLIZLLL != null) {
                            oecLiveShoppingMessageV2.actions.put(lValueOf, ecomLiveElementActionsLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return oecLiveShoppingMessageV2;
            }
        }
    }

    public static void LJ(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2) {
        Map<Long, EcomLiveElementActions> map = oecLiveShoppingMessageV2.actions;
        if (map == null) {
            oecLiveShoppingMessageV2.actions = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, EcomLiveElementActions>> it2 = oecLiveShoppingMessageV2.actions.entrySet().iterator();
            while (it2.hasNext()) {
                EcomLiveElementActions value = it2.next().getValue();
                if (value != null) {
                    _EcomLiveElementActions_ProtoDecoder.LJ(value);
                }
            }
        }
        CommerceInfo commerceInfo = oecLiveShoppingMessageV2.commerceInfo;
        if (commerceInfo != null) {
            _CommerceInfo_ProtoDecoder.LJ(commerceInfo);
        }
        MsgMeta msgMeta = oecLiveShoppingMessageV2.msgMeta;
        if (msgMeta != null && msgMeta.reasons == null) {
            msgMeta.reasons = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(OecLiveShoppingMessageV2 oecLiveShoppingMessageV2) {
        LJ(oecLiveShoppingMessageV2);
    }

    @Override // X.C0IMD
    public final OecLiveShoppingMessageV2 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OecLiveShoppingMessageV2 oecLiveShoppingMessageV2, List list) {
    }
}
