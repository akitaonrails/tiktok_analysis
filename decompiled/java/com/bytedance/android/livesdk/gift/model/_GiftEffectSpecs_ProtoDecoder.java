package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftEffectSpecs_ProtoDecoder implements C0IMD<GiftEffectSpecs> {
    public static GiftEffectSpecs LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftEffectSpecs giftEffectSpecs = new GiftEffectSpecs();
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
                                    giftEffectSpecs.streamEffectSpec = _GiftEffectStreamSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                giftEffectSpecs.serialSpec = _GiftEffectSerialSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            giftEffectSpecs.prefab = _GiftEffectPrefabSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        giftEffectSpecs.lynx = _GiftEffectLynxSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftEffectSpecs.crossScreenSticker = _GiftEffectCrossScreenStickerSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftEffectSpecs;
            }
        }
    }

    public static void LJ(GiftEffectSpecs giftEffectSpecs) {
        GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec = giftEffectSpecs.crossScreenSticker;
        if (giftEffectCrossScreenStickerSpec != null) {
            _GiftEffectCrossScreenStickerSpec_ProtoDecoder.LJ(giftEffectCrossScreenStickerSpec);
        }
        GiftEffectLynxSpec giftEffectLynxSpec = giftEffectSpecs.lynx;
        if (giftEffectLynxSpec != null && giftEffectLynxSpec.assetIds == null) {
            giftEffectLynxSpec.assetIds = new ArrayList();
        }
        GiftEffectPrefabSpec giftEffectPrefabSpec = giftEffectSpecs.prefab;
        if (giftEffectPrefabSpec != null && giftEffectPrefabSpec.prefabAssetIds == null) {
            giftEffectPrefabSpec.prefabAssetIds = new ArrayList();
        }
        GiftEffectSerialSpec giftEffectSerialSpec = giftEffectSpecs.serialSpec;
        if (giftEffectSerialSpec != null && giftEffectSerialSpec.serialAssetIds == null) {
            giftEffectSerialSpec.serialAssetIds = new ArrayList();
        }
        GiftEffectStreamSpec giftEffectStreamSpec = giftEffectSpecs.streamEffectSpec;
        if (giftEffectStreamSpec != null && giftEffectStreamSpec.extraAssetIds == null) {
            giftEffectStreamSpec.extraAssetIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftEffectSpecs giftEffectSpecs) {
        LJ(giftEffectSpecs);
    }

    @Override // X.C0IMD
    public final GiftEffectSpecs LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftEffectSpecs giftEffectSpecs, List list) {
    }
}
