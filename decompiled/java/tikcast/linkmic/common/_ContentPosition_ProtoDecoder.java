package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore._MicPositionData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ContentPosition_ProtoDecoder implements C0IMD<ContentPosition> {
    public static ContentPosition LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ContentPosition contentPosition = new ContentPosition();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    contentPosition.startTimeNano = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                contentPosition.contentLinkmicID = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            contentPosition.pos = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        contentPosition.contentType = c1516680pZS.LJIIJ();
                    }
                } else {
                    contentPosition.contentID = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return contentPosition;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ContentPosition contentPosition) {
    }

    @Override // X.C0IMD
    public final ContentPosition LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ContentPosition contentPosition, List list) {
    }
}
