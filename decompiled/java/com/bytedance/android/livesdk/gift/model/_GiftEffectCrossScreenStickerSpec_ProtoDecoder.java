package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftEffectCrossScreenStickerSpec_ProtoDecoder implements C0IMD<GiftEffectCrossScreenStickerSpec> {
    public static GiftEffectCrossScreenStickerSpec LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec = new GiftEffectCrossScreenStickerSpec();
        giftEffectCrossScreenStickerSpec.singleActionAssetIds = new HashMap();
        giftEffectCrossScreenStickerSpec.actionAssetIds = new HashMap();
        giftEffectCrossScreenStickerSpec.reactionAssetIds = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Long lValueOf = null;
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            Integer numValueOf = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 == -1) {
                                    break;
                                }
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            }
                            c1516680pZS.LJ(jLIZJ2);
                            if (lValueOf != null) {
                                if (numValueOf != null) {
                                    giftEffectCrossScreenStickerSpec.reactionAssetIds.put(lValueOf, numValueOf);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        Integer numValueOf2 = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 == -1) {
                                break;
                            }
                            if (iLJI3 != 1) {
                                if (iLJI3 == 2) {
                                    numValueOf2 = Integer.valueOf(c1516680pZS.LJIIJ());
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ3);
                        if (lValueOf != null) {
                            if (numValueOf2 != null) {
                                giftEffectCrossScreenStickerSpec.actionAssetIds.put(lValueOf, numValueOf2);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    long jLIZJ4 = c1516680pZS.LIZJ();
                    Integer numValueOf3 = null;
                    while (true) {
                        int iLJI4 = c1516680pZS.LJI();
                        if (iLJI4 == -1) {
                            break;
                        }
                        if (iLJI4 != 1) {
                            if (iLJI4 == 2) {
                                numValueOf3 = Integer.valueOf(c1516680pZS.LJIIJ());
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ4);
                    if (lValueOf != null) {
                        if (numValueOf3 != null) {
                            giftEffectCrossScreenStickerSpec.singleActionAssetIds.put(lValueOf, numValueOf3);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftEffectCrossScreenStickerSpec;
            }
        }
    }

    public static void LJ(GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec) {
        if (giftEffectCrossScreenStickerSpec.singleActionAssetIds == null) {
            giftEffectCrossScreenStickerSpec.singleActionAssetIds = new HashMap();
        }
        if (giftEffectCrossScreenStickerSpec.actionAssetIds == null) {
            giftEffectCrossScreenStickerSpec.actionAssetIds = new HashMap();
        }
        if (giftEffectCrossScreenStickerSpec.reactionAssetIds == null) {
            giftEffectCrossScreenStickerSpec.reactionAssetIds = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec) {
        LJ(giftEffectCrossScreenStickerSpec);
    }

    @Override // X.C0IMD
    public final GiftEffectCrossScreenStickerSpec LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec, List list) {
    }
}
