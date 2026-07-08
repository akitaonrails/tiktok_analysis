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
public final class _GiftModeMetaV2_ProtoDecoder implements C0IMD<GiftModeMetaV2> {
    public static GiftModeMetaV2 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftModeMetaV2 giftModeMetaV2 = new GiftModeMetaV2();
        giftModeMetaV2.anchorGiftModeMetaByType = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    AnchorGiftModeMetaMap anchorGiftModeMetaMapLIZLLL = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                anchorGiftModeMetaMapLIZLLL = _AnchorGiftModeMetaMap_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (lValueOf != null) {
                        if (anchorGiftModeMetaMapLIZLLL != null) {
                            giftModeMetaV2.anchorGiftModeMetaByType.put(lValueOf, anchorGiftModeMetaMapLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftModeMetaV2;
            }
        }
    }

    public static void LJ(GiftModeMetaV2 giftModeMetaV2) {
        Map<Long, AnchorGiftModeMetaMap> map = giftModeMetaV2.anchorGiftModeMetaByType;
        if (map == null) {
            giftModeMetaV2.anchorGiftModeMetaByType = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, AnchorGiftModeMetaMap>> it2 = giftModeMetaV2.anchorGiftModeMetaByType.entrySet().iterator();
        while (it2.hasNext()) {
            AnchorGiftModeMetaMap value = it2.next().getValue();
            if (value != null) {
                _AnchorGiftModeMetaMap_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftModeMetaV2 giftModeMetaV2) {
        LJ(giftModeMetaV2);
    }

    @Override // X.C0IMD
    public final GiftModeMetaV2 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftModeMetaV2 giftModeMetaV2, List list) {
    }
}
