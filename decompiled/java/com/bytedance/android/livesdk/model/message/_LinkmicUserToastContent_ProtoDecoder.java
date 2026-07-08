package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkmicUserToastContent_ProtoDecoder implements C0IMD<LinkmicUserToastContent> {
    public static LinkmicUserToastContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkmicUserToastContent linkmicUserToastContent = new LinkmicUserToastContent();
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
                                linkmicUserToastContent.leavedUserId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            linkmicUserToastContent.displayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        linkmicUserToastContent.roomId = Long.valueOf(c1516680pZS.LJIIJJI());
                    }
                } else {
                    linkmicUserToastContent.userId = Long.valueOf(c1516680pZS.LJIIJJI());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkmicUserToastContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkmicUserToastContent linkmicUserToastContent) {
        Text text = linkmicUserToastContent.displayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final LinkmicUserToastContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkmicUserToastContent linkmicUserToastContent, List list) {
    }
}
