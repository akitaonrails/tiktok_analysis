package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.RivalsUpdateMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalsUpdateMessage_UpdatedRivals_StatusText_ProtoDecoder implements C0IMD<RivalsUpdateMessage.UpdatedRivals.StatusText> {
    public static RivalsUpdateMessage.UpdatedRivals.StatusText LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalsUpdateMessage.UpdatedRivals.StatusText statusText = new RivalsUpdateMessage.UpdatedRivals.StatusText();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        statusText.statusTextType = c1516680pZS.LJIIJ();
                    }
                } else {
                    statusText.statusText = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return statusText;
            }
        }
    }

    @Override // X.C0IMD
    public final RivalsUpdateMessage.UpdatedRivals.StatusText LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RivalsUpdateMessage.UpdatedRivals.StatusText statusText) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalsUpdateMessage.UpdatedRivals.StatusText statusText, List list) {
    }
}
