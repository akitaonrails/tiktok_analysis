package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ConvertNoticeboardMaterialInfo_ProtoDecoder implements C0IMD<ConvertNoticeboardMaterialInfo> {
    public static ConvertNoticeboardMaterialInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = new ConvertNoticeboardMaterialInfo();
        convertNoticeboardMaterialInfo.starlingMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        convertNoticeboardMaterialInfo.backgroundImageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        convertNoticeboardMaterialInfo.coverImageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        convertNoticeboardMaterialInfo.configJsonUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        convertNoticeboardMaterialInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        convertNoticeboardMaterialInfo.textCharCount = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        convertNoticeboardMaterialInfo.textBoxCount = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
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
                                        convertNoticeboardMaterialInfo.starlingMap.put(strLIZLLL, strLIZLLL2);
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
                    case 8:
                        convertNoticeboardMaterialInfo.thumbCoverImageUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return convertNoticeboardMaterialInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo) {
        ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo2 = convertNoticeboardMaterialInfo;
        if (convertNoticeboardMaterialInfo2.starlingMap == null) {
            convertNoticeboardMaterialInfo2.starlingMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final ConvertNoticeboardMaterialInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo, List list) {
    }
}
