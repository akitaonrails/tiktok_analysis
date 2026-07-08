package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AiClipWidget_ProtoDecoder implements C0IMD<AiClipWidget> {
    public static AiClipWidget LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AiClipWidget aiClipWidget = new AiClipWidget();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        aiClipWidget.text = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    aiClipWidget.iconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return aiClipWidget;
            }
        }
    }

    @Override // X.C0IMD
    public final AiClipWidget LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AiClipWidget aiClipWidget) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AiClipWidget aiClipWidget, List list) {
    }
}
