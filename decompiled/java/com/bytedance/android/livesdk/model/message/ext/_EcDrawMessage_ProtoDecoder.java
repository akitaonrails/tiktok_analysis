package com.bytedance.android.livesdk.model.message.ext;

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
public final class _EcDrawMessage_ProtoDecoder implements C0IMD<EcDrawMessage> {
    @Override // X.C0IMD
    public final void LIZ(EcDrawMessage ecDrawMessage) {
        ImageModel imageModel;
        EcDrawMessage ecDrawMessage2 = ecDrawMessage;
        CommonMessageData commonMessageData = ecDrawMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        EcDrawEntity ecDrawEntity = ecDrawMessage2.entity;
        if (ecDrawEntity != null && (imageModel = ecDrawEntity.incentiveImage) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final EcDrawMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EcDrawMessage ecDrawMessage = new EcDrawMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        ecDrawMessage.entity = _EcDrawEntity_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    ecDrawMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ecDrawMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcDrawMessage ecDrawMessage, List list) {
    }
}
