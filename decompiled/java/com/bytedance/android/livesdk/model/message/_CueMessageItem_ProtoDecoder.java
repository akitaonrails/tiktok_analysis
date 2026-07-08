package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CueMessageItem_ProtoDecoder implements C0IMD<CueMessageItem> {
    public static CueMessageItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CueMessageItem cueMessageItem = new CueMessageItem();
        cueMessageItem.richParams = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        cueMessageItem.richParams.add(_CueMessageRichParam_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    cueMessageItem.itemText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cueMessageItem;
            }
        }
    }

    public static void LJ(CueMessageItem cueMessageItem) {
        Text text = cueMessageItem.itemText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        List<CueMessageRichParam> list = cueMessageItem.richParams;
        if (list == null) {
            cueMessageItem.richParams = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (CueMessageRichParam cueMessageRichParam : cueMessageItem.richParams) {
            if (cueMessageRichParam != null) {
                _CueMessageRichParam_ProtoDecoder.LJ(cueMessageRichParam);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CueMessageItem cueMessageItem) {
        LJ(cueMessageItem);
    }

    @Override // X.C0IMD
    public final CueMessageItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CueMessageItem cueMessageItem, List list) {
    }
}
