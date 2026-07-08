package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TextHeaderMaterialInfo_ProtoDecoder implements C0IMD<TextHeaderMaterialInfo> {
    public static TextHeaderMaterialInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TextHeaderMaterialInfo textHeaderMaterialInfo = new TextHeaderMaterialInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                textHeaderMaterialInfo.color = c1516680pZS.LJIIJ();
                            }
                        } else {
                            textHeaderMaterialInfo.fontName = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        textHeaderMaterialInfo.stroke = c1516680pZS.LJIIJ();
                    }
                } else {
                    textHeaderMaterialInfo.text = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return textHeaderMaterialInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final TextHeaderMaterialInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TextHeaderMaterialInfo textHeaderMaterialInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextHeaderMaterialInfo textHeaderMaterialInfo, List list) {
    }
}
