package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorGiftModeMap_ProtoDecoder implements C0IMD<AnchorGiftModeMap> {
    public static AnchorGiftModeMap LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorGiftModeMap anchorGiftModeMap = new AnchorGiftModeMap();
        anchorGiftModeMap.anchorGiftModes = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    GiftModeList giftModeListLIZLLL = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                giftModeListLIZLLL = _GiftModeList_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (lValueOf != null) {
                        if (giftModeListLIZLLL != null) {
                            anchorGiftModeMap.anchorGiftModes.put(lValueOf, giftModeListLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorGiftModeMap;
            }
        }
    }

    public static void LJ(AnchorGiftModeMap anchorGiftModeMap) {
        Map<Long, GiftModeList> map = anchorGiftModeMap.anchorGiftModes;
        if (map == null) {
            anchorGiftModeMap.anchorGiftModes = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, GiftModeList>> it2 = anchorGiftModeMap.anchorGiftModes.entrySet().iterator();
        while (it2.hasNext()) {
            GiftModeList value = it2.next().getValue();
            if (value != null) {
                _GiftModeList_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorGiftModeMap anchorGiftModeMap) {
        LJ(anchorGiftModeMap);
    }

    @Override // X.C0IMD
    public final AnchorGiftModeMap LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorGiftModeMap anchorGiftModeMap, List list) {
    }
}
