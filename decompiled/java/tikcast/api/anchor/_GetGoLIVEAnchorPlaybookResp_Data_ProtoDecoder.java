package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import tikcast.api.anchor.GetGoLIVEAnchorPlaybookResp;

/* JADX INFO: loaded from: classes.dex */
public final class _GetGoLIVEAnchorPlaybookResp_Data_ProtoDecoder implements C0IMD<GetGoLIVEAnchorPlaybookResp.Data> {
    public static GetGoLIVEAnchorPlaybookResp.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetGoLIVEAnchorPlaybookResp.Data data = new GetGoLIVEAnchorPlaybookResp.Data();
        data.functionNameToParamsMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        data.playBookId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        data.playBookData = c1516680pZS.LJII();
                        break;
                    case 3:
                        data.playBookTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        data.jumpGoliveButtonText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        data.jumpViewPlaybooksButtonText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
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
                                        data.functionNameToParamsMap.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetGoLIVEAnchorPlaybookResp.Data data) {
        GetGoLIVEAnchorPlaybookResp.Data data2 = data;
        if (data2.functionNameToParamsMap == null) {
            data2.functionNameToParamsMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final GetGoLIVEAnchorPlaybookResp.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetGoLIVEAnchorPlaybookResp.Data data, List list) {
    }
}
