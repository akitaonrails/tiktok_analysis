package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _SecondaryBannerComponent_ProtoDecoder implements C0IMD<SecondaryBannerComponent> {
    public static SecondaryBannerComponent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SecondaryBannerComponent secondaryBannerComponent = new SecondaryBannerComponent();
        secondaryBannerComponent.extra = new HashMap();
        secondaryBannerComponent.trackExtra = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                String strLIZLLL = null;
                if (iLJI != 254) {
                    if (iLJI != 255) {
                        switch (iLJI) {
                            case 1:
                                secondaryBannerComponent.type = c1516680pZS.LJIIJ();
                                break;
                            case 2:
                                secondaryBannerComponent.schema = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 3:
                                secondaryBannerComponent.titleText = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 4:
                                secondaryBannerComponent.iconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 5:
                                secondaryBannerComponent.tux = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 6:
                                secondaryBannerComponent.hasCloseButton = C1516700pZU.LIZ(c1516680pZS);
                                break;
                            case 7:
                                secondaryBannerComponent.targetBottomItemType = c1516680pZS.LJIIJ();
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
                                        secondaryBannerComponent.trackExtra.put(strLIZLLL, strLIZLLL2);
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
                                    secondaryBannerComponent.extra.put(strLIZLLL, strLIZLLL3);
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
                return secondaryBannerComponent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SecondaryBannerComponent secondaryBannerComponent) {
        SecondaryBannerComponent secondaryBannerComponent2 = secondaryBannerComponent;
        if (secondaryBannerComponent2.extra == null) {
            secondaryBannerComponent2.extra = new HashMap();
        }
        if (secondaryBannerComponent2.trackExtra == null) {
            secondaryBannerComponent2.trackExtra = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final SecondaryBannerComponent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SecondaryBannerComponent secondaryBannerComponent, List list) {
    }
}
