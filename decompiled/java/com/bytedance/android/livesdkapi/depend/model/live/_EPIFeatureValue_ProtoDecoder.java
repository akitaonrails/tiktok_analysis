package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EPIFeatureValue_ProtoDecoder implements C0IMD<EPIFeatureValue> {
    public static EPIFeatureValue LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EPIFeatureValue ePIFeatureValue = new EPIFeatureValue();
        ePIFeatureValue.intFeature = new HashMap();
        ePIFeatureValue.stringFeature = new HashMap();
        ePIFeatureValue.floatFeature = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                String strLIZLLL = null;
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            long jLIZJ2 = c1516680pZS.LIZJ();
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
                                    ePIFeatureValue.stringFeature.put(strLIZLLL, strLIZLLL2);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        Float fValueOf = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 == -1) {
                                break;
                            }
                            if (iLJI3 != 1) {
                                if (iLJI3 == 2) {
                                    fValueOf = Float.valueOf(Float.intBitsToFloat(c1516680pZS.LJIIIIZZ()));
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        }
                        c1516680pZS.LJ(jLIZJ3);
                        if (strLIZLLL != null) {
                            if (fValueOf != null) {
                                ePIFeatureValue.floatFeature.put(strLIZLLL, fValueOf);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    long jLIZJ4 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    while (true) {
                        int iLJI4 = c1516680pZS.LJI();
                        if (iLJI4 == -1) {
                            break;
                        }
                        if (iLJI4 != 1) {
                            if (iLJI4 == 2) {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        } else {
                            strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    }
                    c1516680pZS.LJ(jLIZJ4);
                    if (strLIZLLL != null) {
                        if (lValueOf != null) {
                            ePIFeatureValue.intFeature.put(strLIZLLL, lValueOf);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ePIFeatureValue;
            }
        }
    }

    public static void LJ(EPIFeatureValue ePIFeatureValue) {
        if (ePIFeatureValue.intFeature == null) {
            ePIFeatureValue.intFeature = new HashMap();
        }
        if (ePIFeatureValue.floatFeature == null) {
            ePIFeatureValue.floatFeature = new HashMap();
        }
        if (ePIFeatureValue.stringFeature == null) {
            ePIFeatureValue.stringFeature = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EPIFeatureValue ePIFeatureValue) {
        LJ(ePIFeatureValue);
    }

    @Override // X.C0IMD
    public final EPIFeatureValue LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EPIFeatureValue ePIFeatureValue, List list) {
    }
}
