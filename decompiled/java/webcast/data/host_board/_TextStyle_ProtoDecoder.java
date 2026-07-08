package webcast.data.host_board;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TextStyle_ProtoDecoder implements C0IMD<TextStyle> {
    public static TextStyle LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TextStyle textStyle = new TextStyle();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        textStyle.textColor = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    textStyle.textFont = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return textStyle;
            }
        }
    }

    @Override // X.C0IMD
    public final TextStyle LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TextStyle textStyle) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextStyle textStyle, List list) {
    }
}
