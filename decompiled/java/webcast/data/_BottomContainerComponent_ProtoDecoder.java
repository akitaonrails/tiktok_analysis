package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _BottomContainerComponent_ProtoDecoder implements C0IMD<BottomContainerComponent> {
    public static BottomContainerComponent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BottomContainerComponent bottomContainerComponent = new BottomContainerComponent();
        bottomContainerComponent.children = new ArrayList();
        bottomContainerComponent.extra = new HashMap();
        bottomContainerComponent.trackExtra = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                String strLIZLLL = null;
                if (iLJI != 254) {
                    if (iLJI != 255) {
                        switch (iLJI) {
                            case 1:
                                bottomContainerComponent.type = c1516680pZS.LJIIJ();
                                break;
                            case 2:
                                bottomContainerComponent.schema = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 3:
                                bottomContainerComponent.tuxUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 4:
                                bottomContainerComponent.geckoKey = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 5:
                                bottomContainerComponent.iconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 6:
                                bottomContainerComponent.name = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 7:
                                bottomContainerComponent.showEventName = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 8:
                                bottomContainerComponent.clickEventName = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                bottomContainerComponent.children.add(LIZLLL(c1516680pZS));
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
                                        bottomContainerComponent.trackExtra.put(strLIZLLL, strLIZLLL2);
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
                                    bottomContainerComponent.extra.put(strLIZLLL, strLIZLLL3);
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
                return bottomContainerComponent;
            }
        }
    }

    public static void LJ(BottomContainerComponent bottomContainerComponent) {
        List<BottomContainerComponent> list = bottomContainerComponent.children;
        if (list == null) {
            bottomContainerComponent.children = new ArrayList();
        } else if (!list.isEmpty()) {
            for (BottomContainerComponent bottomContainerComponent2 : bottomContainerComponent.children) {
                if (bottomContainerComponent2 != null) {
                    LJ(bottomContainerComponent2);
                }
            }
        }
        if (bottomContainerComponent.extra == null) {
            bottomContainerComponent.extra = new HashMap();
        }
        if (bottomContainerComponent.trackExtra == null) {
            bottomContainerComponent.trackExtra = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BottomContainerComponent bottomContainerComponent) {
        LJ(bottomContainerComponent);
    }

    @Override // X.C0IMD
    public final BottomContainerComponent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BottomContainerComponent bottomContainerComponent, List list) {
    }
}
