package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubPinCard_Text_ProtoDecoder implements C0IMD<SubPinCard.Text> {
    public static SubPinCard.Text LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubPinCard.Text text = new SubPinCard.Text();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        text.content = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    text.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return text;
            }
        }
    }

    @Override // X.C0IMD
    public final SubPinCard.Text LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SubPinCard.Text text) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubPinCard.Text text, List list) {
    }
}
