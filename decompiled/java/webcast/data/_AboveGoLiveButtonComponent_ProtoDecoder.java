package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _AboveGoLiveButtonComponent_ProtoDecoder implements C0IMD<AboveGoLiveButtonComponent> {
    public static AboveGoLiveButtonComponent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AboveGoLiveButtonComponent aboveGoLiveButtonComponent = new AboveGoLiveButtonComponent();
        aboveGoLiveButtonComponent.extra = new HashMap();
        aboveGoLiveButtonComponent.trackExtra = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            String strLIZLLL = null;
                            if (iLJI != 254) {
                                if (iLJI != 255) {
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
                                            aboveGoLiveButtonComponent.trackExtra.put(strLIZLLL, strLIZLLL2);
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
                                        aboveGoLiveButtonComponent.extra.put(strLIZLLL, strLIZLLL3);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            aboveGoLiveButtonComponent.text = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        aboveGoLiveButtonComponent.tuxUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    aboveGoLiveButtonComponent.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return aboveGoLiveButtonComponent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AboveGoLiveButtonComponent aboveGoLiveButtonComponent) {
        AboveGoLiveButtonComponent aboveGoLiveButtonComponent2 = aboveGoLiveButtonComponent;
        if (aboveGoLiveButtonComponent2.extra == null) {
            aboveGoLiveButtonComponent2.extra = new HashMap();
        }
        if (aboveGoLiveButtonComponent2.trackExtra == null) {
            aboveGoLiveButtonComponent2.trackExtra = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final AboveGoLiveButtonComponent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AboveGoLiveButtonComponent aboveGoLiveButtonComponent, List list) {
    }
}
