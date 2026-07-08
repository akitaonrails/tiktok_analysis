package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DrawGuessStartMessage_ProtoDecoder implements C0IMD<DrawGuessStartMessage> {
    @Override // X.C0IMD
    public final void LIZ(DrawGuessStartMessage drawGuessStartMessage) {
        ImageModel imageModel;
        DrawGuessStartMessage drawGuessStartMessage2 = drawGuessStartMessage;
        CommonMessageData commonMessageData = drawGuessStartMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        PictionaryInfo pictionaryInfo = drawGuessStartMessage2.data;
        if (pictionaryInfo != null && (imageModel = pictionaryInfo.drawUrl) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final DrawGuessStartMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        DrawGuessStartMessage drawGuessStartMessage = new DrawGuessStartMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        drawGuessStartMessage.data = _PictionaryInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    drawGuessStartMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return drawGuessStartMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DrawGuessStartMessage drawGuessStartMessage, List list) {
    }
}
