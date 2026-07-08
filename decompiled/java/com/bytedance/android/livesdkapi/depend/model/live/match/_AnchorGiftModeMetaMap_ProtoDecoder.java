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
public final class _AnchorGiftModeMetaMap_ProtoDecoder implements C0IMD<AnchorGiftModeMetaMap> {
    public static AnchorGiftModeMetaMap LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorGiftModeMetaMap anchorGiftModeMetaMap = new AnchorGiftModeMetaMap();
        anchorGiftModeMetaMap.anchorGiftModeMetas = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    GiftModeMetaList giftModeMetaListLIZLLL = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                giftModeMetaListLIZLLL = _GiftModeMetaList_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (lValueOf != null) {
                        if (giftModeMetaListLIZLLL != null) {
                            anchorGiftModeMetaMap.anchorGiftModeMetas.put(lValueOf, giftModeMetaListLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorGiftModeMetaMap;
            }
        }
    }

    public static void LJ(AnchorGiftModeMetaMap anchorGiftModeMetaMap) {
        Map<Long, GiftModeMetaList> map = anchorGiftModeMetaMap.anchorGiftModeMetas;
        if (map == null) {
            anchorGiftModeMetaMap.anchorGiftModeMetas = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, GiftModeMetaList>> it2 = anchorGiftModeMetaMap.anchorGiftModeMetas.entrySet().iterator();
        while (it2.hasNext()) {
            GiftModeMetaList value = it2.next().getValue();
            if (value != null) {
                _GiftModeMetaList_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorGiftModeMetaMap anchorGiftModeMetaMap) {
        LJ(anchorGiftModeMetaMap);
    }

    @Override // X.C0IMD
    public final AnchorGiftModeMetaMap LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorGiftModeMetaMap anchorGiftModeMetaMap, List list) {
    }
}
