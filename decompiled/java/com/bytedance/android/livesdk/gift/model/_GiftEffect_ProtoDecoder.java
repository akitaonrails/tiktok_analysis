package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftEffect_ProtoDecoder implements C0IMD<GiftEffect> {
    public static GiftEffect LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftEffect giftEffect = new GiftEffect();
        giftEffect.assets = new ArrayList();
        giftEffect.eventTrackingParams = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
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
                                    giftEffect.eventTrackingParams.put(strLIZLLL, strLIZLLL2);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        giftEffect.specs = _GiftEffectSpecs_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftEffect.assets.add(_AssetsModel_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftEffect;
            }
        }
    }

    public static void LJ(GiftEffect giftEffect) {
        List<AssetsModel> list = giftEffect.assets;
        if (list == null) {
            giftEffect.assets = new ArrayList();
        } else if (!list.isEmpty()) {
            for (AssetsModel assetsModel : giftEffect.assets) {
                if (assetsModel != null) {
                    _AssetsModel_ProtoDecoder.LJ(assetsModel);
                }
            }
        }
        GiftEffectSpecs giftEffectSpecs = giftEffect.specs;
        if (giftEffectSpecs != null) {
            _GiftEffectSpecs_ProtoDecoder.LJ(giftEffectSpecs);
        }
        if (giftEffect.eventTrackingParams == null) {
            giftEffect.eventTrackingParams = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftEffect giftEffect) {
        LJ(giftEffect);
    }

    @Override // X.C0IMD
    public final GiftEffect LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftEffect giftEffect, List list) {
    }
}
