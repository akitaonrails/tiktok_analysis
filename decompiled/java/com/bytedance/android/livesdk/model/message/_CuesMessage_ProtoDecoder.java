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
public final class _CuesMessage_ProtoDecoder implements C0IMD<CuesMessage> {
    public static CuesMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CuesMessage cuesMessage = new CuesMessage();
        cuesMessage.items = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        cuesMessage.items.add(_CueMessageItem_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    cuesMessage.topText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cuesMessage;
            }
        }
    }

    public static void LJ(CuesMessage cuesMessage) {
        Text text = cuesMessage.topText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        List<CueMessageItem> list = cuesMessage.items;
        if (list == null) {
            cuesMessage.items = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (CueMessageItem cueMessageItem : cuesMessage.items) {
            if (cueMessageItem != null) {
                _CueMessageItem_ProtoDecoder.LJ(cueMessageItem);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CuesMessage cuesMessage) {
        LJ(cuesMessage);
    }

    @Override // X.C0IMD
    public final CuesMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CuesMessage cuesMessage, List list) {
    }
}
