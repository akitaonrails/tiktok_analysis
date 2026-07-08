package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EpiDecision_ProtoDecoder implements C0IMD<EpiDecision> {
    public static EpiDecision LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EpiDecision epiDecision = new EpiDecision();
        epiDecision.data = new HashMap();
        epiDecision.dataV2 = new HashMap();
        epiDecision.serverFeatures = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    String strLIZLLL = null;
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
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
                                        epiDecision.serverFeatures.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            long jLIZJ3 = c1516680pZS.LIZJ();
                            String strLIZLLL3 = null;
                            while (true) {
                                int iLJI3 = c1516680pZS.LJI();
                                if (iLJI3 == -1) {
                                    break;
                                }
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        strLIZLLL3 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            }
                            c1516680pZS.LJ(jLIZJ3);
                            if (strLIZLLL != null) {
                                if (strLIZLLL3 != null) {
                                    epiDecision.dataV2.put(strLIZLLL, strLIZLLL3);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        long jLIZJ4 = c1516680pZS.LIZJ();
                        String strLIZLLL4 = null;
                        while (true) {
                            int iLJI4 = c1516680pZS.LJI();
                            if (iLJI4 == -1) {
                                break;
                            }
                            if (iLJI4 != 1) {
                                if (iLJI4 == 2) {
                                    strLIZLLL4 = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        }
                        c1516680pZS.LJ(jLIZJ4);
                        if (strLIZLLL != null) {
                            if (strLIZLLL4 != null) {
                                epiDecision.data.put(strLIZLLL, strLIZLLL4);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    epiDecision.ts = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return epiDecision;
            }
        }
    }

    public static void LJ(EpiDecision epiDecision) {
        if (epiDecision.data == null) {
            epiDecision.data = new HashMap();
        }
        if (epiDecision.dataV2 == null) {
            epiDecision.dataV2 = new HashMap();
        }
        if (epiDecision.serverFeatures == null) {
            epiDecision.serverFeatures = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EpiDecision epiDecision) {
        LJ(epiDecision);
    }

    @Override // X.C0IMD
    public final EpiDecision LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EpiDecision epiDecision, List list) {
    }
}
