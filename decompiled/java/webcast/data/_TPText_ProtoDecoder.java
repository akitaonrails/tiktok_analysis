package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TPText_ProtoDecoder implements C0IMD<TPText> {
    public static TPText LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TPText tPText = new TPText();
        tPText.pieces = new ArrayList();
        tPText.extra = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 10) {
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
                                            tPText.extra.put(strLIZLLL, strLIZLLL2);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                tPText.pieces.add(_TPTextPiece_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            tPText.format = _TPFormat_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        tPText.stringValue = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    tPText.key = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tPText;
            }
        }
    }

    public static void LJ(TPText tPText) {
        List<TPTextPiece> list = tPText.pieces;
        if (list == null) {
            tPText.pieces = new ArrayList();
        } else if (!list.isEmpty()) {
            for (TPTextPiece tPTextPiece : tPText.pieces) {
                if (tPTextPiece != null) {
                    _TPTextPiece_ProtoDecoder.LJ(tPTextPiece);
                }
            }
        }
        if (tPText.extra == null) {
            tPText.extra = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TPText tPText) {
        LJ(tPText);
    }

    @Override // X.C0IMD
    public final TPText LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TPText tPText, List list) {
    }
}
