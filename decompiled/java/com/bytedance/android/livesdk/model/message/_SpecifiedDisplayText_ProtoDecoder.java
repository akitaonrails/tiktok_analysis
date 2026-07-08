package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SpecifiedDisplayText_ProtoDecoder implements C0IMD<SpecifiedDisplayText> {
    public static SpecifiedDisplayText LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SpecifiedDisplayText specifiedDisplayText = new SpecifiedDisplayText();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        specifiedDisplayText.displayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    specifiedDisplayText.uid = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return specifiedDisplayText;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SpecifiedDisplayText specifiedDisplayText) {
        Text text = specifiedDisplayText.displayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final SpecifiedDisplayText LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SpecifiedDisplayText specifiedDisplayText, List list) {
    }
}
