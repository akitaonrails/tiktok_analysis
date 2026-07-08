package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ContentPositionMessage_ProtoDecoder implements C0IMD<ContentPositionMessage> {
    public static ContentPositionMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ContentPositionMessage contentPositionMessage = new ContentPositionMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        contentPositionMessage.contentType = c1516680pZS.LJIIJ();
                    }
                } else {
                    contentPositionMessage.contentID = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return contentPositionMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final ContentPositionMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ContentPositionMessage contentPositionMessage) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ContentPositionMessage contentPositionMessage, List list) {
    }
}
