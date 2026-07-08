package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _TopRightContainerComponent_ProtoDecoder implements C0IMD<TopRightContainerComponent> {
    public static TopRightContainerComponent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopRightContainerComponent topRightContainerComponent = new TopRightContainerComponent();
        topRightContainerComponent.extra = new HashMap();
        topRightContainerComponent.trackExtra = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                String strLIZLLL = null;
                if (iLJI != 254) {
                    if (iLJI != 255) {
                        switch (iLJI) {
                            case 1:
                                topRightContainerComponent.type = c1516680pZS.LJIIJ();
                                break;
                            case 2:
                                topRightContainerComponent.schema = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 3:
                                topRightContainerComponent.tuxUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 4:
                                topRightContainerComponent.geckoKey = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 5:
                                topRightContainerComponent.iconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 6:
                                topRightContainerComponent.text = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL2 != null) {
                                        topRightContainerComponent.trackExtra.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    }
                } else {
                    long jLIZJ3 = c1516680pZS.LIZJ();
                    String strLIZLLL3 = null;
                    while (true) {
                        int iLJI3 = c1516680pZS.LJI();
                        if (iLJI3 != -1) {
                            if (iLJI3 != 1) {
                                if (iLJI3 == 2) {
                                    strLIZLLL3 = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            c1516680pZS.LJ(jLIZJ3);
                            if (strLIZLLL != null) {
                                if (strLIZLLL3 != null) {
                                    topRightContainerComponent.extra.put(strLIZLLL, strLIZLLL3);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topRightContainerComponent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TopRightContainerComponent topRightContainerComponent) {
        TopRightContainerComponent topRightContainerComponent2 = topRightContainerComponent;
        if (topRightContainerComponent2.extra == null) {
            topRightContainerComponent2.extra = new HashMap();
        }
        if (topRightContainerComponent2.trackExtra == null) {
            topRightContainerComponent2.trackExtra = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final TopRightContainerComponent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopRightContainerComponent topRightContainerComponent, List list) {
    }
}
