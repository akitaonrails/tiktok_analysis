package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AutoMatchBanner_ProtoDecoder implements C0IMD<AutoMatchBanner> {
    public static AutoMatchBanner LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AutoMatchBanner autoMatchBanner = new AutoMatchBanner();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            autoMatchBanner.buttonText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        autoMatchBanner.subGuideText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    autoMatchBanner.mainGuideText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return autoMatchBanner;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AutoMatchBanner autoMatchBanner) {
        AutoMatchBanner autoMatchBanner2 = autoMatchBanner;
        Text text = autoMatchBanner2.mainGuideText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = autoMatchBanner2.subGuideText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        Text text3 = autoMatchBanner2.buttonText;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
    }

    @Override // X.C0IMD
    public final AutoMatchBanner LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AutoMatchBanner autoMatchBanner, List list) {
    }
}
